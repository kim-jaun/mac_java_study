package helloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= num - i; k++) {
				sb.append(" ");
			}
			for (int j = 1; j <= i; j++) {
				sb.append("*");
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
