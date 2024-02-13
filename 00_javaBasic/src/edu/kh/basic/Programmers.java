package edu.kh.basic;

import java.util.Arrays;

public class Programmers {
	
	public static void main(String[] args) {
		
		System.out.println(solution("Programmers"));
		
	}
	
	public static int[] solution(String my_string) {
        int[] answer = new int[52];
        
        // A~Z 65~90
        // a~z 97~122
        
        for(int i = 0; i < my_string.length(); i++) {
        	if(my_string.charAt(i) == my_string.toUpperCase().charAt(i)) {
        		answer[(int)my_string.charAt(i) - 65] += 1;
        	} else {
        		answer[(int)my_string.charAt(i) - 71] += 1;
        	}
        }
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
	
}