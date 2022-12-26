package BaekJoon;

import java.util.Scanner;

public class 주사위_세개 {
	public int solution(int num1,int num2,int num3) {
		
		int answer =0;
			
		if(num1==num2 && num1==num3) answer=10000+num1*1000;
		else if (num1==num2 || num1==num3) {
			int i= num1;
			answer=1000+ i*100;
		}
		else if (num1==num3 ||num2==num3) {
			int i= num3;
			answer=1000+ i*100;
		}
		else {
			int smax = Math.max(num1, num2);
			int max = Math.max(smax, num3);
			answer = max*100;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		주사위_세개 T = new 주사위_세개();
		Scanner sc = new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		System.out.println(T.solution(num1,num2,num3));
	}
}