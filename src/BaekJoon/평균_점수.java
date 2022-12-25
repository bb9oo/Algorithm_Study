package BaekJoon;

import java.util.Scanner;

public class 평균_점수 {
	public int solution(int[] score) {
		
		int answer = 0;
		int sum = 0;
		
		for (int i =0;i< score.length; i++) {
			if(score[i]<40) sum += 40;
			else sum+= score[i];
		}
		
		answer = sum/5;
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		평균_점수 T = new 평균_점수();
		Scanner sc = new Scanner(System.in);
		int[] score=new int[5];
		for (int i =0;i< score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(score));
		
	}
}
