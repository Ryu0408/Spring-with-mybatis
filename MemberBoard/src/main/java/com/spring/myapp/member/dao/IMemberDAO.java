package com.spring.myapp.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.myapp.member.vo.MemberVO;

public interface IMemberDAO {
	
	void insertMember(MemberVO member);
	List<MemberVO> selectAllMembers();
	MemberVO checkMemberId(@Param("id") String id);
	void deleteMember(@Param("id") String id, @Param("pw") String pw);
	void updateMember(MemberVO member);
}
