package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {

	private	Employee[] employees; // 전체 직원 저장용
	
	private int employeeCount = 0; // 직원수
	
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public Company(int size) {
		employees = new Employee[size];
	}
	
	@Override
	public void addPerson(Person person) {
		boolean flag = true;
		
		for(int i = 0; i < employees.length; i++) {
			if(employees[i] == null && person instanceof Employee) {
				employees[i] = (Employee)person;
				System.out.println("직원이 추가되었습니다 - " + employees[i].getInfo());
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
		
		for(int i = 0; i < employees.length; i++) {
			if(employees[i] != null && employees[i].getId().equals(id)) {
				System.out.println("직원이 삭제되었습니다 - " + employees[i].getInfo());
				employees[i] = null;
				flag = false;
				break;
			} 
		}
		
		if(flag) {
			System.out.println("해당 id를 가진 직원을 찾을 수 없습니다.");
		}
		
		for(int i = 0; i < employees.length - 1; i++) {
			for(int x = i + 1; x < employees.length; x++) {
				if(employees[i] == null && employees[x] != null) {
					employees[i] = employees[x];
					employees[x] = null;
				}
			}
		}
	}

	@Override
	public void displayAllPersons() {
		System.out.println("전체 직원 명단 : ");
		
		for(int i = 0; i < employees.length; i++) {
			if(employees[i] != null) {
				System.out.println(employees[i].getInfo());
			}
		}
	}

	
	
}