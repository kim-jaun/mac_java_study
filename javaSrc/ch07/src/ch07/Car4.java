package ch07;

public class Car4 {
	void drive() {
		System.out.println("driving");
	}
}
class Bus extends Car4 {
	void drive() {
		System.out.println("승객 40명을 싣고 운전한다.");
	}
}

class Taxi extends Car4 {
	void drive() {
		System.out.println("총알처럼 운전한다");
	}
}

class Ambulance4 extends Car4 {
	void drive() {
		System.out.println("환자를 싣고 달린다");
	}
	void siren() {
		System.out.println("싸이랜을 울린다");
	}
}

