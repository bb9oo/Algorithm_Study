package Inflearn;


import java.util.Scanner;

public class 격자판_최대합 {

	public int solution(int n, int[][] arr) {
		
		//가장 큰값을 넣을거니까, 가장 작은 값으로 초기화
		int answer = Integer.MIN_VALUE;
		
		int sum1;// 행의 합
		int sum2;// 열의 합
		
		//각 행 열의 합
		for(int i=0; i<n; i++) {
			sum1 = sum2 = 0;
			for(int j=0; j<n; j++) {
				sum1+=arr[i][j];
				sum2+=arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		//두 대각선의 합 
		sum1 = sum2 = 0; // 다시 초기화 
		for(int i=0; i<n; i++) {
			sum1+=arr[i][i];
			sum2+=arr[i][n-i-1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
	}

	public static void main(String[] args) {

		격자판_최대합 T = new 격자판_최대합();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//2차원 배열 생성
		int[][] arr = new int[n][n];
		
		//이중포문이 돌면서 2차열 배열을 채움
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		

		//for(int x: T.solution(n, arr)) System.out.print(x+" ");
		System.out.print(T.solution(n, arr));
	}
}