package ch19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToList1 {
	public static void main(String[] args) {
		List<Student3> list = Arrays.asList(
				new Student3("로제", 66, Student3.Gender.FEMALE, Student3.City.PUSAN),
				new Student3("원빈", 76, Student3.Gender.MALE, Student3.City.SEOUL),
				new Student3("제시", 86, Student3.Gender.FEMALE, Student3.City.SEOUL),
				new Student3("다니엘", 96, Student3.Gender.MALE, Student3.City.SEOUL)
				);
		List<Student3> maleList = list.stream()
				.filter(s->s.getGender()==Student3.Gender.MALE)
				.collect(Collectors.toList());
		maleList.stream().forEach(s->System.out.println(s.getName()));
		List<Student3> femaleList = list.stream()
				.filter(s->s.getGender()==Student3.Gender.FEMALE)
				.collect(Collectors.toList());
		femaleList.stream().forEach(s->System.out.println(s.getName()));
	}
}
