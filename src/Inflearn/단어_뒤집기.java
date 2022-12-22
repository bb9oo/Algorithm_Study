package Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어_뒤집기 {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();

		for (String x : str) {
			char[] s = x.toCharArray();// String을 문자 배열로 바꿔주기
			int lt=0, rt=x.length()-1; // 0 번 인덱스를 lt, 마지막 인덱스를 rt로 하기(length()-1))
			
			// lt가 rt보다 작을 때 계속 lt와 rt를 바꿔주다가 
			// lt가 rt와 같거나 커지게 되면 반복문 스탑
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] =s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			// 배열을 다시 String화 시켜서 tmp 에 넣기
			String tmp = String.valueOf(s); // valueOf는 static으로 선언된 class 메소드다.
			answer.add(tmp);
		}
		
		/*
		 * for(String x: str) { // x라는 단어로 StringBuilder 객체를 만들어라 // reverse로 뒤집고 // 다시
		 * String화 시켜야지 다시 String 객체로 들어감 String tmp = new
		 * StringBuilder(x).reverse().toString(); answer.add(tmp); } String이라는 객체가 있음에도
		 * StringBuilder를 지원하는 이유 // String 은 String 끼리 더하거나 수정하면 새로운 객체가 생성됨, 객체가 자꾸
		 * 만들어짐 // StringBuilder은 처음 만든 객체 하나만으로 사용, 객체를 새로 생성하지 않음
		 */
		return answer;

	}

	public static void main(String[] args) {

		단어_뒤집기 T = new 단어_뒤집기();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] str = new String[n]; // 입력받은 n만큼의 길이를 가진 문자열 배열 생성
		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
		}

		for (String x : T.solution(n, str)) {
			System.out.println(x);
		}

	}
}
