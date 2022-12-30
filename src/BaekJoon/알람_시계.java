package BaekJoon;

import java.util.Scanner;

public class 알람_시계 {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M-45<0) {
			if(H==0) H = 23;
			else H = H-1;
			M= 60+M-45;
		}
		else M = M-45;
		
		System.out.println(H+" "+M);
	}
}