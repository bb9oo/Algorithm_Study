package BaekJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 수_정렬하기 {
	public ArrayList<Integer> solution(int n, int[] a ) {

		ArrayList<Integer> answer = new ArrayList<>();
        
		// a배열 오름차순으로 정렬
		Arrays.sort(a);
		
		for (int i=0; i<n; i++) {
			answer.add(a[i]);
		}
		
        return answer;
    }

	public static void main(String[] args) {

		수_정렬하기 T = new 수_정렬하기();
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] a= new int[n];
		for(int i= 0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		
		for(int x:T.solution(n,a)) System.out.println(x);
	
	}
}