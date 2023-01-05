package Inflearn;

import java.util.Scanner;

public class 연속_부분_수열 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0, sum = 0, lt = 0;
		
		for (int rt = 0; rt < n; rt++) {
			sum += arr[rt];
			//처음에 한번만 더하고 확인
			if (sum == m) answer++;
			//그 다음부터는 증가하고 더하고 확인
			while (sum >= m) { //하나빼서 안되는 경우가 있으니까 while
				sum -= arr[lt++]; //lt값을 빼고 나서 증가
				if (sum == m) answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		연속_부분_수열 T = new 연속_부분_수열();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(T.solution(n, m, arr));
	}
}