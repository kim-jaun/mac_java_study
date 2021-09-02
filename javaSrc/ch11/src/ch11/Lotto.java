package ch11;

import java.util.Set;
import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
//		중복방지와 순서
		Set<Integer> lotto = new TreeSet<>();
		while (lotto.size() < 6) {
			int num = (int)(Math.random()*45) + 1;
			lotto.add(num);
		}
		System.out.println(lotto);
	}
}
