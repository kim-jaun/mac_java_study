package ch07;

public class Car3 {
	void drive() {
		System.out.println("driving");
	}
}
class FireEngine3 extends Car3 {
	void drive() {
		System.out.println("water in Car");
	}
	void job() {
		System.out.println("Fire end");
	}
}

class Ambulance3 extends Car3 {
	void drive() {
		System.out.println("for driving");
	}
}