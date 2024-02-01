package edu.kh.variable.practice;

public class CastingPractice {

	public static void main(String[] args) {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println( iNum1 / iNum2 ); // 2
		System.out.println( (int)dNum ); // 2
		
		System.out.println( iNum2 * dNum ); // 10.0
		System.out.println( (float)iNum1 ); // 10.0
		
		System.out.println( iNum1 / (float)iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5
		
		System.out.println( (int)fNum ); // 3
		System.out.println( iNum1 / (int)fNum ); // 3
		
		System.out.println( iNum1 / (float)fNum );// 3.3333333
		System.out.println( iNum1 / (double)fNum ); // 3.3333333333333335
		
		// float : 소수점 아래 8번쨰 자리까지 연산 후 반올림
		// double : 소수점 아래 16번쨰 자리까지 연산 후 반올림
		
		System.out.println( ch ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)ch + iNum1 ); // 75
		System.out.println( (char)((int)ch + iNum1) ); // 'K'
		
	}
}
