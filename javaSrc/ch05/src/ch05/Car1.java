package ch05;

public class Car1 {
//	설계 속성 (데이터) => 구현 멤버변수, 필드
	String color;
	String engine;
	int displacement;
//	설계 기능 => 구현 메서드
	void speedUp() {
		System.out.println("속도를 높힌다.");
	}
	void changeColor() {
		System.out.println("색깔을 바꾼다.");
	}
	void stop() {
		System.out.println("차를 멈춘다.");
	}
}
