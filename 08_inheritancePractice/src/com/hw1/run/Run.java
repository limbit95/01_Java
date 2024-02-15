package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Student[] stdArr = new Student[3];
		
		stdArr[0] = new Student("홍길동", 20, 178.2, 70, 1, "정보시스템학과");
		stdArr[1] = new Student("김말똥", 21, 187.3, 80, 2, "경영학과");
		stdArr[2] = new Student("강개순", 23, 167, 45, 4, "정보통신공학과");
		
		for(int i = 0; i < stdArr.length; i++) {
			System.out.println(stdArr[i].information());
		}
		
		System.out.println("================================================");
		
		Employee[] empArr = new Employee[3];
		
		int cnt = 0;
		
		while(true) {
			System.out.println("==========사원 정보 입력==========");
			
			System.out.print("이름 : ");
			String inputName = sc.next();
			System.out.print("나이 : ");
			int inputAge = sc.nextInt();
			System.out.print("신장 : ");
			double inputHeight = sc.nextDouble();
			System.out.print("몸무게 : ");
			double inputWeight = sc.nextDouble();
			System.out.print("급여 : ");
			int inputSalary = sc.nextInt();
			System.out.print("부서 : ");
			String inputDept = sc.next();
						
			empArr[cnt] = new Employee(inputName, inputAge, inputHeight, inputWeight, inputSalary, inputDept);
			cnt++;
			
			System.out.print("추가하시겠습니까?(y/n) : ");
			char inputChar = sc.next().charAt(0);
			
			if(!String.valueOf(inputChar).toLowerCase().equals("y")) {
				break;
			} else {
				if(cnt == empArr.length) {
					System.out.println("등록 대기열이 가득찼습니다.");
					break;
				}
			}
		}
		
		for(int i = 0; i < empArr.length; i++) {
			if(empArr[i] != null) {
				System.out.println(empArr[i].information());
			}
		}
		
	}
}