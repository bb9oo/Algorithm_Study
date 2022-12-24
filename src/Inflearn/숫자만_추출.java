package Inflearn;

import java.util.Scanner;

public class 숫자만_추출 {
	public int solution(String s) {
		
		String answer="";
		
		/*
		 * //문자 '0'의 아스키 번호 48 //문자 '9'의 아스키 번호 57 // 48~57 -> 문자형 숫자라는 의미 //x>=48 &&
		 * x<=57
		 * 
		 * for(char x :s.toCharArray()) { if(x>=48 && x<=57) answer= answer *10+(x-48);
		 * }
		 */
		
		for(char x :s.toCharArray()) {
			if(Character.isDigit(x)) answer+=x;
		}
			
		//String으로 누적된 것을 정수형으로 리턴하기
		return Integer.parseInt(answer);
		
	}
	
	public static void main(String[] args) {
		
		숫자만_추출 T = new 숫자만_추출();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
	
		System.out.println(T.solution(str));
		
	}
	
}