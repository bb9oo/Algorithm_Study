package Inflearn;

import java.util.Scanner;

public class 문자열_압축 {
	public String solution(String s) {
		
		String answer = "";
		s = s+" "; //맨끝에 빈문자 하나 추가해주기!
		
		int cnt =1;
		
		for(int i = 0; i< s.length(); i++) { // 빈문자전까지만 가게하기 위해서 -1
			if (s.charAt(i)==s.charAt(i+1)) cnt++;
			else {
				answer += s.charAt(i);
				
				//cnt가 1보다 크다면 answer에 
				//cnt를 String으로 변환 후 더하기
				//String.valueOf() 또는 Integer.toString(cnt) 사용 
				if(cnt>1) answer+= String.valueOf(cnt);
				cnt = 1; // 다시 cnt는 1로 초기화 
				
			}
		}
		
		
		return answer;
	}
	
	
	
	
	public static void main(String[] args) {
		
		문자열_압축 T = new 문자열_압축();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.solution(str));
		
	}
}
