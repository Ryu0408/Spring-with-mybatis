package com.spirng.myapp.board.service;

import org.apache.ibatis.annotations.Param;

public interface IBoardService {

	void writeBoard(String name, String title,  String content);
}
