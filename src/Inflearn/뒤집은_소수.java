package Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class 뒤집은_소수 {
	
	public boolean isPrime(int num) {
		if(num ==1) return false;
		for (int i = 2; i<num; i++) { // 2부터 자기자신 숫자 전까지
			if(num%i==0) return false; // 약수가 나온다면 false
		}
		
		//위의 조건에 걸리지 않는다면 true
		return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i = 0; i<n; i++ ) {
			int tmp = arr[i];
			int res = 0;

			// tmp가 0보다 클 때만 반복문이 돌아야 함
			while (tmp > 0) {
				// ① 일의자리 수를 뽑아냄
				int t = tmp % 10;
				// ② 뒤집힌 결과가 저장되는 res
				res = res * 10 + t;
				// ③ tmp를 일의자리수를 잘라낸 수로 재정의
				tmp = tmp / 10;
			}
			
			//뒤집은 수가 소수이면 배열에 추가
			if(isPrime(res)) answer.add(res);		
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		뒤집은_소수 T = new 뒤집은_소수();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int[] arr = new int[n];	
		
		for (int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int x: T.solution(n,arr)) {
			System.out.print(x+" ");
		}
	}
}