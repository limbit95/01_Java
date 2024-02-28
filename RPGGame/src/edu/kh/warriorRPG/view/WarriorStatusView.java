package edu.kh.warriorRPG.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import edu.kh.warriorRPG.model.dao.Warrior;
import edu.kh.warriorRPG.model.dao.Weapon;
import edu.kh.warriorRPG.model.service.WarriorRPGService;
import edu.kh.warriorRPG.model.service.WarriorRPGServiceImpl;

public class WarriorStatusView {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Warrior warrior = null;
	
	public WarriorStatusView() {}
	
	public WarriorStatusView(Warrior warrior) {
		this.warrior = warrior;
	}
	
	// 1. 능력치 추가
	public void addAbility() throws Exception {
		while(true) {
			System.out.println("\n========== [스탯 정보] ==========");
			
			System.out.println("체력 : " + warrior.getHp());
			System.out.println("공격력 : " + warrior.getAttack());
			
			System.out.println("\n현재 스탯 포인트 : " + warrior.getStat() + "\n");
			
			System.out.println("1. 체력 증가");
			System.out.println("2. 공격력 증가");
			System.out.println("0. 스탯창 나가기\n");
			
			System.out.print("선택 : ");
			int input = Integer.parseInt(br.readLine());
			
			if(input == 1) {
				warrior.maxHpUp();
			} else if(input == 2) {
				warrior.attackUp();
			} else if(input == 0) {
				return;
			}
		}
	}
	
	// 2. 무기 교체
	public void updateWeapon() throws Exception {
		while(true) {
			List<Weapon> weapon = warrior.getWeaponList(); 
			
			System.out.println("\n========== [무기 인벤토리] ==========\n");
			
			if(weapon.isEmpty()) {
				System.out.println("\n보유한 무기가 없습니다."); 
				return;
			}
			for(int i = 0; i < weapon.size(); i++) {
				System.out.println((i+1) + ". " + (weapon.get(i).getName() + " " + weapon.get(i).getKind())
						+ "[공격력+" + weapon.get(i).getAttack() + "]");
			}
			System.out.println("\n0. 이전 메뉴로 나가기");
			
			System.out.print("\n선택(선택한 무기로 교체됩니다) : ");
			int input = Integer.parseInt(br.readLine());
			
			if(input == 0) return;
			
			warrior.setAttackEquip(weapon.get(input-1));
			System.out.println("\n[" + weapon.get(input-1).getKind() + " " + weapon.get(input-1).getName() + "] 이(가) 장착되었습니다.\n");
			return;
		}
		
		
	}
	
	// 3. 물약 사용
	public void usePotion() {
		
	}

}
