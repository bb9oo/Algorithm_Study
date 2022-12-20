package Inflearn;

import java.util.Scanner;

public class 대소문자_변환 {
	
	public String solution(String str) {
		String  answer = "";
		
		for(char x : str.toCharArray()) {
			/*
			 * //x가 소문자라면 answer에 x를 대문자로 바꾼것을 누적 if(Character.isLowerCase(x))
			 * answer+=Character.toUpperCase(x); //x가 대문자라면 answer에 x를 소문자로 바꾼것을 누적 else
			 * answer+=Character.toLowerCase(x);
			 */
			
			//아스키 넘버로 푸는 방법
			if(x>=97 && x<=122) answer+=(char)(x-32);//소문자라면 대문자로 변환(대소문자 차이 = 32)
			else answer+=(char)(x+32);
			
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		대소문자_변환 T = new 대소문자_변환();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		
	}
}
