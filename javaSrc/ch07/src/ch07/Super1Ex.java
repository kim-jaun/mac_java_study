package ch07;

class E1 {
	int k1 = 5; int k2 = 7;
	void m1() {
		System.out.println("대박kk");
	}
	void m2() {
		System.out.println("대박" + k1);
	}
}

class E2 extends E1 {
	int k1 = 27;
	void m1() {
		System.out.println("자식 사건 k = " + k1);
		System.out.println("부모 사건 k = " + super.k1);
	}
	void i1() {
		m1();
		super.m1();
		System.out.println("i1 메서드 실행");
	}
}

public class Super1Ex {
	public static void main(String[] args) {
		E2 e2 = new E2();
		e2.m1(); e2.m2();
		e2.i1();
	}
}
