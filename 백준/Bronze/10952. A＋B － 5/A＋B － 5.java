import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		

		for (int i = 1; i <100; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A==0&&B==0) break;
			
			System.out.println((A+B));
			
		}
 
	}
}