package ch12;

class Person {
	int no;
	String name;
	public Person(int no, String name) {
		this.no = no; this.name = name;
	}
}

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person(1111, "홍길동");
		Person p2 = new Person(1111, "유재석");
		Person p3 = new Person(2222, "홍길동");
		int pn1 = p1.no;
		int pn2 = p2.no;
		int pn3 = p3.no;
		if (pn1 == pn2) System.out.println("p1과 p2는 같다.");
		else System.out.println("p1과 p2는 다르다.");
		if (pn1 ==pn3) System.out.println("p1과 p3는 같다.");
		else System.out.println("p1과 p3는 다르다.");
		if (pn2 == pn3) System.out.println("p2와 p3는 같다.");
		else System.out.println("p2와 p3는 다르다.");
	}
}
