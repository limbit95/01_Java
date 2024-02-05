package edu.kh.basic;

import java.util.ArrayList;

public class Programmers {
	
	public static void main(String[] args) {
		
		System.out.println(solution("123"));
		
	}
	
	public static int solution(String number) {
        int answer = 0;
        
        int sum = 0;
        
        for(int i = 0; i < number.length(); i++) {
        	sum += number.charAt(i);
        }
        
        answer = sum % 9;
        
        return answer;
    }
	
}