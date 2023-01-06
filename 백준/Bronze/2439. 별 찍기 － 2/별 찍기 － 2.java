import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main T = new Main();
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		// i 번째 줄에 공백 n - i 개, 별 n개 찍고 개행
		for(int i= 1; i<= N; i++) {
			for(int j = 1; j<= N-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}