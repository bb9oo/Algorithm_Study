package Inflearn;

import java.util.Scanner;

public class 임시반장_정하기 {

	public int solution(int n, int[][] arr) {
		int answer = 0, max = Integer.MIN_VALUE;
		
		//i는 학생 번호
		for (int i = 1; i <= n; i++) {
			int cnt = 0;
			for (int j = 1; j <= n; j++) {
				//1학년때부터 5학년때까지
				for (int k = 1; k <= 5; k++) {
					if (arr[i][k] == arr[j][k]) {
						cnt++;
						break; // 중복으로 세지 않기 위해서
					}
				}
			}
			if (cnt > max) {
				max = cnt;
				answer = i;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		임시반장_정하기 T = new 임시반장_정하기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		// 1번 인덱스 부터 사용할거라 n+1
		// 1학년~6학년
		int[][] arr = new int[n + 1][6];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 5; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}