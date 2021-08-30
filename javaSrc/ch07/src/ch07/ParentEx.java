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
		
	}
}