package edu.kh.warriorRPG.model.dao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Warrior implements Serializable {

	private String name; // 이름
	private int level; // 레벨
	private int exp; // 경험치
	private int hp; // 체력
	private int strength; // 공격력
	private String attackEquip; // 장착 무기
	private int stat; // 스탯포인트
	private Map<String, Integer> potion; // 물약 주머니
	private int gold; // 돈
	
	public Warrior() {}
	
	public Warrior(String name) {
		super();
		this.name = name;
		this.level = 1;
		this.exp = 0;
		this.hp = 100;
		this.strength = 5;
		this.attackEquip = "맨손";
		this.stat = 0;
		this.potion = new HashMap<String, Integer>();
		this.gold = 0;
		{
			potion.put("하급 물약", 3);
			potion.put("중급 물약", 0);
			potion.put("상급 물약", 0);
		}
	}

	

	@Override
	public String toString() {
		return "Warrior [name=" + name + ", level=" + level + ", exp=" + exp + ", hp=" + hp + ", strength=" + strength
				+ ", attackEquip=" + attackEquip + ", stat=" + stat + ", potion=" + potion + ", gold=" + gold + "]";
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public String getAttackEquip() {
		return attackEquip;
	}
	public void setAttackEquip(String attackEquip) {
		this.attackEquip = attackEquip;
	}
	public int getStat() {
		return stat;
	}
	public void setStat(int stat) {
		this.stat = stat;
	}
	public Map<String, Integer> getPotion() {
		return potion;
	}
	public void setPotion(Map<String, Integer> potion) {
		this.potion = potion;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	
}