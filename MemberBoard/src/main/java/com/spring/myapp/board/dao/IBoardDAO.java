package com.spring.myapp.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.myapp.board.vo.BoardVO;

public interface IBoardDAO {

	void writeBoard(@Param("name") String name, 
					@Param("title") String title, 
					@Param("content") String content);
	List<BoardVO> getBoardList();
}
