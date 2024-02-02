package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("-----실습문제1-----");
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 : %d\n남는 사탕 개수 : %d\n", input2 / input1, input2 % input1);
	}
	
	public void practice2() {
		System.out.println("-----실습문제2-----");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int cls = sc.nextInt();
		System.out.print("학년 : ");
		int num = sc.nextInt();
		System.out.print("성별 : ");
		String gender = sc.next();
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", grade, cls, num, name, gender, score);
	}
	
	public void practice3() {
		System.out.println("-----실습문제3-----");
		System.out.print("국어 : ");
		double input1 = sc.nextDouble();
		System.out.print("영어 : ");
		double input2 = sc.nextDouble();
		System.out.print("수학 : ");
		double input3 = sc.nextDouble();
		
		int sum = (int)(input1 + input2 + input3);
		double avg = (input1 + input2 + input3) / 3;
		
		System.out.printf("합계 : %.0f\n평균 : %.1f\n", input1+input2+input3, (input1+input2+input3) / 3);
		boolean result = (input1 >= 40) && (input2 >= 40) && (input3 >= 40);
		System.out.println(result ? "합격" : "불합격");
	}
}
