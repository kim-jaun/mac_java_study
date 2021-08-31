package ch08;

abstract class B1 { 	// 메서드 중에 추상 메서드가 하나라도 있으면 추상 클래스
	abstract void m1();	// 추상 메서드는 선언부는 있지만 구현부가 없음
	void m2() {
		System.out.println("대박");
	}
}

class B2 extends B1 {
	void m1() {
		System.out.println("왜불러");
	}
	
}

public class Abs1Ex {
	public static void main(String[] args) {
//		A1 a1 = new A1(); // 추상클래스는 객체를 생성할 수 없음.
//		추상클래스는 자식을 통하여 재정의 한 후에 생성해서 사용해야 한다.
		B2 a2 = new B2(); a2.m1();
		B1 a1 = new B2(); a1.m2();
	}
}

