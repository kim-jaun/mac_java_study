package ch12;

class Person {
	int no;
	String name;
	public Person(int no, String name) {
		this.no = no; this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		Person person = (Person)obj;
		return no == person.no;
	}
	
}

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person(111, "홍길동");
		Person p2 = new Person(111, "유재석");
		Person p3 = new Person(222, "홍길동");
		if (p1.equals(p2)) System.out.println("p1과 p2는 같다.");
		else System.out.println("p1과 p2는 다르다.");
		if (p1.equals(p3)) System.out.println("p1과 p3는 같다.");
		else System.out.println("p1과 p3는 다르다.");
		if (p2.equals(p3)) System.out.println("p2와 p3는 같다.");
		else System.out.println("p2와 p3는 다르다.");
	}
}
