package Inflearn;

import java.util.Scanner;


public class 회문_문자열 {
	public String solution(String str) {
		
		String answer="YES";
		int len = str.length();
		
		str = str.toUpperCase();
		
		for(int i=0; i < len/2; i++) {
			if(str.charAt(i)!= str.charAt(len-i-1)) return "NO";
		}
		
		/* StringBuilder */
		/*
		 * String answer="NO"; String tmp = new StringBuilder(str).reverse().toString();
		 * if(str.equalsIgnoreCase(tmp)) answer = "YES";
		 */
		
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		회문_문자열 T = new 회문_문자열();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
	
		System.out.println(T.solution(str));
		
	}
	
}