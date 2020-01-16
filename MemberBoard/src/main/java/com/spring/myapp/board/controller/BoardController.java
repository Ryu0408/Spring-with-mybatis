package com.spring.myapp.board.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.myapp.board.service.IBoardService;
import com.spring.myapp.board.vo.BoardVO;

@Controller
public class BoardController {

	@Autowired
	IBoardService boardService;
	
	
	@RequestMapping(value="board/write", method=RequestMethod.GET)
	public String writeBoard(HttpSession session, Model model) {
		if(session.getAttribute("id")==null) {
			return "redirect:../";
		}
		String id = (String)session.getAttribute("id");
		String name = (String)session.getAttribute("name");
		model.addAttribute("name",name);
		model.addAttribute("id",id);
		return "board/board_form";
	}
	
	@RequestMapping(value="board/write", method=RequestMethod.POST)
	public String writeBoard(String name, String title, String content, Model model) {
		boardService.writeBoard(name, title, content);
		return "redirect:../";
	}
	
	@RequestMapping(value="board/list", method=RequestMethod.GET)
	public String showBoard(HttpSession session, Model model) {
		if(session.getAttribute("id")==null) {
			return "redirect:../";
		}
		List<BoardVO> boards = boardService.getBoardList();
		model.addAttribute("boards", boards);
		return "board/board_list";
	}
}
