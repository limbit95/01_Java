package com.hw2.model.dto;

public class Monkey extends Animal {

	public Monkey() {}
	
	public Monkey(String name) {
		super(name);
	}
	
	@Override
	public String sound() {
		return name + "가 우끼기 소리를 냅니다.";
	}
	
}