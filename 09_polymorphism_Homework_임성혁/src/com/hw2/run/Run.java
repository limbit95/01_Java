package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Prisoner;
import com.hw2.model.service.Company;
import com.hw2.model.service.ManagementSystem;
import com.hw2.model.service.Prison;

public class Run {

	public static void main(String[] args) {
		
		ManagementSystem managementSystem1 = new Company(10);
		ManagementSystem managementSystem2 = new Prison(10);
		
		managementSystem1.addPerson(new Employee("EMP001", "유재석", "기획팀"));
		managementSystem1.addPerson(new Employee("EMP002", "정형돈", "개발팀"));
		
		managementSystem1.displayAllPersons();
		
		System.out.println("==================================================================");
		
		managementSystem2.addPerson(new Prisoner("1205", "정준하", "밥도둑"));
		managementSystem2.addPerson(new Prisoner("0705", "박명수", "웃음연쇄살인"));
		
		managementSystem2.displayAllPersons();
		
		System.out.println("==================================================================");
		
		managementSystem1.removePerson("EMP001");
		managementSystem2.removePerson("1205");
		
		System.out.println("==================================================================");
		
		managementSystem1.displayAllPersons();
		managementSystem2.displayAllPersons();
		
	}
}