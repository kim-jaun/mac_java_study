package ch11;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lotto2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> lotto = new TreeSet<>();
		System.out.println("몇개의 번호를 고정하려고 하나요?");
		int number = sc.nextInt();
		while (lotto.size() < number) {
			System.out.println("번호를 입력하세요.");
			int num = sc.nextInt();
			if(num <= 45) lotto.add(num);
		}
		
		while (lotto.size() < 6) {
			int num = (int)(Math.random()*45) + 1;
			lotto.add(num);
		}
		System.out.println(lotto);
		sc.close();
	}
}
