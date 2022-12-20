package Inflearn;

import java.util.Scanner;

public class 문장_속_단어 {
	
	public String solution(String str) {
		String answer = "";
		
		int m = Integer.MIN_VALUE,pos; //가장 작은 값으로 초기화
		
		/*
		 * //띄어쓰기로 구별한 단어를 스트링 배열에 저장 String[] s = str.split(" "); for(String x : s) {
		 * int len = x.length(); if(len > m) { m = len; answer = x; } }
		 */
		
		// 첫번째로 발견되는 띄어쓰기의 위치를 리턴
		// 발견못하면 -1을 리턴
		while((pos=str.indexOf(' '))!=-1){
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			if (len > m) {
				m = len;
				answer = tmp;
			}
			//str을 바꿔 줌
			str = str.substring(pos+1);
		}
		//마지막 단어 처리
		if(str.length()>m) answer = str;
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		문장_속_단어 T = new 문장_속_단어();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();//단어가 아니라 한줄을 입력받아야 하니까 next 아니고 nextLine
		
		System.out.println(T.solution(str));
		
	}
}
