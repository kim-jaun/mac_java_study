package ch19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParelEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("하니", "로제", "길동", "람다", "누구");
		Stream<String> st1 = list.stream();
		st1.forEach(ParelEx1::print);
		System.out.println("===========");
//		병열처리
		Stream<String> st2 = list.parallelStream();
		
		st2.forEach(ParelEx1::print);
	}
	public static void print(String str) {
		System.out.println(str);
	}
}
