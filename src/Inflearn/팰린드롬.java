package Inflearn;

import java.util.Scanner;


public class 팰린드롬 {
	public String solution(String s) {
		
		String answer="NO";
		
		//정규식을 쓰기 위해 replaceAll
		//("[^A-Z]", "") -> A부터 Z까지가 아니면 빈문자화 시켜라
		//replace는 정규식 못 씀 
		s= s.toUpperCase().replaceAll("[^A-Z]", "");
		
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer ="YES";
		
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		팰린드롬 T = new 팰린드롬();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	
		System.out.println(T.solution(str));
		
	}
}