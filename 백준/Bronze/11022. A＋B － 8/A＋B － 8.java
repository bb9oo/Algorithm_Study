import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int[] arr= new int[a];
		

		for (int i = 1; i <= a; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
 
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
		}
 
		
	}
}