package com.hw4.model.vo;

public class Member {

	private String userId; // 아이디
	private String userPw; // 비밀번호
	private String name; // 이름
	private int age; // 나이
	private char gender; // 성별
	private String email; // 이메일
	
	public Member() {}
	
	public Member(String userId, String userPw, String name, int age, char gender, String email) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	
	public String information() {
		return "";
	}
	
	
	
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}