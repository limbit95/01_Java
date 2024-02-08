package edu.kh.basic;

public class Programmers {
	
	public static void main(String[] args) {
		
		System.out.println(solution(3, 1, "qjnwezgrpirldywt"));
		
	}
	
	public static String solution(int q, int r, String code) {
        String answer = "";
        
        char[][] arr = new char[(int)(Math.floor((double)(code.length())/q))][q];
        
        int cnt = 0;
        
        for(int i = 0; i < arr.length; i ++) {
        	for(int x = 0; x < q; x ++) {
        		arr[i][x] = code.charAt(cnt);
        		cnt++;
        		if(x == r) {
        			answer += arr[i][x];
        		}
        	}
        }
        
        return answer;
    }
	
}