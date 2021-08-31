package ch08;

class A1 {
	void m1() {
		System.out.println("난 부모 메서드");
	}
}

class A2 extends A1 {
	@Override //어노 테이션
	void m1() {
		System.out.println("난 자식 메서드");
	}
}

public class Over1Ex {
	public static void main(String[] args) {
		A1 a1 = new A1(); A1 a2 = new A2();
		a1.m1(); a2.m1();
	}
}

