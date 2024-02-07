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
		System.out.print("정수 : ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총 합 : " + sum);
	}
	
	public void practice7() {
		System.out.print("주민등록번호(-포함) : ");
		String humanId = sc.next();
		
		for(int i = 0; i < humanId.length(); i++) {
			if(i > 7) {
				System.out.print("*");
			} else {
				System.out.print(humanId.charAt(i));
			}
		}
		
		
	}

	public void practice8() {
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		if(input % 2 == 0 || input < 3 || input < 0) {
			System.out.println("다시 입력하세요");
		} else {
			int[] arr = new int[input];
			int num = 1;
			
			for(int i = 0; i < input; i++) {
				if(i >= input / 2) {
					arr[i] = num;
					num--;
				} else {
					arr[i] = num;
					num++;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public void practice9() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		System.out.println("발생한 난수 : " + Arrays.toString(arr));
	}
	
	public void practice10() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			} else if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("발생한 난수 : " + Arrays.toString(arr));
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice11() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			int randomNum = (int)(Math.random() * 10 + 1);
			arr[i] = randomNum;
			
			for(int x = 0; x < i; x++) {
				if(arr[x] == randomNum) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice12() {
		int[] arr = new int[6];
		for(int i = 0; i < arr.length; i++) {
			int randomNum = (int)(Math.random() * 10 + 1);
			arr[i] = randomNum;
			
			for(int x = 0; x < i; x++) {
				if(arr[x] == randomNum) {
					i--;
				}
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice13() {
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		char[] arr = new char[input.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		System.out.println("문자열에 있는 문자 : " + Arrays.toString(arr));
		System.out.println("문자 개수 : " + arr.length);
	}
	
	// 잘못된 값을 입력했을 때의 경고메시지 추가
	public void practice14() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[size];
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		boolean flag = true;
		
		while(flag) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String yesNo = sc.next();
			if(yesNo.toLowerCase().equals("y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				size += sc.nextInt();
				int plusSize = size;
				sc.nextLine();
				String[] arr2 = new String[plusSize];
				
				for(int i = 0; i < arr2.length; i++) {
					if(i < arr.length) {
						arr2[i] = arr[i];
					} else {
						System.out.print((i+1) + "번째 문자열 : ");
						arr2[i] = sc.nextLine();
					}
				}
				arr = arr2;
			} else if(yesNo.toLowerCase().equals("n")) {
				flag = false;
				System.out.println(Arrays.toString(arr));
			}
		}
	}
	
}
