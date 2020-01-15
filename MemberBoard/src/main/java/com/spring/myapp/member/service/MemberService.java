package com.spring.myapp.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.myapp.member.dao.IMemberDAO;
import com.spring.myapp.member.vo.MemberVO;

@Service
public class MemberService implements IMemberService {

	@Autowired
	IMemberDAO memberDAO;

	@Override
	public void insertMember(MemberVO member) {
		memberDAO.insertMember(member);
	}

	@Override
	public List<MemberVO> selectAllMembers() {
		return memberDAO.selectAllMembers();
	}

	@Override
	public MemberVO checkMemberId(String id) {
		return memberDAO.checkMemberId(id);
	}
}
