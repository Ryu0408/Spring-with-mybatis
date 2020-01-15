package com.spring.myapp.member.vo;

import java.sql.Timestamp;

public class MemberVO {

	private String id;
	private String pw;
	private String name;
	private String email;
	private String address;
	private Timestamp rdate;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Timestamp getRdate() {
		return rdate;
	}
	public void setRdate(Timestamp rdate) {
		this.rdate = rdate;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", rdate=" + rdate + "]";
	}
	
	
}
