package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practic1() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		if(input > 0) {
			if(input % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		} else {
			System.out.println("양수만 입력해주세요");
		}
	}
	
	public void practice2() {
		System.out.print("국어점수 : ");
		double input1 = sc.nextDouble();
		System.out.print("수학점수 : ");
		double input2 = sc.nextDouble();
		System.out.print("영어점수 : ");
		double input3 = sc.nextDouble();
		
		double sum = input1 + input2 + input3;
		double avg = (input1 + input2 + input3) / 3;
		
		String result = "";
		
		if(input1 >= 40 && input2 >= 40 && input3 >= 40 && avg >= 60) {
			result += "축하합니다, 합격입니다!";
		} else {
			result += "불합격입니다.";
		}
		
		System.out.printf("국어 : %.0f\n"
						+ "수학 : %.0f\n"
						+ "영어 : %.0f\n"
						+ "합계 : %.0f\n"
						+ "평균 : %.1f\n"
						+ "%s", input1, input2, input3, sum, avg, result);
	}

	public void practice3() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 1,2,3,5,7,8,10,12: {
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		}
		case 4,6,9,11: {
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
		}
		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");
			break;
		}
	}
	
	public void practice4() {
		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		String result = "";
		
		if (bmi < 18.5) {
			result += "저체중";
		} else if (bmi < 23) {
			result += "정상체중";
		} else if (bmi < 25) {
			result += "과체중";
		} else if (bmi < 30) {
			result += "비만";
		} else {
			result += "고도 비만";
		}
		
		System.out.printf("BMI 지수 : %f\n"
						+ "%s", bmi, result);
	}
	
	public void practice5() {		
		System.out.print("중간 고사 점수 : ");
		double middle = sc.nextDouble();
		System.out.print("기말 고사 점수 : ");
		double end = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double homework = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		double check = sc.nextDouble();
		
		middle = (middle * 20) / 100;
		end = (end * 30) / 100;
		homework = (homework * 30) / 100;
		
		double total = middle + end + homework + check;
		
		String result = "================결과================" + 
						"\n중간 고사 점수(20) : " + middle +
						"\n기말 고사 점수(30) : " + end +
						"\n과제 점수 \t(30) : " + homework + 
						"\n출석 점수 \t(20) : " + check +
						"\n총점 : " + total; 
		
		if(total >= 70 && 20 - check < 20 * 0.3) {
			System.out.println(result + "\nPASS");
		} else if(20 - check >= 20 * 0.3) {
			System.out.printf("================결과================\n"
							+ "Fail [출석 횟수 부족 (%.0f/20)]", check);
		} else {
			System.out.println(result + "\nFail [점수 미달]");
		}
		
	}
	
	
	
	
}
