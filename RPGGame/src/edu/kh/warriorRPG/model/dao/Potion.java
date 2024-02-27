package edu.kh.warriorRPG.model.dao;

public class Potion {

	private String name;
	private int price;
	private int heal; // 치유량
	
	public Potion() {}

	public Potion(String name, int price, int heal) {
		super();
		this.name = name;
		this.price = price;
		this.heal = heal;
	}

	
	@Override
	public String toString() {
		return name + "[hp+" + heal + "] / " + price + "원";
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getHeal() {
		return heal;
	}
	public void setHeal(int heal) {
		this.heal = heal;
	}
	
}