package Inflearn;

import java.util.Scanner;

public class 문자_거리 {

	public int[] solution(String s, char t) {

		int[] answer = new int[s.length()];
	
		//왼쪽에서부터 거리계산
		int p = 1000;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		
		//오른쪽에서부터 거리계산
		p=1000;// 초기화 다시 한번 해줘야 함 
		for(int i=s.length()-1; i>=0; i--) {
			if (s.charAt(i) == t) p=0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p);// 기존 값과 p중에서 작은 값을 넣기 
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {

		문자_거리 T = new 문자_거리();

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);// 문자하나를 읽을 때

		for (int x : T.solution(str, c)) {
			System.out.print(x + " ");
		}

	}
}
