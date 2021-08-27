package ch07;

class B1 {
	int age = 20;
	void m1() {
		System.out.println("대박");
	}
}
class B2 extends B1 {
	String hobby = "울기";
	void m2() {
		System.out.println("사건.");
	}
}
class B3 extends B2 {
	String part = "청소";
	void m3() {
		System.out.println("왜불러.");
	}
}

public class Inger2 {
	public static void main(String[] args) {
		B3 b3 = new B3();
		b3.m1(); b3.m2(); b3.m3();
		System.out.println("age : " + b3.age);
		System.out.println("hobby : " + b3.hobby);
		System.out.println("part : " + b3.part);
	}
}
