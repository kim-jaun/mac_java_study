package ch19;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToList2 {
	public static void main(String[] args) {
		List<Student3> list = Arrays.asList(
				new Student3("로제", 66, Student3.Gender.FEMALE, Student3.City.PUSAN),
				new Student3("원빈", 76, Student3.Gender.MALE, Student3.City.SEOUL),
				new Student3("제시", 86, Student3.Gender.FEMALE, Student3.City.SEOUL),
				new Student3("다니엘", 96, Student3.Gender.MALE, Student3.City.SEOUL)
				);
		Map<Student3.Gender, List<Student3>> map =
				list.stream().collect(Collectors.groupingBy(Student3::getGender));
		System.out.println("남자");
		map.get(Student3.Gender.MALE).stream().forEach(s->System.out.print(s.getName()+" "));
		System.out.println();
		System.out.println("여자");
		map.get(Student3.Gender.FEMALE).stream().forEach(s->System.out.print(s.getName()+" "));
	}
}
