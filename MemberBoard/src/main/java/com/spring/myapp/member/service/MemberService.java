package com.spring.myapp.member.service;

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
}
