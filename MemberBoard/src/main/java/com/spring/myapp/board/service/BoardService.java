package com.spring.myapp.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.myapp.board.dao.IBoardDAO;

@Service
public class BoardService implements IBoardService {

	@Autowired
	IBoardDAO boardDAO;

	@Override
	public void writeBoard(String name, String title, String content) {
		boardDAO.writeBoard(name, title, content);
		
	}
}
