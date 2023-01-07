package BaekJoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int num3 = a * (b%10);
		int num4 = a * ((b/10)%10);
		int num5 = a * ((b/100)%10);
		int num6 = num3+(num4*10)+(num5*100);
		
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		
	}
}
