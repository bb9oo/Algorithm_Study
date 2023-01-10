import java.util.Scanner;

public class Main {
	
	public int[] solution (int[] arr) {
		int[] answer = new int[2];
		int max = 0;
		
		for(int i =0; i<9; i++) {
			if(arr[i]>max) {
				max = arr[i];
				answer[0]=max;
				answer[1]=i+1;
			}
		}
	
		return answer;
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		int[] arr= new int[9];
		
		for(int i =0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x:T.solution(arr))System.out.println(x);
		
	}
}
