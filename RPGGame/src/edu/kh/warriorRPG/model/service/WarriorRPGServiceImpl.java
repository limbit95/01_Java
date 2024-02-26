package edu.kh.warriorRPG.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import edu.kh.warriorRPG.model.dao.Warrior;
import edu.kh.warriorRPG.model.dao.WarriorDAO;
import edu.kh.warriorRPG.model.dao.WarriorDAOImpl;

public class WarriorRPGServiceImpl implements WarriorRPGService{

	private WarriorDAO wdao = null;
	
	public WarriorRPGServiceImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		wdao = new WarriorDAOImpl();
	}

	/**
	 * 전사 생성
	 */
	@Override
	public String createWarrior(String name) throws Exception {
		return wdao.createWarrior(name);
	}

	
	/**
	 * 캐릭터 선택창
	 */
	@Override
	public String warriorList() {
		List<Warrior> warriorList = wdao.selectWarrior();
		
		StringBuilder sb = new StringBuilder();
		
		if(warriorList == null) {
			return null;
		}
		
		for(int i = 0; i < warriorList.size(); i++) {
			sb.append(String.format("%s. 이름 : %s / 레벨 : %d / 경험치 : %d\n", 
					(i+1), warriorList.get(i).getName(), warriorList.get(i).getLevel(), warriorList.get(i).getExp() ));
		}
		
		sb.append("\n0. 이전 메뉴로 돌아가기");
		
		return sb.toString();
	}

	/**
	 * 캐릭터 상세정보
	 */
	@Override
	public String detailWarrior(int index) {
		Warrior warrior = wdao.detailWarrior(index-1);
		
		if(warrior == null) {
			return null;
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("\n*** " +  warrior.getName())).append("\n");
		sb.append(String.format("레벨 : " +  warrior.getLevel())).append("\n");
		sb.append(String.format("경험치 : " +  warrior.getExp())).append("\n");
		sb.append(String.format("체력 : " +  warrior.getHp())).append("\n");
		sb.append(String.format("공격력 : " +  warrior.getStrength())).append("\n");
		sb.append(String.format("장비(무기) : " +  warrior.getAttackEquip())).append("\n");
		sb.append(String.format("스탯포인트 : " +  warrior.getStat())).append("\n");
		sb.append(String.format("아이템(물약) : " +  warrior.getPotion())).append("\n");
		
		return sb.toString();		
	}

	@Override
	public String deleteWarrior(int index) throws Exception {
		Warrior warrior = wdao.deleteWarrior(index-1);
		
		if(warrior == null) return null;
		
		return warrior.getName();
	}
	
	
	
}