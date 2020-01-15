package com.spring.myapp.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.myapp.member.service.IMemberService;
import com.spring.myapp.member.vo.MemberVO;

@Controller
public class MemberController {

	@Autowired
	IMemberService memberService;
	
	@RequestMapping(value="member/join", method=RequestMethod.GET)
	public String memberJoin(Model model) {
		return "member/join_form";
	}
	
	@RequestMapping(value="member/join", method=RequestMethod.POST)
	public String memberJoin(MemberVO member,Model model) {
		MemberVO check = memberService.checkMemberId(member.getId());
		if(check == null) {
			memberService.insertMember(member);
			model.addAttribute("id", member.getId());
			model.addAttribute("name",member.getName());
			return "member/join_ok";
		}else {
			model.addAttribute("id",member.getId());
			return "member/join_fail";
		}
	}
	
	@RequestMapping(value="member/list", method=RequestMethod.GET)
	public String getAllMemberList(Model model) {
		List<MemberVO> members = memberService.selectAllMembers();
		model.addAttribute("members", members);
		return "member/member_list";
	}
}
