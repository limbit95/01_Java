package edu.kh.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Programmers {
	
	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {1, 2, 1, 2, 1, 10, 2, 1}));
		
	}
	
	public static int[] solution(int[] arr) {
		int[] answer = {};
        
		int cnt = 0;
		
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] == 2) {
        		cnt++;
        	}
        }
        
        int cnt2 = 0;
        
        if(cnt == 0 ) {
        	answer = new int[] {-1};
        } else if (cnt == 1) {
        	answer = new int[] {2};
        } else {
        	for(int i = 0; i < arr.length; i++) {
        		if(arr[i] == 2) {
        			cnt2++;
        		}
        		
        		if (cnt2 > 0 && cnt > 0) {
        			
        		}
        	}
        }
        
        return answer;
    }
	
}