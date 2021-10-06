package helloWorld;

import java.util.Scanner;

public class Star2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
