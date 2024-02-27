package edu.kh.warriorRPG.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import edu.kh.warriorRPG.model.dao.Potion;
import edu.kh.warriorRPG.model.dao.Slime;
import edu.kh.warriorRPG.model.dao.Warrior;
import edu.kh.warriorRPG.model.dao.Weapon;
import edu.kh.warriorRPG.model.service.WarriorRPGService;
import edu.kh.warriorRPG.model.service.WarriorRPGServiceImpl;

public class GamePlayView {

	private Warrior warrior = null; // 플레이어 
	private BufferedReader br = null;
	private WarriorRPGService service = null;
	
	private Map<Integer, Weapon> weaponShop = new TreeMap<Integer, Weapon>();
	{
		weaponShop.put(1, new Weapon("기본", "검", 10, 3, 20));
		weaponShop.put(2, new Weapon("묵직한", "몽둥이", 20, 5, 100));
		weaponShop.put(3, new Weapon("피비린내 나는", "검", 30, 8, 300));
	}
	
	private Map<Integer, Potion> potionShop = new TreeMap<Integer, Potion>();
	{
		potionShop.put(1, new Potion("하급 물약", 10, 10));
		potionShop.put(2, new Potion("중급 물약", 50, 50));
		potionShop.put(3, new Potion("상급 물약", 100, 100));
	}
	
	public GamePlayView() {}

