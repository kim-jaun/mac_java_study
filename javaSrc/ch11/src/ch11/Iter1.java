package ch11;

import java.util.Iterator;
import java.util.LinkedList;

public class Iter1 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("복숭아"); list.add("딸기"); list.add("수박");
		list.add("바나나"); list.add("대추");
		list.add(2, "키위"); list.remove(1);
		list.set(4, "오렌지");
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("=========");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(list);
	}
}
