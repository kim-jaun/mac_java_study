package ch07;

public class Person2Ex {
	public static void main(String[] arg) {
		Person2[] p = new Person2[6];
		p[0] = new Student2("로제", 25, "블랙");
		p[1] = new Student2("제니", 27, "핑크");
		p[2] = new Teacher2("호동", 51, "자바");
		p[3] = new Teacher2("강다니엘", 29, "스프링");
		p[4] = new Manager2("수근", 48, "운전");
		p[5] = new Manager2("효리", 48, "청소");
		
		for(Person2 person : p) {
			person.print();  // 자식메서드	
		}
	}
}
