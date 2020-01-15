package com.spring.myapp.member.service;

import java.util.List;

import com.spring.myapp.member.vo.MemberVO;

public interface IMemberService {

	
	void insertMember(MemberVO member);
	List<MemberVO> selectAllMembers();

}
