package Inflearn;

import java.util.Scanner;

public class 연속된_자연수의_합 {
	public int solution(int n) {
		
		int answer = 0, sum = 0, lt = 0;
		
		//연속된 자연수가 몇가지 필요한 지 구하기
		int m = n/2+1;
		int[] arr = new int[m];
		
		//1부터 m까지 배열에 넣기 
 		for(int i = 0; i < m; i++) arr[i] = i+1; //0번 인덱스에 1, 1번 인덱스에 2....
		
 		for(int rt=0; rt< m; rt++) {
 			sum+= arr[rt];
 			if(sum == n) answer++;
 			//sum이 n보다 크거나 같으면,
 			//sum에서 lt값을 빼고 lt값 증가 후 확인까지!
 			while(sum >= n) {
 				sum-= arr[lt++];
 				if(sum == n) answer++;
 			}
 		}
		return answer;
	}
	
	public static void main(String[] args) {
		연속된_자연수의_합 T = new 연속된_자연수의_합();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}
