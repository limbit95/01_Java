package edu.kh.warriorRPG.model.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Slime {

	private String name;
	private int level;
	private int hp;
	private int attack;
	private int gold;
	private int exp;
	
	private Random random = new Random();
	
	List<String> kind = new ArrayList<String>();
	{
		kind.add("귀여운");
		kind.add("말랑말랑한");
		kind.add("덩치가 큰");
		kind.add("초록");
		kind.add("노랑");
		kind.add("맹독");
		kind.add("얌전한");
		kind.add("사나운");
	}
	
	public Slime() {
		this.name = kind.get(random.nextInt(kind.size())) + " 슬라임";
		this.level = random.nextInt(5) + 1;
		this.hp = 10 + (level * 3);
		this.attack = (level * 2);
		this.gold = 1 + (level * 2);
		this.exp = level * 3;
	}

	
	public boolean minusHp(int attack) {
		if(hp <= attack) {
			hp = 0;
			return false;
		}
		
		hp -= attack;
		return true;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("*** %s ***", name)).append("\n");
		sb.append(String.format("레벨 : %d", level)).append("\n");
		sb.append(String.format("체력 : %d", hp)).append("\n");
		
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
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public List<String> getKind() {
		return kind;
	}
	public void setKind(List<String> kind) {
		this.kind = kind;
	}
	
}