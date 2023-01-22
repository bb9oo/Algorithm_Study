
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));// reader선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// writer선언
		StringTokenizer st;// tokenizer 선언
		int n = Integer.parseInt(bf.readLine()); // 반복횟수

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int sum = a + b;

			bw.write(sum + "\n");
		}
		bw.flush(); 
		bw.close();
	}
}