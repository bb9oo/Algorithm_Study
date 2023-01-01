package Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class 두_배열_합치기 {
	public ArrayList<Integer> solution(int n,int m, int[] a, int[] b) {

		ArrayList<Integer> answer = new ArrayList<>();
        
		int p1=0, p2=0;
		
		//포인터가 가르키는 값이 하나라도 
		//각 배열의 길이를 넘어가게 되면 while문이 멈춤
		while(p1<n && p2<m) {
			if(a[p1]<b[p2]) answer.add(a[p1++]);//answer 배열에 a[p1++] 넣은 뒤 p1++
			else answer.add(b[p2++]);
		}
		
		// 어느 한쪽의 값이 answer 배열에 모두 들어갔다면
		// 남아 있는 배열의 값을 다 answer에 넣어주기
		
		//어느 배열이 남았는지 모르니까 모든 배열에 대해서 while문 실행
		//a 배열이 남아있다면 
		while(p1<n) answer.add(a[p1++]);
		//b 배열이 남아있다면 
		while(p2<m) answer.add(b[p2++]);
		
        return answer;
    }

	public static void main(String[] args) {

		두_배열_합치기 T = new 두_배열_합치기();
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