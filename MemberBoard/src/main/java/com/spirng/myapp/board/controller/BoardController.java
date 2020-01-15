package com.spirng.myapp.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spirng.myapp.board.service.IBoardService;

@Controller
public class BoardController {

	@Autowired
	IBoardService boardService;
	

	@RequestMapping(value="board/insert", method=RequestMethod.GET)
	public String memberJoin( Model model) {
		return "board/insert_form";
	}
}
