package ch19;

import java.util.Arrays;
import java.util.List;

public class StreamFile1 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("구렁이", "구렁일", "구렁사", "팔렁이");
		names.stream().distinct().forEach(n->System.out.println(n));
		System.out.println("===========");
		names.stream().filter(n->n.startsWith("구")).forEach(n->System.out.println(n));
		System.out.println("===========");
		names.stream().distinct().filter(n->n.startsWith("구")).forEach(n->System.out.println(n));
		System.out.println("===========");
	}
}
