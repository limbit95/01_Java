package edu.kh.warriorRPG.model.service;

import java.util.List;

import edu.kh.warriorRPG.model.dao.Warrior;

public interface WarriorRPGService {

	/** 전사 생성 
	 * @param name
	 */
	String createWarrior(String name) throws Exception;

	/**
	 * 캐릭터 선택창
	 */
	String warriorList();

	/** 캐릭터 상세정보
	 * @param input
	 */
	String detailWarrior(int index);

	String deleteWarrior(int index) throws Exception;

	
	
}