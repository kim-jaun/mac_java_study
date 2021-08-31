package ch08;

interface C1 {
	int K = 7;	// 인터페이스에 있는 모든 멤버변수 public static final 생략되어있다.
	void m1();	// 인터페이스에 있는 모든 메서드는 public abstract가 생략되어있다.
	void m2();
}

class C2 implements C1 { // 인터페이스는 상속이 아니라 구현(implements)
	public void m1() {
		System.out.println("인터페이스 재정의");
	}
	public void m2() {
		System.out.println("oooooooh");
	}
	public void m4() {
		System.out.println("dddddddd");
	}
}

public class Inter1Ex {
	public static void main(String[] args) {
		C1 c1 = new C2();	// 인터페이스는 생성은 안되지만 선언은 가능
		C2 c2 = new C2();
		c1.m1(); c1.m2(); c2.m1(); c2.m2();
		System.out.println(C1.K);
	}
}
