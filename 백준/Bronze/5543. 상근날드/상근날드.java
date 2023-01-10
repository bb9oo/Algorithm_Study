import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public int solution (int[] arr,int[] arr1) {
		
		int answer = 0;
		
		//오름차순 정렬
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
		//가장 싼 세트 메뉴의 가격
		answer = arr[0]+arr1[0]-50;
	
		return answer;
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		// 햄버거 배열
		int[] arr= new int[3];
		//음료 배열
		int[] arr1= new int[2];
		
		for(int i =0; i<3; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i =0; i<2; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(arr,arr1));
		
	}
}