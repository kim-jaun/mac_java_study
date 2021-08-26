package ch05;
class Person1 {
	String name; int age; String hobby;
	public Person1 (String n, int a, String h) {
		name = n; age = a; hobby = h;
	}
//	prn() 메서드 이름, 나이,취미를 출력.
	void prn() {
		System.out.println("===================");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("취미 : " + hobby);
	}
}
public class Person1Ex {
	public static void main(String[] args) {
//		p1 제니, 23, 침뱉기  p2 아이유 32 울기, p3 로시 27 놀기 생성 출력.
		Person1 p1 = new Person1("제니", 23, "침뱉기");
		Person1 p2 = new Person1("아이유", 32, "울기");
		Person1 p3 = new Person1("로시", 27, "놀기");
		p1.prn(); p2.prn(); p3.prn();
	}
}
