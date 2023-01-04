package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class X_보다_작은_수 {
	public ArrayList<Integer> solution(int[] arr, int N, int X) {

		ArrayList<Integer> answer = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			if (arr[i] < X)
				answer.add(arr[i]);
		}

		return answer;
	}

	public static void main(String[] args) {

		X_보다_작은_수 T = new X_보다_작은_수();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		for (int x : T.solution(arr, N, X)) System.out.print(x + " ");

	}
}
