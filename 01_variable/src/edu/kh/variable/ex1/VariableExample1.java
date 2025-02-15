package edu.kh.variable.ex1;

public class VariableExample1 {
	
	// java 파일을 실행할 때 main 메서드를 가장 먼저 찾는다
	public static void main(String[] args) {
		
		// 변수 사용하지 않고 출력
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);
				
		System.out.println("------------------------------");
		
		// 변수 사용하여 출력
		// 변수 (Variable)
		// - 메모리(RAM)에 값을 기록하는 공간
		//   - 공간에 기록되는 값(Data)이 변할 수 있어서 변수라고 함
		
		// - 변수는 여러 종류 존재(저장되는 값의 형태, 크기가 다름)
		
		// 변수 사용의 장점
		// 1. 가독성 증가
		// 2. 재사용성 증가(한 번 만든 변수를 계속 사용)
		// 3. 코드 길이 감소
		// 4. 유지보수성 증가(코드 수정 간단해짐)
		
		double pi = 3.141592653589793;
		int r = 5; // 반지름(radius)
		int h = 20; // 높이(height)
		System.out.println(2 * pi * r); // 원의 둘레
		System.out.println(pi * r * r); // 원의 넓이
		System.out.println(pi * r * r * h); // 원기둥의 부피
		System.out.println(4 * pi * r * r); // 구의 겉넓이
		
		
		
		
	}

}