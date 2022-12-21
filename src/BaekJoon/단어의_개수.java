package BaekJoon;

import java.util.Scanner;

public class 단어의_개수 {
	public int solution(String str) {
		
		int answer = 0;
		String s[] =str.split(" ");  
	
		if (s[0]=="") {
			return answer;
		}
		else {
			return s.length;
		}
		
	}
	
	public static void main(String[] args) {
		
		단어의_개수 T = new 단어의_개수();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		str= str.trim();
	
		System.out.println(T.solution(str));
		
	}
}
