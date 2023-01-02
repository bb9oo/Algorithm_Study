package BaekJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 세_수 {
	public ArrayList<Integer> solution(int n, int[] a ) {

		ArrayList<Integer> answer = new ArrayList<>();
        
		// a배열 오름차순으로 정렬
		Arrays.sort(a);
		
		// 두 번째로 큰 정수를 answer에 넣기
		answer.add(a[1]);
		
        return answer;
    }

	public static void main(String[] args) {

		세_수 T = new 세_수();
		Scanner sc = new Scanner(System.in);
		int n= 3;
		int[] a= new int[n];
		for(int i= 0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		
		for(int x:T.solution(n,a)) System.out.println(x);
	
	}
}
