package com.moon.starter.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.moon.starter.dto.Member;

@Mapper
public interface MemberDao {

	public int getLoiginIdDupCount(String loginId);

	public void join(Map<String, Object> param);

	public Member getMatchedOne(String loginId, String loginPw);

	public Member getOne(long loginedMemberId);

}
