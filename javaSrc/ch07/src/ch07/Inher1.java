package ch07;

class A1 {
	int k1 = 1;
	void k1() {
		System.out.println("난 A1 클래스");
	}
}

class A2 extends A1 {
	int k2 = 2;
	void k2() {
		System.out.println("난 자식 클래스의 메서드");
	}
}

public class Inher1 {
	public static void main(String[] args) {
		A2 a2 = new A2();
		a2.k2(); a2.k1();
		System.out.println("k1 = " + a2.k1);
		System.out.println("k2 = " + a2.k2);
	}
}
