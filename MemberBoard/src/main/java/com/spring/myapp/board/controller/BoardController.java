package com.spring.myapp.board.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.myapp.board.service.IBoardService;

@Controller
public class BoardController {

	@Autowired
	IBoardService boardService;
	
	
	@RequestMapping(value="board/write", method=RequestMethod.GET)
	public String writeBoard(HttpSession session, Model model) {
		System.out.println("되나?");
		if(session.getAttribute("id")==null) {
			return "redirect../";
		}
		String id = (String)session.getAttribute("id");
		String name = (String)session.getAttribute("name");
		model.addAttribute("name",name);
		model.addAttribute("id",id);
		return "board/board_form";
	}
}
