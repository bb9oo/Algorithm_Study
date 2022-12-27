package Inflearn;

import java.util.Scanner;

public class 소수_에라토스테네스_체 {
	public int solution(int n) {
		
		int answer = 0;
		
		//n+1이라고 해야지 n번 인덱스까지 생김
		int[] ch= new int[n+1];
		
		for(int i=2; i<=n; i++) {
			if(ch[i]==0) {
				answer++;
				//j가 i의 배수로 돌아야 하니까 j=j+i
				for(int j=i; j<=n; j=j+i) ch[j]=i;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		소수_에라토스테네스_체 T = new 소수_에라토스테네스_체();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		
		System.out.print(T.solution(n));
	}
}