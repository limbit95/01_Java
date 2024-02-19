package edu.kh.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers {
	
	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {1, 2, 1, 4, 5, 2, 9}));
		
		
	}
	
	public static int[] solution(int[] arr) {
        int[] answer = new int[5];
        
        boolean flag = false;
        
        int lastIdx = 0;
        
        int cnt = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	for(int x = 0; x < arr.length; x++) {
        		if(arr[x] == 2) {
            		flag = true;
            		lastIdx = x;
            	} 
        	}
        	
        	if(flag && i <= lastIdx) {
        		answer[cnt] = arr[i];
        		cnt++;
        	}
        }
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
	
}