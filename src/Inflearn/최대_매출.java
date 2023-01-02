package Inflearn;

import java.util.Scanner;


public class 최대_매출 {
	public int solution(int n,int k, int[] arr ) {

		int answer, sum = 0;
		
		//첫번째 윈도우 만들기
		for(int i=0; i<k; i++) sum+= arr[i];
		answer = sum;
		
		//윈도우 밀고가기
		for(int i=k; i<n; i++) {
			sum+=(arr[i]-arr[i-k]);
			//answer 와 sum 에 큰 값을 answer로 
			answer= Math.max(answer, sum);
		}
		
        return answer;
    }

	public static void main(String[] args) {

		최대_매출 T = new 최대_매출();
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int k= sc.nextInt();
		int[] arr= new int[n];
		for(int i= 0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(T.solution(n, k, arr));
	
	}
}