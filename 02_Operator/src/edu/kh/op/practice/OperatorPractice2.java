package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println("당신의 나이는 ? : " + age);
		System.out.println(age >= 20 ? "저는 성인입니다" : "저는 미성년입니다");
		System.out.println(age >= 13 && 19 >= age ? "청소년 입니까? true" : "청소년 입니까? false");
		System.out.println(age >= 65 || age <= 12 ? "노인이거나 어린이 입니까? true" : "노인이거나 어린이 입니까? false");
	}
	
}
