import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine(); // 개행 문자 제거해주기
		
		String[] arr= new String[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextLine();
			System.out.println((i + 1) + ". " + arr[i]);
		}
		sc.close();
		
	}
}
