package com.spirng.myapp.board.vo;

import java.sql.Timestamp;

public class BoardVO {
	
	private int boardnum;
	private String name;
	private String title;
	private String content;
	private Timestamp bdate;
	private int hit;
	
	public BoardVO() {
	}
	
	public BoardVO(int boardnum, String name, String title, String content, Timestamp bdate, int hit) {
		super();
		this.boardnum = boardnum;
		this.name = name;
		this.title = title;
		this.content = content;
		this.bdate = bdate;
		this.hit = hit;
	}
	
	public int getBoardnum() {
		return boardnum;
	}
	public void setBoardnum(int boardnum) {
		this.boardnum = boardnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getBdate() {
		return bdate;
	}
	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	@Override
	public String toString() {
		return "BoardVO [boardnum=" + boardnum + ", name=" + name + ", title=" + title + ", content=" + content
				+ ", bdate=" + bdate + ", hit=" + hit + "]";
	}
	
	
	
}
