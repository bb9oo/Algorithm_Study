package Inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 공통_원소_구하기 {
	public ArrayList<Integer> solution(int n,int m, int[] a, int[] b) {

		ArrayList<Integer> answer = new ArrayList<>();
        
		// a,b배열 오름차순으로 정렬
		Arrays.sort(a);
		Arrays.sort(b);
		
		int p1=0, p2=0;
		
		while(p1<n && p2<m) {
			//같다면 answer에 값넣고 a[p1]b[p2] 동시에 증가
			if(a[p1]==b[p2]) {
				answer.add(a[p1++]);
				p2++;
			}
			//작은 쪽을 증가시킴
			else if(a[p1]<b[p2]) p1++;
			else p2++;
		}
        return answer;
    }

	public static void main(String[] args) {

		공통_원소_구하기 T = new 공통_원소_구하기();
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] a= new int[n];
		for(int i= 0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[] b= new int[m];
		for(int i=0; i<m; i++) {
			b[i] = sc.nextInt();
		}
		for(int x:T.solution(n,m,a,b)) System.out.print(x+" ");
	
	}

}