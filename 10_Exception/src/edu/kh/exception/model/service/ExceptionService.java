package edu.kh.exception.model.service;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {

	// 예외(Exception) : 소스 코드의 수정으로 해결 가능한 오류
	
	// 예외는 두 종류로 구분됨
	// 1) Unchecked Exception : 선택적으로 예외 처리 (ex. Runtime Exception..)
	// 2) Checked Exception : 필수적으로 예외 처리 (ex. IOException, 나머지..)
	
	private Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		System.out.println("두 정수를 입력 받아 나누기한 몫을 출력");
		
		System.out.print("정수 입력 : ");
		int input1 = sc.nextInt();
		System.out.print("정수 입력 : ");
		int input2 = sc.nextInt();
		
		try {
			System.out.println("결과 : " + input1 / input2);
			// java.lang.ArithmeticException : 산술적 예외 ( 0으로 나눌 수 없다)
		} catch(ArithmeticException e) {
			// try에서 던져진 예외를 catch문의 매개변수 e로 잡음
			
			System.out.println("infinity"); // 처리코드
		}
		
		if(input2 != 0) {
			System.out.println("결과 : " + input1 / input2);
		} else {
			System.out.println("infinity");
		}
		
		// 발생하는 예외 중 일부 예외 try-catch 구문 사용 안해도
		// 예외 상황 방지할 수 있다! (if-else 사용)
		// 일부예외 == 대부분 Unchecked Exception
	}
	
	// 여러가지 예외에 대한 처리 방법
	public void ex2() {
		try {
			System.out.print("입력 1 : "); 
			int num1 = sc.nextInt();
			System.out.print("입력 2 : ");
			int num2 = sc.nextInt();
			
			// 발생할 수 있는 에외 경우
			// 1) InputMismatchException : 입력 1 : 에 int가 아닌 다른 자료형을 입력했을 때
			// 2) ArithmeticException : 0을 입력했을 때
			// 3) NullPointerException : String str = null; -> str.charAt(0)
			
			System.out.println("결과 : " + num1 / num2);
		} catch(InputMismatchException e) {
			System.out.println("타입에 맞는 값만 넣어주세요");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		} catch (Exception e) {
			// Exception 클래스 : 모든 예외의 최상위 부모
			// 다형성 - 업캐스팅 : 부모타입 참조변수로 자식객체 참조
			
			// ** 상위 타입의 예외 클래스를 catch문에 작성하면 
			//    다형성 업캐스팅에 의해 모두 잡아서 처리 가능 **
			
			System.out.println("뭔지 모르겠으나 예외가 발생해서 처리함");
			e.printStackTrace(); 
			// 발생한 예외가 메서드와 위치에 대한 모든 내용을 출력
			// 예외 발생 지점 추적
		}
	}

	public void ex3() {
		// try - catch - finally
		// finally : try 구문에서 예외가 발생하든 말든 무조건 마지막에 수행
		
		try {
			System.out.print("입력 1 : "); 
			int num1 = sc.nextInt();
			System.out.print("입력 2 : ");
			int num2 = sc.nextInt();
			
			System.out.println("결과 : " + num1 / num2);
		} catch(ArithmeticException e) {
			System.out.println("예외 처리 됨");
			
			// catch문 매개변수 활용
			// 매개변수 e : 예외 관련된 정보 + 예외 관련 기능
			
			System.out.println( e.getClass() ); // 어떤 예외 클래스인가?
			// class java.lang.ArithmeticException
			
			System.out.println( e.getMessage() ); // 예외 발생시 출력된 내용
			// / by zero
			
			System.out.println( e ); // == e.toString();
			// class java.lang.ArithmeticException: / by zero
		} finally {
			System.out.println("무조건 수행 됨");
			sc.close(); 
			// Scanner 사용은 메모리 영역에 통로를 열어두는 것이므로 사용을 다한 이후에는
			// 그 통로를 닫아주어야 메모리 누수를 방지할 수 있다
			// 이럴 때 finally 구문에 sc.close(); 를 사용해주면 됨!
		}
	}

	public void ex4() {
		// throws: 호출한 메서드에게 예외를 던짐
		//		   -> 호출한 메서드에게 예외를 처리하라고 위암하는 행위
		
		// throw : 예외 강제 발생 구문
		
		try {			
			methodA();
		} catch (Exception e) {
			// Exception : 모든 예외의 최상위 부모
			// == 예외 종류 상관없이 모두 처리
			
			System.out.println("methodC 에서부터 발생한 예외를 ex4에서 잡아 처리함");
		}
	}
	
	public void methodA() throws IOException {
		methodB();
	}
	
	public void methodB() throws IOException {
		methodC();
	}
	
	public void methodC() throws IOException {
		// 예외 강제 발생
		
		// 이런 방법도 있지만 methodB() 에서 예외가 발생 시 또 따로 처리해야 하므로
		// 예외 처리를 다른 메서드에게 위임(던지기)을 하여 몰아 예외 처리 하는 방법이 있다
//		try {
//			throw new IOException();			
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
		
		throw new IOException();
	}
	
}