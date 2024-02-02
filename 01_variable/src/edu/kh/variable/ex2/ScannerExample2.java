package edu.kh.variable.ex2;
import java.util.Scanner;

public class ScannerExample2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 입력 값 : ");
		double input1 = sc.nextDouble();
		System.out.print("두 번째 입력 값 : ");
		double input2 = sc.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f\n", input1, input2, input1 + input2);
		System.out.printf("%.2f - %.2f = %.2f\n", input1, input2, input1 - input2);
		System.out.printf("%.2f * %.2f = %.2f\n", input1, input2, input1 * input2);
		System.out.printf("%.2f / %.2f = %.2f\n", input1, input2, input1 / input2);
		
	}
}