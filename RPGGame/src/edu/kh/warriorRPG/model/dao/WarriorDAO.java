package edu.kh.warriorRPG.model.dao;

import java.util.List;

public interface WarriorDAO {

	/** 전사 생성
	 * @param name
	 * @return
	 */
	String createWarrior(String name) throws Exception;

	/** 캐릭터 선택창
	 * @return
	 */
	List<Warrior> warriorList();

	void saveFile() throws Exception;

	Warrior detailWarrior(int index);

	Warrior deleteWarrior(int index) throws Exception;

	
	
}