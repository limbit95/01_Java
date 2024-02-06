package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	
	Scanner sc = new Scanner(System.in);
	
	// 배열(Array)
	// - 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	// - 묶여진 변수들은 하나의 배열명으로 불려지고
	//   구분은 index를 이용함 (index는 0부터 시작하는 정수)
	
	public void ex1() {
		// 변수 vs 배열
		
		// 변수 선언
		int num;
		// stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 할당하고
		// 그 공간에 num이라는 이름을 부여
		
		// 변수 대입
		num = 10;
		// 생성된 num이라는 변수 공간에 10 이라는 값을 대입
		
		// 변수 사용
		System.out.println("num에 저장된 값 : " + num);
		// 출력문에 작성된 num자리에 num에 저장된 값을 읽어와서 출력
		
		// 배열 선언
		int[] arr; 
		// stack 영역에 int[] 자료형 공간을 4byte 할당하고 
		// 그 공간에 arr 이라는 이름을 부여
		// 해당 변수는 참조형으로 주소 값만을 저장할 수 있다
		
		// 배열의 할당
		arr = new int[3];
		// new : "new 연산자" 라고 하며
		//		 Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당
		
		// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		// new int[3] : Heap 영역에 int 3칸짜리 int[]을 생성(할당)
		//				생성된 int[]에는 시작 주소가 지정된다
		
		// arr = new int[3];
		//(int[])    (int[])   -> 같은 자료형 == 연산 가능
		
		// Heap 영역에 생성된 int[]의 시작주소를
		// stack 영역에 생성된 arr 변수에 대입
		
		// -> arr 변수가 int[]를 참조하게 됨
		//    그래서 arr을 참조형이라고 함
		
		System.out.println("arr의 주소값? : " + arr); // [I@5577140b
		
		// 배열 요소 값 대입
		// arr은 int[] 참조형 변수이지만 
		// arr[0], arr[1], arr[2] 은 int 자료형 변수이기 때문에 정수 값을 대입할 수 있음
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 1000;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
	}

	public void ex2() {
		// 배열 선언 및 할당
		int[] arr = new int[4];
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 500;
		arr[3] = 1000;
		
		// 배열의 길이 (몇 칸 인가) : 배열명.length
		System.out.println("배열의 길이 : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
		}
		
	}
	
	public void ex3() {
		// 5명의 키(cm)를 입력 받고 평균 구하기
		
		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 165.7
		// 3번 키 입력 : 184.3
		// 4번 키 입력 : 190.2
		// 5번 키 입력 : 174.4
		
		double[] height = new double[5];
		// double[] 자료형 참조 변수 height를 stack 영역에 생성하고
		// height에 Heap 영역에 새로 생성된 double 5칸 짜리 double[]의 시작 주소를 대입
		
		double sum = 0;
		
		for(int i = 0; i < height.length; i++) {
			System.out.print((i+1) + "번 키 입력 : ");
			height[i] = sc.nextDouble();
			sum += height[i];
		}
		
		System.out.printf("평균 : %.2f", sum / height.length);
	}
	
	public void ex4() {
		// 입력 받은 인원 수 만큼의 점수를 입력 받아 배열에 저장
		// 입력이 완료되면 점수 합계, 평균, 최고점, 최저점 출력
		
		System.out.print("입력 받을 인원 수 : ");
		int input = sc.nextInt();
		
		int[] score = new int[input];
		
		int sum = 0;
		
		for(int i = 0; i < input; i++) {
			System.out.print((i+1) + "번 점수 입력 : ");
			score[i] = sc.nextInt();
			sum += score[i]; 
		}
		
		double avg = (double)sum / score.length;
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			} 
		}
		
		for(int i = 0; i < score.length; i++) {
			if(score[i] < min) {
				min = score[i];
			} 
		}
		
		System.out.printf("합계 : %d\n"
						+ "평균 : %.2f\n"
						+ "최고점 : %d\n"
						+ "최저점 : %d", sum, avg, max, min);
		
	}
	
	public void ex5() {
		// 배열 선언과 동시에 초기화
		
		char[] arr = new char[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (char)('A' + i);
		}
		
		// Arrays 클래스
		// -> Java에서 제공하는 배열과 관련된 기능을 모아둔 클래스
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = new int[4];
		System.out.println(Arrays.toString(arr2));
		// int형 배열 4칸짜리 생성 후 각 인덱스에 값을 대입하지 않았으므로
		// JVM에 의해 int형 기본값인 0으로 각각 초기화 되어있음
		
		boolean[] arr3 = new boolean[2];
		System.out.println(Arrays.toString(arr3));
		String[] arr4 = new String[3];
		System.out.println(Arrays.toString(arr4));		
		
		// 배열 선언과 동시에(할당 및) 초기화
		char[] arr5 = {'A', 'B', 'C', 'D', 'E'};
		// {} (중괄호)는 배열의 리터럴 표기법
		System.out.println(Arrays.toString(arr5));
		
	}
	
	public void ex6() {
		// 점심 메뉴 뽑기 프로그램
		
		String[] arr = {"김밥", "서브웨이", "햄버거", "백반", "국밥", "파스타"};
		
		int randomNumber = (int)(Math.random() * arr.length);
		
		System.out.println(randomNumber);
		System.out.println("오늘 점심 메뉴 : " + arr[randomNumber]);
	}

	public void ex7() {
		// 배열을 이용한 검색
		// 입력 받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇 번 인덱스에 존재하는지 출력
		
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		boolean none = true;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == input) {
				System.out.println(i + "번째 인덱스에 존재");
				none = false;
			}
		}
		if(none) {
			System.out.println("존재하지 않음");
		}
	}

	public void ex8() {
		// 입력 받은 값과 일치하는 값이 있으면 인덱스 번호 출력
		// 없으면 '존재하지 않음" 출력
		
		String[] arr = {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		
		System.out.print("과일 입력 : ");
		String input = sc.next();
		
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(input)) {
				System.out.println(i + "번 인덱스에 존재");
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("존재하지 않음");
		}
	}

	public void ex9() {
		// 1. 문자열을 입력받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
		// 2. 문자 하나를 입력 받아 일치하는 문자가 char 배열에 몇 개 존재하는지 호가인
		// 3. 단, 일치하는 문자 없을 경우 "존재하지 않습니다" 출력
		
		System.out.print("문자열 입력 : ");
		String input = sc.next();
		
		char[] chArr = new char[input.length()];
		
		for(int i = 0; i < input.length(); i++) {
			chArr[i] = input.charAt(i);
		}
		
		System.out.print("검색할 문자 입력 : ");
		char search = sc.next().charAt(0);
		
		int cnt = 0;
		
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] == search) {
				cnt++;
			}
		}
		
		if(cnt == 0) {
			System.out.println("존재하지 않음");
		} else {
			System.out.println(cnt + "개 있음");
		}
	}
	
}
