package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	
	Scanner sc = new Scanner(System.in);
	
	// for문
		// - 끝이 정해져 있는 (횟수가 지정되어 있는) 반복문
		// [작성법]
//		 for(초기식; 조건식; 증감식;) {
//		 	조건식이 true라면 반복 수행할 코드
//		 }
		
		// 초기식 : for문을 제어하는 용도의 변수 선언
		// 조건식 : for문의 반복 여부를 지정하는 식
		//			보통 초기식에 사용된 변수를 이용하여 조건식을 작성
		// 증감식 : 초기식에 사용된 변수를 for문이 끝날 때마다
		//			증가 도는 감소시켜 조건식의 결과가 변하게 하는 식
	
	public void ex1() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	public void ex2() {
		// 1부터 입력 받은 수까지 1씩 증가하며 출력
		
		System.out.print("입력 번호 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.println(i);
		}
	}

	public void ex3() {
		// 영어 알파벳 A부터 Z까지 한줄로 출력
		// 방법 1
//		for(int i = 65; i < 91; i++) {
//			System.out.print((char)i);
//		}
		// 방법 2
//		for(int i = 'A'; i < 'Z'; i++) {
//			System.out.print((char)i);
//		}
		// 방법 3
//		for(char i = 65; i < 91; i++) {
//			System.out.print(i);
//		}
	}

	public void ex4() {
		// 정수 5개를 입력 받아서 합계 구하기
		
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt();
			sum += input;
		}
		
		System.out.println("합계 : " + sum);
	}

	public void ex5() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 입력받은 수의 배수는 양쪽에 ()표시
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= 20; i++) {
			if(i % input == 0) {
				System.out.printf("(%d) ", i);
			} else {
				System.out.print(i + " ");
			}
		}
	}
	
	public void ex6() {
		// [구구단 출력]
		// 2 ~ 9 사이 수를 하나 입력받아
		// 해당 단을 출력
		// 단, 입력 받은 수가 2 ~ 9 사이 숫자가 아니면
		// "잘못 입력하셨습니다" 출력
		
		System.out.print("단 입력 : ");
		int input = sc.nextInt();
		
		if(input < 2 || input > 9) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", input, i, input * i);
			}
		}
		
		
	}
	
	public void ex7() {
		for(int i = 2; i <= 9; i++) {
			for(int k = 1; k <= 9; k++) {
				System.out.printf("%d * %d = %2d  ", i, k, i*k);
			}
			System.out.println();
		}
	}

	public void ex8() {
		// 숫자 세기 cnt
		
		// 1부터 20까지 1씩 증가하면서
		// 입력 받은 수의 배수의 총 개수 출력
		// 입력 받은 수의 배수의 합계 출력
		
		System.out.print("배수 입력 : ");
		int input = sc.nextInt();
		
		String str= "";
		int cnt = 0;
		int sum = 0;
		
		for(int i = 1; i <= 20; i++) {
			if(i % 3 == 0) {
				str += i + " ";
				cnt++;
				sum += i;
			}
		}
		
		System.out.printf("%s: %d개\n"
						+ "%d의 배수 합계 : %d",
						str, cnt, input, sum);
	}
	
}
