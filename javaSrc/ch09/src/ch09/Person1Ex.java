package ch09;

class Person1 {
	int jumin;
	String name;
	int age;
	public Person1(int jumin, String name, int age) {
		this.jumin = jumin; this.name = name; this.age = age;
	}
	public boolean equals(Object obj) {
		Person1 person = (Person1)obj;
		return name.equals(person.name);
//		return jumin == person.jumin;
	}
}

public class Person1Ex {
	public static void main(String[] args) {
		Person1 p1 = new Person1(1111, "jaun", 45);
		Person1 p2 = new Person1(1111, "gildong", 33);
		Person1 p3 = new Person1(2222, "jaun", 45);
		if (p1.equals(p2)) System.out.println("p1 == p2");
		else System.out.println("p1 != p2");
		
		if (p1.equals(p3)) System.out.println("p1 == p3");
		else System.out.println("p1 != p3");
	}
}
