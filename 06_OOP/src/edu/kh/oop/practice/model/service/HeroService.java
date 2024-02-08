package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	
	public void ex1() {
		
		Hero hero = new Hero();
		
		hero.setNickName("임성혁");
		hero.setJob("검사");
		hero.setHp(500);
		hero.setMp(50);
		hero.setLevel(1);
		
		hero.showStatus();
		
		hero.attack(150);
		hero.attack(150);
		hero.attack(150);
		hero.attack(150);
		
		hero.showStatus();
		
		hero.magicJump();
		hero.magicJump();
		hero.magicJump();
		hero.magicJump();
		hero.magicJump();
		hero.magicJump();
		
		hero.showStatus();
		
	}
	
	public void ex2() {
		
		Hero hero = new Hero();
		
		hero.setNickName("임성혁");
		hero.setJob("마법사");
		hero.setHp(200);
		hero.setMp(30);
		hero.setLevel(1);
		
		hero.showStatus();
		
		hero.attack(300);
		hero.attack(300);
		hero.attack(300);
		hero.attack(300);
		
		hero.showStatus();
		
		hero.magicJump();
		hero.magicJump();
		hero.magicJump();
		hero.magicJump();
		
		hero.showStatus();
		
	}

}
