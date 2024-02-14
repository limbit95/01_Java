package com.hw1.run;

import com.hw1.controller.EmployeeController;
import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
	
		Employee[] emArr = new Employee[3];
		
		
		// 실습문제 1 -----------------------------------------------------------------------------------------
//		emArr[0] = new Employee();
//		emArr[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
//		emArr[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
//		
//		for(int i = 0; i < emArr.length; i++) {
//			System.out.printf("emp[%d] : %s\n", i, emArr[i].information());
//		}
//		
//		System.out.println("==============================================================================");
//		
//		emArr[0].setEmpName("김말똥");
//		emArr[0].setDept("영업부");
//		emArr[0].setJob("팀장");
//		emArr[0].setAge(30);
//		emArr[0].setGender('M');
//		emArr[0].setSalary(3000000);
//		emArr[0].setBonusPoint(0.2);
//		emArr[0].setPhone("01055559999");
//		emArr[0].setAddress("전라도 광주");
//		
//		emArr[1].setDept("기획부");
//		emArr[1].setJob("부장");
//		emArr[1].setSalary(4000000);
//		emArr[1].setBonusPoint(0.3);
//		
//		System.out.println("emp[0] : " + emArr[0].information());
//		System.out.println("emp[1] : " + emArr[1].information());
//	
//		System.out.println("==============================================================================");
//		
//		for(int i = 0; i < emArr.length; i++) {
//			System.out.printf("%s의 연봉 : %.0f원\n", emArr[i].getEmpName(), 
//						(emArr[i].getSalary() + (emArr[i].getSalary() * emArr[i].getBonusPoint())) * 12 );
//		}
//		
//		System.out.println("==============================================================================");
//		
//		int avg = 0;
//		
//		for(int i = 0; i < emArr.length; i++) {
//			avg += (emArr[i].getSalary() + (emArr[i].getSalary() * emArr[i].getBonusPoint())) * 12;
//		}
//		
//		System.out.println("직원들의 연봉의 평균 : " + avg / 3 + "원");
		
		// ==================================================================
		
		//실습문제 추가 실행화면
		
		EmployeeController empCon = new EmployeeController();
		
		empCon.mainMenu();
		
	}	
}