package ch19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Sort1 {
	public static void main(String[] args) {
		IntStream intSt = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		intSt.sorted().forEach(n->System.out.print(n+", "));
		List<Student2> list = Arrays.asList(
				new Student2("로제", 88), new Student2("제", 84),
				new Student2("ㄸ", 89), new Student2("d", 82));
		list.stream().sorted().forEach(s->System.out.print(s.getName() + ":" + s.getScore()));
		System.out.print("\n===============\n");
		list.stream().sorted().forEach(s->System.out.print(s.getName() + ":" + s.getScore()));
	}
}
