import java.util.Scanner;

public class Main {
	public String[] solution(String[] str) {
	
		String[] answer = str;
		
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		do {
			N = sc.nextInt();
		}while(1>N||N>10);
		
		String[] str = new String[N];
		for(int i= 0; i<N; i++) {
			str[i] = sc.next().toLowerCase();
		}
		
		for(String x: str)System.out.println(x);

	}
}