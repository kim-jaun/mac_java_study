package ch07;

public class Car2 {
	String color;
	void drive() {
		System.out.println("Driving");
	}
}
class FireEngine2 extends Car2 {
	void water() {
		System.out.println("water");
	}
}

class Ambulance2 extends Car2 {
	void siren() {
		System.out.println("siren");
	}
}