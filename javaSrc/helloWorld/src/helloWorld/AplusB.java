package helloWorld;

import java.util.Scanner;

public class AplusB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int arr[] = new int[count];
		
		for (int i = 0; i < count; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			arr[i] = num1 + num2;
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
		sc.close();
	}
}
