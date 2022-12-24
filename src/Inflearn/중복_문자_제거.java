package Inflearn;

import java.util.Scanner;


public class 중복_문자_제거 {
	public String solution(String str) {
		
		String answer="";
		
		for(int i=0; i < str.length(); i++) {
			//indexOf -> 제일 처음으로 발견된 인덱스 번호를 리턴
			if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
			
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		중복_문자_제거 T = new 중복_문자_제거();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
	
		System.out.println(T.solution(str));
		
	}
}
