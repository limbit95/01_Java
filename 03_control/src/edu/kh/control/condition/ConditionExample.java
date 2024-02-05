package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { // 기능 제공용 클래스
	
	// 전역 변수 필드
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		// if문
		// 조건식이 true일 때만 내부 코드 수행
		
		// [작성법]
//			if(조건식){
//				조건식이 true 일 때 수행할 코드
//			}
		
		// 입력받은 정수가 양수인지 검사 
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		if(input >= 0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		
	}
	
	public void ex2() {
		// if - else문
		// 조건식 결과가 true면 if문
		// false면 else 구문이 수행됨
		
		// [작성법]
		
	//		if(조건식) {
	//			조건식이 true일 때 수행될 코드
	//		} else {
	//			조건식이 false일 때 수행될 코드
	//		}
		
		// 홀짝 검사
		// 입력 받은 정수값이 홀수이면 "홀수입니다" 출력
		// 0이면 "0입니다"
		// 짝수이면 "짝수입니다" 출력
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		if(input == 0) {
			System.out.println("0 입니다.");
		} else {
			if(input % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다");
			} 
		}	
	}
	
	public void ex3() {
		// 양수, 음수, 0 판별
		// if - else if - else
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		if(input > 0) {
			System.out.println("양수입니다.");
		} else if(input < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0 입니다.");
		}
	}
	
	public void ex4() {
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 단, 겨울일 때 온도가 -15도 이하 "한파 경보", -12이하 "한파 주의보"
		// 여름일때 온도가 35도 이상 "폭염 경보", 33도 이상 "폭염 주의보
		// 1~12월 사이가 아닐 땐 "해당하는 계절이 없습니다" 출력
		// 겨울 : 12, 1, 2
		// 봄 : 3~5
		// 여름 : 6~8
		// 가을 : 9~11
		
		System.out.print("달 입력 : ");
		int input = sc.nextInt();
		if(input >= 1 && input <= 2 || input == 12) {
			System.out.println("겨울입니다. 온도를 입력해주세요 : ");
			int winter = sc.nextInt();
			if(winter <= -15) {
				System.out.println("한파 경보");
			} else if(winter <= -12) {
				System.out.println("한파 주의보");
			}
		} else if(input >= 3 && input <= 5) {
			System.out.println("봄입니다.");
		} else if(input >= 6 && input <= 8) {
			System.out.println("여름입니다. 온도를 입력해주세요 : ");
			int summer = sc.nextInt();
			if(summer >= 35) {
				System.out.println("폭염 경보");
			} else if (summer >= 33) {
				System.out.println("폭염 주의보");
			}
		} else if(input >= 9 & input <= 11) {
			System.out.println("가을입니다");
		} else {
			System.out.println("해당하는 계절이 없습니다.");
		}
	}

	public void ex5() {
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if (age <= 13) {
			System.out.println("어린이 입니다.");
		} else if (age <= 19) {
			System.out.println("청소년 입니다.");
		} else {
			System.out.println("성인 입니다.");
		}
		
	}
	
	public void ex6( ) {
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		if(score < 60) {
			System.out.println("F");
		} else if(score < 70) {
			System.out.println("D");
		} else if(score < 80) {
			System.out.println("C");
		} else if(score < 90) {
			System.out.println("B");
		} else if(score <= 100) {
			System.out.println("A");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
	}

	public void ex7() {
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result = "";
		
		if (age < 0 || age > 100) {
			result += "잘못 입력하셨습니다";
		} else {
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();
			
			if (age < 12) {
				result += "잘못 입력하셨습니다";
			} else if (height < 140.0) {
				result += "적정 키가 아닙니다";
			} else {
				result += "탑승 가능";
			}
		}
		
		System.out.println(result);
	}
	
	public void ex8() {
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result = "";
		
		if (age < 0 || age > 100) {
			result += "나이를 잘못 입력하셨습니다.";
		} else {
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();
			
			if(height < 0 || height > 250.0) {
				result += "키를 잘못 입력하셨습니다";
			} else if (age >= 12 && height >= 140.0) {
				result += "탑승 가능";
			} else if (age >= 12 && height < 140.0) {
				result += "나이는 적절하나, 키가 적절치 않음";
			} else if (age < 12 && height >= 140.0) {
				result += "키는 적절하나 나이는 적절치 않음";
			} else {
				 result += "나이와 키 모두 적절치 않음";
			}
		}
		
		System.out.println(result);
	}
	
}