	public GamePlayView(Warrior warrior) {
		super();
		this.warrior = warrior;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			service = new WarriorRPGServiceImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public Warrior getWarrior() {
		return warrior;
	}
	public void setWarrior(Warrior warrior) {
		this.warrior = warrior;
	}
	
	
	public void play() throws Exception {
		int input = 0;
		
		do {
			try {
				input = playMenu();
				
				switch(input) {
				case 1: dungeon(); break;
				case 2: weaponShop(); break;
				case 3: potionShop(); break;
				case 4: warriorInfo(); break;
				case 5: save(); break;
				case 0: System.out.println("게임을 종료합니다.") ;break;
				default: System.out.println("잘못 입력하셨습니다."); break;
				}
				System.out.println("\n================================\n");
			} catch (NumberFormatException e) {
				System.out.println("### 숫자만 입력해 주세요.");
				input = -1; // 첫 반복에 종료되는 걸 방지
			} catch (IOException e) {
				System.out.println("### 입/출력 관련 예외 발생 ###");
				e.printStackTrace(); // 예외추적
			} catch (Exception e) { // 기타 예외 모두 처리
				e.printStackTrace();
			}
		}while(input != 0);
	}
	
	
	public int playMenu() throws Exception { 
		System.out.printf("\n===== [%s]님 환영합니다. =====\n\n", warrior.getName());
		
		System.out.println("1. 던전 입장");
		System.out.println("2. 무기 상점");
		System.out.println("3. 물약 상점");
		System.out.println("4. 캐릭터 상태");
		System.out.println("5. 게임 저장");
		System.out.println("0. 게임 종료");
		
		System.out.print("메뉴 선택 : ");
		int input = Integer.parseInt(br.readLine());
		System.out.println();
		
		if(input == 0) {
			System.out.println("게임 저장하셨습니까?");
			System.out.print("저장하지 않고 나가시면 현재까지 진행된 모든 데이터는 손실됩니다.(y/n) : ");
			
			
		}
		
		return input;
	}
	
	// 1. 던전 입장
	public void dungeon() throws Exception {
		System.out.println("========== 던전 입장 ==========\n");
		
		int input = 0;
		
		do {
			System.out.println("1. 슬라임 던전[1~5LV]");
			System.out.println("2. 고블린 던전[6~10LV]");
			System.out.println("3. 오크 던전[10~15LV]");
			System.out.println("0. 마을로 가기");
			
			System.out.print("선택 : ");
			
			input = Integer.parseInt(br.readLine());
			
			switch(input) {
			case 1: slimeDungeon(); break;
			case 2: goblinDungeon(); break;
			case 3: orcDungeon(); break;
			case 0: break;
			default: System.out.println("잘못 입력하셨습니다."); break;
			}
		} while(input != 0);
	}
	
	// 2. 무기 상점
		public void weaponShop() throws Exception {
			System.out.println("*** 무기 상점에 오신 걸 환영합니다 ***\n");
			
			for(Integer i : weaponShop.keySet()) {
				System.out.println(i + ". " + weaponShop.get(i));
			}
			
			System.out.println("0. 상점 나가기\n");
			
			System.out.println("보유 골드 : " + warrior.getGold() + "\n");
			
			System.out.print("선택 : ");
			int input = Integer.parseInt(br.readLine());
			
			if(input == 0) return;
			
			Weapon weapon = weaponShop.get(input);
			
			if(!warrior.minusGold(weapon.getPrice())) {
				System.out.println("\n### 골드가 부족합니다 ###");
				return;
			} else {
				System.out.println("\n*** " + weapon.getName() + " " + weapon.getKind() + "을 구매하셨습니다 ***");
				
			}
			
			warrior.setAttackEquip(weapon);
			
			System.out.println("\n현재 장착 무기 : " + warrior.getAttackEquip());
		} 
	
	// 3. 물약 상점
	public void potionShop() throws Exception {
		System.out.println("*** 물약 상점에 오신 걸 환영합니다 ***\n");
		
		for(Integer i : potionShop.keySet()) {
			System.out.println(i + ". " + potionShop.get(i));
		}
		
		System.out.println("0. 상점 나가기\n");
		
		System.out.println("보유 골드 : " + warrior.getGold() + "\n");
		
		System.out.print("선택 : ");
		int input = Integer.parseInt(br.readLine());
		
		if(input == 0) return;
		
		Potion potion = potionShop.get(input);
		
		if(!warrior.minusGold(potion.getPrice())) {
			System.out.println("\n### 골드가 부족합니다 ###");
			return;
		} else {
			System.out.println("\n*** " + potion.getName() + "을 구매하셨습니다 ***");
			
		}
		
		warrior.getPotion().put(potion.getName(), 
				warrior.getPotion().get(potion.getName()) + 1);
		
		System.out.println("\n현재 보유 물약 : " + warrior.getPotion());
		
	}
	
	// 3. 캐릭터 상태
	public void warriorInfo() {
		System.out.println(warrior);
	}
	
	// 4. 게임 저장
	public void save() throws Exception {
		Warrior savedwarrior = service.save(warrior);
		if(savedwarrior == null) {
			System.out.println("### 저장 실패 ###");
			return; 
		}
		System.out.println("*** 저장 완료 ***");
	}
	

	// 슬라임 던전
	public void slimeDungeon() throws Exception {
		if(warrior.getHp() == 0) {
			System.out.println("\n캐릭터가 사망한 상태입니다.");
			return;
		}
		
		System.out.println("\n========== 슬라임 던전 =========\n");
		
		Slime slime = new Slime();
		
		System.out.println(slime.getName() + "이 나타났습니다.");
		System.out.println(slime);
		System.out.print("전투를 시작하시겠습니까?(y/(도망치려면 아무키나) : ");
		String answer = br.readLine().toLowerCase();
		
		
		if(answer.equals("y")) {
			System.out.println("\n@@@ 전투를 시작합니다 @@@\n");
			while(slime.getHp() > 0) {
				
				
				System.out.println(slime.getName() + "에게 " + warrior.getAttackEquip().getName() + " " + warrior.getAttackEquip().getKind()
								+ "을 휘둘러 " + (warrior.getStrength() + warrior.getAttackEquip().getAttack()) + "만큼의 데미지를 주었다!");

				if(!slime.minusHp((warrior.getStrength() + warrior.getAttackEquip().getAttack()))){
					break;
				} else {
					System.out.println(slime.getName() + "의 체력 : [" + slime.getHp() + "]\n");
				}
//				slime.minusHp((warrior.getStrength() + warrior.getAttackEquip().getAttack()));
				
				
				System.out.println(slime.getName() + "의 공격으로 " + warrior.getName() + "은(는) " + slime.getAttack() + "만큼의 피해를 받았다!");
				warrior.setHp(warrior.getHp() - slime.getAttack());
				System.out.println(warrior.getName() + "의 체력 : [" + warrior.getHp() + "]\n");
			}
			
			System.out.println(slime.getName() + "의 체력 : [" + slime.getHp() + "]\n");
			
			System.out.println(slime.getName() + "을 처치하였다!");
			System.out.println(slime.getExp() + "만큼의 경험치를 얻었다!");
			System.out.println(slime.getGold() + "만큼의 골드를 얻었다!");
			warrior.setExp(warrior.getExp() + slime.getExp());
			warrior.setGold(warrior.getGold() + slime.getGold());
			System.out.println("\n마을로 돌아갑니다.");
			
			return;
		} else {
			System.out.println("\n" + slime.getName() + "과의 전투에서 도망쳤습니다.");
			System.out.println("패널티로 " + slime.getName() + "에게 한 번의 공격을 허용합니다.\n");
			if(!warrior.minusHp(slime.getAttack())){
				System.out.println("캐릭터가 사망하였습니다.");
				return;
			} else {
				System.out.println("[" + slime.getAttack() + "] 만큼의 데미지를 입었습니다. "
								+ "\n현재 체력 : [" + warrior.getHp() + "]\n");
				return;
			}
		} 
		
		
		
		
	}
	
	// 고블린 던전
	public void goblinDungeon() {
		
	}
	
	// 오크 던전
	public void orcDungeon() {
		
	}
	
}