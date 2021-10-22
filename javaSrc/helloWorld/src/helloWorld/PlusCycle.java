package helloWorld;

import java.util.Scanner;

public class PlusCycle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();
		int num2 = 0;
		int sum = 0;
		int count = 0;
		while(sum != num) {
			if(num < 0) {
				num2 = num%10;
			} else {
				num2 = (num/10) + (num%10);
			}
			sum = (num2/10) + (num2%10);
			count++;
			if(sum == num) break;
		}
		System.out.println(count);
		sc.close();
	}
}
