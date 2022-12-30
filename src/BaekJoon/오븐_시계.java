package BaekJoon;

import java.util.Scanner;

public class 오븐_시계 {
	public static void main(String[] args) {
		오븐_시계 T = new 오븐_시계();
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(); //시
		int M = sc.nextInt(); //분
		int C = sc.nextInt(); // 요리하는데 필요한 시간
		int F = (M+C) / 60; // 시에 더해줄 변수
		int R = C % 60; // 분에 더해줄 변수
		
		if(H+F>=24) {
			H =(H+F) % 24;
			if(M+R<60) M = M+R;
			else M = M+R-60;
		}
		else {
			H = H+F;
			if(M+R<60) M = M+R;
			else M = M+R-60;
		}
		System.out.println(H+" "+M);
	}
}