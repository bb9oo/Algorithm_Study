package Inflearn;

import java.util.Scanner;

public class 보이는_학생 {
	public int solution(int n,int[] arr) {
		
		int answer =1; //첫번째 사람은 무조건 보이니까 1
		int max = arr[0]; // 일단 첫번째 사람을 max로 잡고 하나하나 비교하면서 max 값 바꿔주기
		for(int i = 1; i<n; i++) {
			if(arr[i]>max) {
				answer++;
				max = arr[i];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		보이는_학생 T = new 보이는_학생();
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr = new int[n];	
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(T.solution(n, arr));
	}
}