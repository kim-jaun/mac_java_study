package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Arr2 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
//		a1.add("사과"); a1.add("수박"); a1.add("바나나");
//		a1.add("딸기"); a1.add("참외");
		String[] fruits = {"사과", "수박", "바나나", "수박", "딸기", "참외"};
		for(String fruit : fruits) {
			a1.add(fruit);
		}
		for(int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("=========");
		Iterator<String> it = a1.iterator();
		while(it.hasNext()) System.out.println(it.next());
	}
}
