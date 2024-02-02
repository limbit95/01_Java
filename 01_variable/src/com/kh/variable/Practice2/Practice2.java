package com.kh.variable.Practice2;

import java.util.Scanner;

public class Practice2 {
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		System.out.println("예제 1번입니다.");
		System.out.print("문자 하나만 입력해주세요 : ");
		char ch = sc.next().charAt(0);
		System.out.println((int)ch);
	}

}
