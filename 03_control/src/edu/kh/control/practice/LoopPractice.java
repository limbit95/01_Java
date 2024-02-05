package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		for(int i = 1; i <= input; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void practice2() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		for(int i = input; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void practice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= input; i++) {
			sum += i;
			System.out.print(i + " + ");
			if(i == input) {
				System.out.print(i + " = ");
			}
		} System.out.println(sum);
	}
	
	public void practice4() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			if(num1 < num2) {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			} else {
				for(int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			}
		}
		
	}
	
	public void practice5() {
		
	}
	
	public void practice6() {
		
	}
	
	public void practice7() {
		
	}
	
	public void practice8() {
		
	}
	
	public void practice9() {
		
	}
	
	public void practice10() {
		
	}
	
	public void practice11() {
		
	}
	
	public void practice12() {
		
	}
	
	public void practice13() {
		
	}
	
}
