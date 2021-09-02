package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Set1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("바나나"); set.add("사과");
		set.add("대추"); set.add("수박");
		set.add("바나나"); set.add("사과");
		System.out.println("갯수 : " + set.size());
//		중복된 데이터는 추가가 안됨.
		for(String str : set) {
			System.out.println(str);
		}
		System.out.println("================");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(set);
	}
}
