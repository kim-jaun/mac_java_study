package ch19;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sort1 {
	public static void main(String[] args) {
		IntStream intSt = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		intSt.sorted().forEach(n->System.out.print(n+", "));
	}
}
