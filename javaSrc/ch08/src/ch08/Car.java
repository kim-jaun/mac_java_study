package ch08;

public abstract class Car {
	void disp() {
		System.out.println("I'm a Car");
	}
	abstract void drive();
	abstract void job();
}

class Bus extends Car {
	void drive() {
		System.out.println(" 손님 40명 태워서 운전해.");
	}
}

class Taxi extends Car {
	void drive() {
		System.out.println("난 총알처럼 달린다.");
	}
}

class FireEngine extends Car {
	void drive() {
		System.out.println("난 물을 싣고 운전해.");
	}
	void job() {
		System.out.println("난 불 끄는게 일이야.");
	}
}