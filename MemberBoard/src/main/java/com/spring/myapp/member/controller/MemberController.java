package com.spring.myapp.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.myapp.member.service.IMemberService;

@Controller
public class MemberController {

	@Autowired
	IMemberService memberService;
}
