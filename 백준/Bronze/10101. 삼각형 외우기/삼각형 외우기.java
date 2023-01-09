import java.util.Scanner;

public class Main {
	
	public String solution (int[] arr) {
		
		String answer = "";
		int sum = 0;
		
		for (int i =0; i<arr.length; i++) {
			sum+= arr[i];
			if(arr[0]==60 && arr[1] ==60 &&arr[2]==60) answer ="Equilateral";
			else if(sum ==180 && (arr[0]==arr[1]||arr[0]==arr[2]||arr[1]==arr[2])) answer ="Isosceles";
			else if(sum ==180 && !(arr[0]==arr[1]||arr[0]==arr[2]||arr[1]==arr[2])) answer ="Scalene";
			if(sum !=180) answer ="Error";
		}
	
		return answer;
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		int[] arr= new int[3];
		for(int i =0; i<3; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(arr));
		
	}
}
