package Inflearn;

import java.util.Scanner;

public class 특정_문자_뒤집기 {
	public String solution(String str) {
		
		String answer;
		char[] s = str.toCharArray(); // str을 기반으로 한 문자 배열 생성
		int lt =0, rt = str.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt])) lt ++; //알파벳인지 알 수 있는 방법
			else if (!Character.isAlphabetic(s[rt])) rt --;
			else {
				char tmp  =s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		
		//String 전환해서 answer에 담기
		answer = String.valueOf(s);
		return answer;
	}
	
	public static void main(String[] args) {
		
		특정_문자_뒤집기 T = new 특정_문자_뒤집기();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.solution(str));
		
	}
}
