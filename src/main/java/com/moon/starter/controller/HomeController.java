package com.moon.starter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moon.starter.dto.Member;
import com.moon.starter.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {

	@Autowired
	MemberService memberService;

	@RequestMapping("/home/main")
//	public String showMain(HttpSession session, Model model) {
//		
//		long loginedMemberId = 0;
//		// 로그인 했는지 체크하고 
//		if(session.getAttribute("loginedMemberId")!=null) {
//			loginedMemberId = (long)session.getAttribute("loginedMemberId");
//		}
//		//해당 로그인 회원의 번호로 DB에서 회원의 전체 정보를 불러오는 작업
//		// 이걸 거의 모든 액션에서 해줘야한다.... -> 인터셉터 도입 
//		//인터셉터는 매 액션 실행 전에 실행이 되어,request 객체에 필요한 정보를 주입해 준다. 
//		
//		Member loginedMember = memberService.getOne(loginedMemberId);
//		model.addAttribute("loginedMember", loginedMember);
//		
//		log.info("loginedMember : "+loginedMember);
//		
//		
//		return "home/main";
//	}
	public String showMain(Model model) {
		return "home/main";
	}

	@RequestMapping("/")
	public String showMain2() {
		return "redirect:/home/main";
	}

}
