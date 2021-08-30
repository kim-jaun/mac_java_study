package ch07;

class Parent {
	int x = 100;
	void m1() {
		System.out.println("부모 메서드");
	}
}

class Child extends Parent {
	int x = 200;
	void m1() {
		System.out.println("자식 메서드");
	}
}

public class ParentEx {
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.m1(); // 자식 메서드 : 부모와 메서드명이 일치.
//		멤버변수는 이름은 같지만 부모변수와 자식 변수는 서로 다른 변수로 인식해서 부모 멤버변수만 출력.
		System.out.println("x = " + p1.x);
	}
}