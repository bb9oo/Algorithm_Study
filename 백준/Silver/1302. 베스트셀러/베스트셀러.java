import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public String solution(int n, String[] str) {

		String answer = "";

		// 해쉬맵선언
		// <,>안에는 <키 값의 데이터형, 밸류 값의 데이터형>을을 넣음
		HashMap<String, Integer> map = new HashMap<>();
		for (String x : str) {
			map.put(x, map.getOrDefault(x, 0) + 1);
			// map.getOrDefault -> 카운팅할 때 중요, 잘 알아두기
			// 키의 밸류값을 가져오되, (처음이라) 값이 없다면 0을 리턴
		}

		int max = Integer.MIN_VALUE;
		// 만든거 출력하기
		// map.keySet() -> 존재하는 키를 모두 탐색
		for (String key : map.keySet()) {
			// System.out.println(x+" "+map.get(key)); //키의 값을 가져오라가 map.get(key)

			if (map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}

			else if (map.get(key) == max) {
				if (answer.compareTo(key) > 0) { 
					answer = key;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
		}

		System.out.println(T.solution(n, str));

	}
}