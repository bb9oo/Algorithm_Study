import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String answer = "";

		for (int i = 1; i <=100; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A>B) answer = "Yes";
			else if(A<=B) answer = "No";
			if(A==0&&B==0) break;
			
			System.out.println((answer));
			
		}
	}
}
