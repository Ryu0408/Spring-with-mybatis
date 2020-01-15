package com.spring.myapp.member.dao;

import java.util.List;

import com.spring.myapp.member.vo.MemberVO;

public interface IMemberDAO {
	
	void insertMember(MemberVO member);
	List<MemberVO> selectAllMembers();
}
