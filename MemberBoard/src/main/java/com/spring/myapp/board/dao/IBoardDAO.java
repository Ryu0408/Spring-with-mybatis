package com.spring.myapp.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.myapp.board.vo.BoardVO;

public interface IBoardDAO {

	void writeBoard(@Param("name") String name, 
					@Param("title") String title, 
					@Param("content") String content);
	List<BoardVO> getBoardList();
	BoardVO getBoardContent(@Param("boardnum") int boardnum);
	void deleteBoard(@Param("boardnum") int boardnum);
	void updateBoard(BoardVO board);
}
