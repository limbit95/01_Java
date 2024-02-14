package com.hw1.controller;

import java.util.Scanner;

import com.hw1.model.vo.Employee;

public class EmployeeController {

	Scanner sc = new Scanner(System.in);
	
	Employee[] emp = new Employee[3];
	
	int menuNum = 0;
	
	public void mainMenu() {
		do {
			System.out.println("=== 직원 관리 프로그램 ===");
			
			System.out.println("1. 직원 정보 입력(3명)");
			System.out.println("2. 모든 직원 정보 출력");
			System.out.println("3. 특정 직원 정보 출력(이름 검색)");
			System.out.println("4. 특정 직원 급여/연봉 출력(사번 검색)");
			System.out.println("5. 모든 직원 급여 합/연봉 합 출력");
			System.out.println("6. 모든 직원 중 급여가 가장 높은 직원의 이름, 부서, 급여 출력");
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 >> ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: employeeInput(); break;
			case 2: employeePrint(); break;
			case 3: employeeSelect(); break;
			case 4: employeeSalarySelect(); break;
			case 5: employeeAllSalary(); break;
			case 6: salaryTop(); break;
			case 0: System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
		} while(menuNum != 0);
	}
	
	// emp 배열에 비어있는지 확인하는 변수
	boolean empIsEmpty = true;
	
	// 1. 직원 정보 입력(3명)
	public void employeeInput() {
		boolean isEmpty = false;
		
		int cnt = 0;
		
		for(int i = 0; i < emp.length; i++) {
			if(emp[i] == null){
				isEmpty = true;
				cnt = i;
				break;
			}
		}

		if(isEmpty) {
			System.out.println("=== " + (cnt+1) + "번째 사원 정보 입력 ===");
			System.out.print("사번 : ");
			int inputEmpNo = sc.nextInt();
			System.out.print("이름 : ");
			String inputEmpName = sc.next();
			System.out.print("부서 : ");
			String inputDept = sc.next();
			System.out.print("직급 : ");
			String inputJob = sc.next();
			System.out.print("급여 : ");
			int inputSalary = sc.nextInt();
			
			emp[cnt] = new Employee(inputEmpNo, inputEmpName, inputDept, inputJob, inputSalary);
			empIsEmpty = false;
		} else {
			System.out.println("더이상 등록할 수 없습니다.");
			System.out.println();
		}
		
	}
	
	// 2. 모든 직원 정보 출력
	public void employeePrint() {
		if(empIsEmpty) {
			System.out.println("등록된 직원 정보가 없습니다. 등록 먼저 해주세요.");
			System.out.println();
		} else {
			for(int i = 0; i < emp.length; i++) {
				if(emp[i] != null) {
					System.out.println(emp[i].information2());
				} 
			} System.out.println();
		}
	}
	
	// 3. 특정 직원 정보 출력(이름 검색)
	public void employeeSelect() {
		System.out.println("=== 특정 사원 정보 출력(이름 검색) ===");
		if(empIsEmpty) {
			System.out.println("등록된 직원 정보가 없습니다. 등록 먼저 해주세요.");
			System.out.println();
		} else {
			System.out.print("이름 입력 : ");
			String inputName = sc.next();
			
			boolean flag = true;
			
			for(int i = 0; i < emp.length; i++) {
				if(emp[i] != null && emp[i].getEmpName().equals(inputName)) {
					System.out.println(emp[i].information2());
					System.out.println();
					flag = false;
					break;
				} 
			}
			if(flag) {
				System.out.println("일치하는 이름의 사원이 없습니다.");
				System.out.println();
			}
		}
	}
	
	// 4. 특정 직원 급여/연봉 출력(사번 검색)
	public void employeeSalarySelect() {
		System.out.println("=== 급여 / 연봉 조회 ===");
		if(empIsEmpty) {
			System.out.println("등록된 직원 정보가 없습니다. 등록 먼저 해주세요.");
			System.out.println();
		} else {
			System.out.print("사번 입력 : ");
			int inputEmpNo = sc.nextInt();
			
			boolean flag = true;
			
			for(int i = 0; i < emp.length; i++) {
				if(emp[i] != null && emp[i].getEmpNo() == inputEmpNo) {
					System.out.printf("급여 : %d / 연봉 : %d", emp[i].getSalary(), emp[i].getSalary() * 12);
					System.out.println();
					flag = false;
					break;
				} 
			}
			if(flag) {
				System.out.println("사번이 일치하는 직원이 없습니다.");
				System.out.println();
			}
		}
	}
	
	// 5. 모든 직원 급여 합/연봉 합 출력
	public void employeeAllSalary() {
		System.out.println("=== 모든 사원 급여 합/연봉 합 ===");
		if(empIsEmpty) {
			System.out.println("등록된 직원 정보가 없습니다. 등록 먼저 해주세요.");
			System.out.println();
		} else {
			int salary = 0;
			
			for(int i = 0; i < emp.length; i++) {
				if(emp[i] != null) {
					salary += emp[i].getSalary();
				}
			}
			
			System.out.printf("전 직원 급여 합 : %d\n"
							+ "전 직원 연봉 합 : %d\n", salary, salary * 12);
			System.out.println();
		}
	}

	// 6. 모든 직원 중 급여가 가장 높은 직원의 이름, 부서, 급여 출력
	public void salaryTop() {
		if(empIsEmpty) {
			System.out.println("등록된 직원 정보가 없습니다. 등록 먼저 해주세요.");
			System.out.println();
		} else {
			Employee bestSalary = emp[0];
			
			for(int i = 0; i < emp.length; i++) {
				if(bestSalary.getSalary() < emp[i].getSalary()) {
					bestSalary = emp[i];
				}
			}
			
			System.out.printf("이름 : %s, 부서 : %s, 급여 : %d\n", 
					bestSalary.getEmpName(), bestSalary.getDept(), bestSalary.getSalary());
			System.out.println();
		}
	}
	
	
}