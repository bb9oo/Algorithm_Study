package Inflearn;

import java.util.Scanner;

public class 암호 {
	
	public String solution(int n, String s) {
		String answer = "";
		
		for(int i=0; i< n; i++) {
			String tmp = s.substring(0,7).replace('#', '1').replace('*', '0');
			
			//tmp가 이진수로 넘어가서 숫자로 변환
			int num = Integer.parseInt(tmp,2);
			// 문자로 변환후 answer에 누적
			answer +=(char)num;
			//s를 7번째 뒤 문자로 바꿈
			s = s.substring(7);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		암호 T = new 암호();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		
		System.out.println(T.solution(n,str));

		
		
	}
}
