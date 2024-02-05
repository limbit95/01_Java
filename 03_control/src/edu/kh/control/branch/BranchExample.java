package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	
	Scanner sc = new Scanner(System.in)	;
	
	public void ex1() {
		// 1부터 10까지 1씩 증가하며 출력하는 반복문 작성
		// 단, 5를 출력하면 반복문 종료
		
		for(int i = 1; i <= 10; i++) {
			System.out.println();
			if(i == 5) {
				break;
			}
		}
	}

	public void ex2() {
		// 입력받은 모든 문자열을 누적
		// 단, "exit@" 입력시 문자열 누적을 종료하고 결과 출력

		String str = "";
		
		while(true) {
			System.out.print("입력 : ");
			String input = sc.nextLine();
			
			// String 자료형은 비교연산자(==)로 같은 문자열인지 판별할 수 없다
			// 비교연산자(==)는 보통 기본자료형끼리의 연산에서만 사용 가능함
			// -> String은 기본자료형이 아닌 참조형
			// 참조형은 참조값을 반환하기에 String을 비교 연산자로 비교하면 String 변수 안에 있는
			// 값을 비교하는 것이 아닌 String 변수가 가리키고 있는 참조값을 비교하게 됨으로 제대로
			// 비교할 수가 없는 것이다.
			if(input.equals("exit@")) {
				break;
			} else {
				str += input + " \n";
			}
		}
		System.out.println(str);		
	}

	public void ex3() {
		// continue : 다음 반복으로 넘어감
		
		// 1~10까지 1씩 증가하며 출력
		// 단, 3의 배수 제외
		for(int i = 1; i<= 10; i++) {
			if(i % 3 == 0) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}

	public void ex4() {
		//  ~ 100 까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너뛰고
		// 증가하는 값이 40이 되었을 때 반복을 멈춤
		
		for(int i = 1; i <= 100; i++) {
			if (i ==40) {
				break;
			} else if(i % 5 ==0) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}

	public void ex5() {
		// 가위바위보 게임
		// 몇 판 할지 입력 받음
		// 입력 받은 판 수 만큼 반복
		// 컴퓨터 : Math.random() : 0~1미만 난수 생성
		// 1) 1~3 사이 난수 생성
		// 2) 가위 : 1, 바위 : 2, 보 : 3
		
		System.out.print("판 입력 : ");
		int round = sc.nextInt();
		
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		for(int i = 1; i <= round; i++) {
			int randomNum = (int)(Math.random() * 3 + 1);
			String computer = null;
			
			switch(randomNum) {
				case 1: computer = "가위"; break;
				case 2: computer = "바위"; break;
				case 3: computer = "보"; break;
			}
			
			System.out.println(i + "번째 게임시작");
			System.out.print("가위/바위/보 중 하나를 입력해주세요 : ");
			String player = sc.next();
			
			System.out.printf("컴퓨터는 [%s]를 선택했습니다\n", computer);
			
			if(player.equals(computer)) {
				System.out.println("비겼습니다.");
				draw++;
			} else {
				if(( player.equals("가위") && computer.equals("바위") ) ||
				  ( player.equals("바위") && computer.equals("보") ) ||
				  (player.equals("보") && computer.equals("가위") ) ){
					System.out.println("졌습니다 ㅜㅜ");
					lose++;
				} else {
					System.out.println("이겼습니다!");
					win++;
				}
			}
			
			System.out.printf("현재 기록 : %d승 %d무 %d패\n", win, draw, lose);
			
			System.out.println("--------------------------");
		}
	}

}
