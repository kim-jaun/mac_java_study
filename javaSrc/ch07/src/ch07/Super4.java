package ch07;

class H1 {
	int k1 = 7;
	void m1() {
		System.out.println("부모");
	}
}
class H2 extends H1 {
	int k1 = 77;
	void m1() {
		System.out.println("자식");
	}
	void m2() {
		System.out.println("k1 = " + super.k1);
		System.out.println("k1 = " + k1);
	}
	void m3() {
		super.m1();
		m1();
	}
}


public class Super4 {
	public static void main(String[] args) {
		H2 h2 = new H2();
		h2.m1(); h2.m2(); h2.m3();
	}
}
