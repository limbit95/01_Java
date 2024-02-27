package edu.kh.warriorRPG.model.dao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Warrior implements Serializable {

	private String name; // 이름
	private int level; // 레벨
	private int exp; // 경험치
	private int hp; // 체력
	private int strength; // 공격력
	private Weapon attackEquip; // 장착 무기
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
		this.attackEquip = new Weapon("맨", "주먹", 3, 1, 0);
		this.stat = 0;
		this.potion = new TreeMap<String, Integer>();
		{
			potion.put("하급 물약", 3);
			potion.put("중급 물약", 0);
			potion.put("상급 물약", 0);
		}
		this.gold = 10;
	}

	// 골드 차감 메서드
	public boolean minusGold(int amount) {
		if(gold < amount) {
			return false;
		}
		
		gold -= amount;
		return true;
	}
	
	// 공격받은 수만큼 hp에서 차감 메서드
	public boolean minusHp(int attack) {
		if(hp < attack) {
			hp = 0;
			return false;
		}
		
		hp -= attack;
		return true;
	}
	

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("\n*** " +  name + "의 상태창 ***")).append("\n");
		sb.append(String.format("레벨 : " +  level)).append("\n");
		sb.append(String.format("경험치 : " +  exp)).append("\n");
		sb.append(String.format("체력 : " +  hp)).append("\n");
		sb.append(String.format("공격력 : " +  (strength + attackEquip.getAttack()))).append("\n");
		sb.append(String.format("장비(무기) : " +  attackEquip)).append("\n");
		sb.append(String.format("스탯포인트 : " +  stat)).append("\n");
		sb.append(String.format("골드 : " +  gold)).append("\n");
		sb.append(String.format("아이템(물약) : " +  potion)).append("\n");
		
		return sb.toString();
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
	public Weapon getAttackEquip() {
		return attackEquip;
	}
	public void setAttackEquip(Weapon attackEquip) {
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