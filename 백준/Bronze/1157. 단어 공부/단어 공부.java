import java.util.Scanner;

public class Main {
	public String solution(String str) {
		
		int[] cnt = new int[26]; // 알파벳 'A~Z' 는 총 16개
		
		for (int i = 0; i < str.length(); i++) {

			int num = str.charAt(i) - 'A';
			cnt[num]++;

		}
		
		int max = 0;
		char answer = '?';

		for (int i = 0; i < cnt.length; i++) {
			if(max < cnt[i]){
                max = cnt[i];
                answer = (char)(i+'A');
            } else if (max == cnt[i]){
                answer = '?';
            }
		}
		
		String answer1 = String.valueOf(answer);
		
		
		return answer1;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		
		System.out.println(T.solution(str));

	}
}