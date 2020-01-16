package com.spring.myapp.board.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	@RequestMapping(value="board/detail/{boardnum}")
	public String showBoardDetail(
			@PathVariable int boardnum,
			HttpSession session, Model model) {
		if(session.getAttribute("id")==null) {
			return "redirect:../";
		}
		BoardVO detail = boardService.getBoardContent(boardnum);
		if(detail == null) {
			return "redirect:../list";
		}
		model.addAttribute("detail", detail);
		return "board/board_detail";
	}

	@RequestMapping(value="board/delete/{boardnum}")
	public String boardDelete(
			@PathVariable int boardnum,
			HttpSession session, Model model) {
		if(session.getAttribute("id")==null) {
			return "redirect:../";
		}
		BoardVO board = boardService.getBoardContent(boardnum);
		String uname = (String)session.getAttribute("name");
		if(uname.contentEquals(board.getName())) {
			boardService.deleteBoard(boardnum);
		}
		return "redirect:../list";
	}
	
	@RequestMapping(value="/board/update/{boardnum}", method = RequestMethod.GET)
	public String updateContent(@PathVariable int boardnum, HttpSession session, Model model) {
		if(session.getAttribute("id")==null) {
			return "redirect:../";
		}
		BoardVO board = boardService.getBoardContent(boardnum);
		String uname = (String)session.getAttribute("name");
		if(!uname.equals(board.getName())) {
			return "redirect:../";
		}
		model.addAttribute("board",board);
		return "board/board_update";
	}
	
	@RequestMapping(value="/board/update/", method = RequestMethod.POST)
	public String updateContent(BoardVO board, 
			HttpSession session, Model model) {
		if(session.getAttribute("id")==null) {
			return "redirect:../";
		}
		String uname = (String)session.getAttribute("name");
		if(!uname.equals(board.getName())) {
			return "redirect:../";
		}
		boardService.updateBoard(board);
		return "redirect:../list";
	}
	
}
