package edu.kh.rpggame.model.dao;

public class Character {

	private String name; // 이름
	private String job; // 직업
	private int level; // 레벨
	private int exp; // 경험치
	private int strength; // 공격력
	private String attackEquip; // 장착 무기
	
	public Character() {}
	
	public Character(String name, String job, int level, int exp, int strength, String attackEquip) {
		super();
		this.name = name;
		this.job = job;
		this.level = level;
		this.exp = exp;
		this.strength = strength;
		this.attackEquip = attackEquip;
	}

	
	@Override
	public String toString() {
		return "Character [name=" + name + ", job=" + job + ", level=" + level + ", exp=" + exp + ", strength="
				+ strength + ", attackEquip=" + attackEquip + "]";
	}

	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
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
	
}