package Inflearn;

import java.util.Scanner;

public class 가위바위보 {
	public String solution(int n, int[] a, int[] b ) {
		
		String answer =""; 

		for(int i = 0; i<n; i++) {
			if(a[i]==b[i]) answer +="D";
			else if(a[i]==1 && b[i]==3) answer +="A";
			else if(a[i]==2 && b[i]==1) answer +="A";
			else if(a[i]==3 && b[i]==2) answer +="A";
			else answer +="B";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		가위바위보 T = new 가위바위보();
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] a = new int[n];	
		int[] b = new int[n];	
		
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		
		// 리턴받은 String을 문자배열화 만든 다음 하나씩 뽑아서 출력
		for(char x: T.solution(n, a, b).toCharArray())System.out.println(x);
	}
}