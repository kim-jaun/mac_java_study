package helloWorld;

import java.util.Scanner;

public class test {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int temp;
		
		String text = Integer.toString(num2);
		
		for (int i=text.length(); i > 0; i--) {
			temp = Integer.parseInt(text.substring(i-1, i));
			System.out.println(num1 * temp);
		}
		
        System.out.println(num1 * num2);
    }
}


