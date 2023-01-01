package BaekJoon;

import java.util.Scanner;

public class 최소_최대 {
	public static void main(String[] args) {
		최소_최대 T = new 최소_최대();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<N; i++) {
			if(arr[i]>max) max=arr[i];
			if(arr[i]<min) min=arr[i];
		}
		
		System.out.println(min+" "+max);
	}
}