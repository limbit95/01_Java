package edu.kh.warriorRPG.model.dao;

import java.io.Serializable;

public class Weapon implements Serializable {
	
	private String name;
	private String kind;
	private int attack;
	private int avaliableLevel;
	private int price;
	
	public Weapon() {}

	public Weapon(String name, String kind, int attack, int avaliableLevel, int price) {
		super();
		this.name = name;
		this.kind = kind;
		this.attack = attack;
		this.avaliableLevel = avaliableLevel;
		this.price = price;
	}

	
	
	

	@Override
	public String toString() {
		return name + " " + kind + "[공격력+" + attack + "]" + " / " + avaliableLevel + "레벨 이상 사용 가능" + " / " + price + "원";
	}

	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getAvaliableLevel() {
		return avaliableLevel;
	}
	public void setAvaliableLevel(int avaliableLevel) {
		this.avaliableLevel = avaliableLevel;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}