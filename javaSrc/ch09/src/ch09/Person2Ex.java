package ch09;

class Person2 {
	int jumin;
	String name;
	int age;
	public Person2(int jumin, String name, int age) {
		this.jumin = jumin; this.name = name; this.age = age;
	
	}
	
	public String toString() {
		return "[이름 : " + name + ", 주민 : " + jumin + ", 나이 : " + age + "]";
	}
}
//	객체를 출력하면 패키지명.클래스명@해시코드
public class Person2Ex {
	public static void main(String[] args) {
		Person2 p1 = new Person2(1111, "jaun", 45);
		Person2 p2 = new Person2(1111, "gildong", 33);
		Person2 p3 = new Person2(2222, "jaun", 45);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
