package helloWorld;

import java.util.Scanner;

public class PlusCycle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();
		while(true) {
			num=(num%10)*10+(num/10+num%10)%10;
			count += 1;
			if(lastn == num) {
				break;
			}
		}
		System.out.println("26�� ����Ŭ�� "+count);
	}
}
