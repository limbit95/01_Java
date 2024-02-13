package edu.kh.basic;

import java.util.Arrays;

public class Programmers {
	
	public static void main(String[] args) {
		
		System.out.println(solution("apporoograpemmemprs", 
				new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
		
	}
	
	public static String solution(String my_string, int[] indices) {
        String answer = "";
        
        Arrays.sort(indices);
        
        int cnt = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
        	if(indices[cnt] != i) {
        		cnt++;
        		System.out.println(cnt);
        	} else {
        		answer += my_string.charAt(i); 
        	}
        	      	
        }
        
        return answer;
    }
	
}