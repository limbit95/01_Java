package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem {

	private Prisoner[] prisoners; // 전체 수용자 저장용
	
	private int prisonerCount = 0; // 수용자수
	
	public int getPrisonerCount() {
		return prisonerCount;
	}
	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}
	
	public Prison(int size) {
		prisoners = new Prisoner[size];
	}
	
	
	@Override
	public void addPerson(Person person) {
		boolean flag = true;
		
		for(int i = 0; i < prisoners.length; i++) {
			if(prisoners[i] == null && person instanceof Prisoner) {
				prisoners[i] = (Prisoner)person;
				System.out.println("수감자가 추가되었습니다 - " + prisoners[i].getInfo());
				flag = false;
				break;
			} 
		}
		
		if(flag) {
			System.out.println("인원이 모두 충원되었습니다.");
		}
		
	}

	@Override
	public void removePerson(String id) {
		boolean flag = true;
		
		for(int i = 0; i < prisoners.length; i++) {
			if(prisoners[i].getId().equals(id)) {
				System.out.println("수감자가 삭제되었습니다 - " + prisoners[i].getInfo());
				prisoners[i] = null;
				flag = false;
				break;
			} 
		}
		
		if(flag) {
			System.out.println("해당 id를 가진 수감자를 찾을 수 없습니다.");
		}
		
		for(int i = 0; i < prisoners.length - 1; i++) {
			for(int x = i + 1; x < prisoners.length; x++) {
				if(prisoners[i] == null && prisoners[x] != null) {
					prisoners[i] = prisoners[x];
					prisoners[x] = null;
				}
			}
		}
	}

	@Override
	public void displayAllPersons() {
		System.out.println("전체 수감자 명단 : ");
		
		for(int i = 0; i < prisoners.length; i++) {
			if(prisoners[i] != null) {
				System.out.println(prisoners[i].getInfo());
			}
		}
	}
	
}