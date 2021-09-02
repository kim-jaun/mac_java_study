package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Arr3 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
//		사과 수박 바나나 수박 딸기
		a1.add("사과"); a1.add("수박"); a1.add("바나나");
		a1.add("딸기"); a1.add("참외");
		prn(a1);
//		사과 수박 키위 바나나 딸기 참외
		a1.add(2,"키위"); prn(a1);
		a1.add(4,"포도"); prn(a1);
		a1.remove(1); prn(a1);
		a1.remove("사과"); prn(a1);
	}

	private static void prn(ArrayList<String> a1) {
		for(int i = 0; i < a1.size(); i++) {
			System.out.print(a1.get(i) + "\t");
		}
		System.out.println();
	}
}
