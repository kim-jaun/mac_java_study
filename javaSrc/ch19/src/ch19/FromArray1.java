package ch19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArray1 {
	public static void main(String[] args) {
		String[] arr = {"로제", "길동", "제니", "하니"};
		Stream<String> st = Arrays.stream(arr);
		st.forEach(a -> System.out.print(a + ", "));
		System.out.print("\n==================\n");
		int[] arr2 = {77, 88, 99, 77};
		IntStream st2 = Arrays.stream(arr2);
		st2.forEach(j -> System.out.print(j + ", "));
		List<Student1> list = Arrays.asList(
				new Student1("로제", 88), new Student1("제니", 77), 
				new Student1("하니", 99), new Student1("길동", 66));
		Stream<Student1> st3 = list.stream();
		System.out.println("\n==================\n");
		st3.forEach(s -> System.out.println(s.getName()));
	}
}
