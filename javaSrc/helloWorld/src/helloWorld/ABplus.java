package helloWorld;

import java.util.Scanner;

public class ABplus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
		}
		
		sc.close();
	}
}
