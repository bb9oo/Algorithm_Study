import java.util.Scanner;

public class Main {
	public int solution(int L, int study) {
	
		int answer = 0;
		answer= L-study;
		
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt(); //방학 총일
		int A = sc.nextInt(); //국어 총 페이지
		int B = sc.nextInt(); //수학 총 페이지
		int C = sc.nextInt(); //하루에 풀 수 있는 국어 페이지 최대
		int D = sc.nextInt(); //하루에 풀 수 있는 수학 페이지 최대
		
		
		// 국어 숙제를 모두 하기 위해 필요한 일자
		int kor = A/C;
		if(A%C!=0) kor++; //나머지가 남으면 일자 +1일
		// 수학 숙제를 모두 하기 위해 필요한 일자
		int math = B/D;
		if(B%D!=0) math++; //나머지가 남으면 일자 +1일
		// 숙제를 하기 위한 값이 더 큰 값 구하기 
		int study =Math.max(kor, math);
		
		System.out.println(T.solution(L,study));

	}
}