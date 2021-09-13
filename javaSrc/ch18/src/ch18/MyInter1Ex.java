package ch18;
@FunctionalInterface // 함수적 인터페이스 확인하는 어노테이션
interface MyInter1 { // 함수적 인터페이스 : 메서드가 하나인 인터페이스
	public void m1();
}

class MyInter1_1 implements MyInter1 {
	public void m1() {
		System.out.println("wow");
	}
}

public class MyInter1Ex{
	public static void main(String[] args) {
		MyInter1 mi = new MyInter1_1();
		mi.m1();
		mi = new MyInter1() { // 무명(익명) 클래스
			public void m1() {
				System.out.println("loser");
			}
		};
		mi.m1();
		mi = () -> { // 함수(메서드)가 하나 뿐이므로 그 메서드를 재정의한다고 인식
			System.out.println("winner");
		};
		mi.m1();
	}
}