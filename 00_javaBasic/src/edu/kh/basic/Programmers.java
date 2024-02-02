package edu.kh.basic;

import java.util.ArrayList;

public class Programmers {
	
	public static void main(String[] args) {
		
		System.out.println(Solution(new int[] {1, 4, 2, 5, 3}));
		
	}
	
	public static ArrayList<Integer> Solution(int[] arr) {
		ArrayList<Integer> stk = new ArrayList<Integer>();
		
		int i = 0;
		
		while(i < arr.length) {
			if(stk.isEmpty() == true) {
				stk.add(arr[i]);
				i++;
				System.out.println("a");
			} 
//			else {
//				if((stk.get(stk.size()-1)) < arr[i]) {
//					stk.add(arr[i]);
//					i++;
//				} 
//			}
		}
		
		
        return stk;
	}
	
}