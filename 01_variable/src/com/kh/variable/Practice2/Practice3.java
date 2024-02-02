package com.kh.variable.Practice2;

import java.util.Scanner;

public class Practice3 {

	Scanner sc = new Scanner(System.in);
	
	public void ex2() {
		System.out.println("예제 2번입니다.");
		System.out.print("국어 점수 : ");
		double input1 = sc.nextDouble();
		System.out.print("영어 점수 : ");
		double input2 = sc.nextDouble();
		System.out.print("수학 점수 : ");
		double input3 = sc.nextDouble();
		
		System.out.printf("총점 : %.0f점 평균 : %.0f점\n", input1+input2+input3, (input1+input2+input3) / 3);
	}
	
	public void ex3() {
		// next() 와 nextLine()의 차이
		
		// next() : 띄어쓰기 입력 불가, 띄어쓰기를 구분인자로 생각하여 각각 저장
		// nextLine() : 문자열에 띄어쓰기 가능, 줄구분까지 저장
		
		System.out.print("문자열 입력 1 : ");
		String input1 = sc.nextLine();
		System.out.print("문자열 입력 2 : ");
		String input2 = sc.next();
		
		System.out.println(input1);
		System.out.println(input2);
		
	}
	
	public void ex4() {
		System.out.print("정수 입력 : ");
		int input1 = sc.nextInt();
		System.out.println(input1);
		
		// 입력 버퍼에 남은 개행문자 제거 후에 nextLine() 사용
		sc.nextLine();
		
		System.out.print("문자열 입력 : ");
		String input2 = sc.nextLine();
		System.out.println(input2);
	}
	
}
