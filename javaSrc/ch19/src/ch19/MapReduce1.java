package ch19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapReduce1 {
	public static void main(String[] args) {
		List<Student1> list = Arrays.asList(
				new Student1("로제", 88), new Student1("제니", 77), 
				new Student1("하니", 99), new Student1("길동", 66));
		Stream<Student1> st = list.stream();
		double avg = st.mapToInt(Student1::getScore).average().getAsDouble();
		System.out.println("평균 : " + avg);
	}
}
