package ch19;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IterVsStream1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("wow", "winner", "loser", "lol");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=================");
//		list의 데이터를 stream형식으로 변경하여 저장
		Stream<String> st = list.stream();
		st.forEach(name->System.out.println(name));
	}
}
