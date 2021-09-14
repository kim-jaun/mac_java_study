package ch19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student1 {
	String name;
	int score;
	public Student1(String name, int score) {
		this.name = name; this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}

public class LamdaStr1 {
	public static void main(String[] args) {
		List<Student1> list = Arrays.asList(new Student1("로제", 88), new Student1("제니", 77), 
				new Student1("하니", 99), new Student1("길동", 66));
		Stream<Student1> st = list.stream();
		st.forEach(s -> System.out.println(s.name + "_" + s.score));
	}
}
