package Inflearn;

import java.util.Scanner;

public class 문자_찾기 {

	public int solution(String str, char t) {
		int answer = 0;
		
		//대소문자 구별하지 않기 위해 다 대문자로 바꾸기
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
		/*
		 * for(int i = 0; i<str.length(); i++) { if(str.charAt(i)==t) answer++;
		 * //String을 인덱스로 접근 }
		 */
		
		for(char x: str.toCharArray()){//문자하나하나를 분리시켜 문자 배열을 생성시킴
			if(x == t) answer++;
		}
		
		return answer;
	}
	
	
		public static void main(String[] args) {
			문자_찾기 T = new 문자_찾기();
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			char c = sc.next().charAt(0); // 문자열에서 0번째에 있는거 가저와
			
			System.out.println(T.solution(str, c));
			
		}
}
