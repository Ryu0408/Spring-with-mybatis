package com.spring.myapp.board.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.myapp.board.vo.BoardVO;

public interface IBoardService {

	void writeBoard(String name, String title,  String content);
	List<BoardVO> getBoardList();
	BoardVO getBoardContent(int boardnum);

}
