package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Set2 {
	public static void main(String[] args) {
		String[] snakes = {"구렁이", "팔렁이", "칠렁이", "구렁이"};
		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();
		for(String snake : snakes) {
			if (!hs1.add(snake)) { //저장에 실패하면
				hs2.add(snake);
			}
		}
		System.out.println(hs1);
		System.out.println(hs2);
		hs1.removeAll(hs2);
		System.out.println(hs1);
		System.out.println(hs2);
		for(String str : hs1) {
			System.out.print(str + "\t");
		}
		System.out.print("\n=============");
		Iterator<String> it = hs1.iterator();
		while(it.hasNext() ) {
			System.out.print(it.next() + "\t");
		}
	}
}
