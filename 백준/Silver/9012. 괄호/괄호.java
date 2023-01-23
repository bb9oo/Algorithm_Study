import java.util.Scanner;
import java.util.Stack;

public class Main {
	public String solution(int n, String str) {
		
		Stack<Character> stack = new Stack<>();
		
		//str을 기반으로 한 문자 배열에 대한 포이치문
		for(char x: str.toCharArray()) {
			if(x=='(') stack.push(x);
			else {//닫는 괄호라면
				if(stack.isEmpty()) return "NO";//닫는 괄호 짝꿍 여는 괄호가 없다면 
				else {
					stack.pop();//닫는 괄호 짝꿍 여는 괄호가 있다면
				}
			}
		}
		
		//여는 괄호가 많아서 스택이 비어있지 않을 경우 확인
		if(!stack.isEmpty()) return "NO";
		else return "YES";

	}

	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			
			System.out.println(T.solution(n, sc.next()));
			
		}
	}
}