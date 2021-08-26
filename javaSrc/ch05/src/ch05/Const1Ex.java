package ch05;

class C1 {
	C1() {
		System.out.println("매개변수가 없습니다.");
	}
	C1(int x, int y) {
		System.out.println("매개변수 두개 x = " + x + ", y = " + y);
	}
	C1(int x) {
		System.out.println("매개변수 한개 x = " + x);
	}
	void prn() {
		System.out.println("다양한 생성자 사용");
	}
}

public class Const1Ex {
	public static void main(String[] args) {
		C1 c1 = new C1(); C1 c2 = new C1(7); C1 c3 = new C1(6, 7);
		c1.prn(); c2.prn(); c3.prn();
	}
}
