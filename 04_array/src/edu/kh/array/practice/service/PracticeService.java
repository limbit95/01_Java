package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int[] arr = new int[9];
		int evenSum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			if(i % 2 == 0) {
				evenSum += arr[i];
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n짝수 번째 인덱스 합 : " + evenSum);
	}
	
	public void practice2() {
		int[] arr = new int[9];
		int oddSum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			if(i % 2 != 0) {
				oddSum += arr[i];
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n홀수 번째 인덱스 합 : " + oddSum);
	}
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("입력 " + i + " : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		boolean has = false;
		for(int i = 0; i < arr.length; i++) {
			if(input == arr[i]) {
				System.out.println("인덱스 : " + i);
				has = true;
			}
		}
		if(!has) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	public void practice5() {
		System.out.print("문자열 : ");
		String inputStr = sc.nextLine();
		System.out.print("문자 : ");
		char inputChar = sc.next().charAt(0);
		int cnt = 0;
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", inputStr, inputChar);
		for(int i = 0; i < inputStr.length(); i++) {
			if(inputStr.charAt(i) == inputChar) {
				System.out.print(i + " ");
				cnt++;
			}
		}
		System.out.println();
		System.out.println(inputChar + "개수 : " + cnt);
	}
	
	public void practice6() {
		
	}
	
	public void practice7() {
		
	}
	
}
