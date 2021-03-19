package com.moon.starter.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moon.starter.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	
	@RequestMapping("/member/join")
	public String memberJoin() {
		
		return "member/join";
	}
	
	@RequestMapping("/member/doJoin")
	@ResponseBody
	public String doJoin(@RequestParam Map<String,Object>param, Model model) {
		
		//로그인 ID의 중복성 체크 
		Map<String, Object>checkLoginIdDupRs = memberService.checkLoginIdDup((String)param.get("loginId"));
		
		if(((String)checkLoginIdDupRs.get("resultCode")).startsWith("F-")) {
			model.addAttribute("alertMsg", checkLoginIdDupRs.get("msg"));
			model.addAttribute("historyBack",true);
			
			return "common/redirect";
		}
		Map<String, Object>joinRs = memberService.join(param);
		
		if(((String)joinRs.get("resultCode")).startsWith("F-")) {
			model.addAttribute("alertMsg", joinRs.get("msg"));
			model.addAttribute("historyBack",true);
			
			return "common/redirect";
		}
		model.addAttribute("alertMsg", joinRs.get("msg"));
		model.addAttribute("redirectUrl","/member/login");
		
	
		
		return "common/redirect";
	}

}
