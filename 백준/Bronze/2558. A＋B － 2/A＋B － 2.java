import java.util.Scanner;

public class Main {
	public int solution(int A, int B) {

		int answer = A+B;
		
        return answer;
    }

	public static void main(String[] args) {

		Main T = new Main();
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(T.solution(A, B));
	
	}
}