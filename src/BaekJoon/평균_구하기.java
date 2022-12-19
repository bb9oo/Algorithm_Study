package BaekJoon;

import java.util.Scanner;

public class 평균_구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 시험 본 과목의 개수 
		int A[] = new int[N]; // 시험 본 과목 개수의 길이만큼 배열 생성하고
		for (int i = 0 ; i < N ; i++) { 
			A[i] = sc.nextInt(); // A[i]에 각 점수 입력 받기 
		}
		
		long sum = 0; // 총합
		long max = 0; // 최고 점수 
		
		//최고점은 max에 총점은 sum에 저장
		for (int i = 0 ; i < N ; i++) {
			if (A[i] > max) max = A[i];
			sum = sum + A[i];
			
		}
		
		System.out.println(sum * 100.0 / max / N);
		
		sc.close();
		
	}
}
