package com.spring.myapp.board.dao;

import org.apache.ibatis.annotations.Param;

public interface IBoardDAO {

	void writeBoard(@Param("name") String name, 
					@Param("title") String title, 
					@Param("content") String content);
}
