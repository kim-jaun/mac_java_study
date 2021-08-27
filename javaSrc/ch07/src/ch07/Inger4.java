package ch07;

class D1 {
	void m1() {
		System.out.println("할아버지");
	}
}
class D2 extends D1 {
	void m2() {
		System.out.println("아버지");
	}
}
class D3 extends D2 {
	void m3() {
		System.out.println("자식");
	}
}
class D4 extends D3 {
	void m4() {
		System.out.println("손자");
	}
}

public class Inger4 {
	public static void main(String[] args) {
		D4 d4 = new D4();
		d4.m1(); d4.m2(); d4.m3(); d4.m4();
	}
}
