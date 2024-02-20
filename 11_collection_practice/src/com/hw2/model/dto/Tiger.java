package com.hw2.model.dto;

public class Tiger extends Animal {
	
	public Tiger() {}
	
	public Tiger(String name) {
		super(name);
	}
	
	@Override
	public String sound() {
		return name + "가 어흥하며 포효합니다.";
	}
	
}