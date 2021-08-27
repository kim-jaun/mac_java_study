package ch07;

class C1 {
	C1() {
		System.out.println("난 부모 생성");
	}
	void m1() {
		System.out.println("난 부모 메서드");
	}
}
class C2 extends C1 {
	C2() {
		System.out.println("난 자식 ");
	}
	void m2 () {
		System.out.println("난 자식 ");
	}
}

public class Inger3 {
	public static void main(String[] args) {
		C2 c2 = new C2();
		c2.m1(); c2.m2();
	}
}
