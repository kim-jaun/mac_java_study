package ch12;

interface Car {
	void drive();
	void inwon();
}

class Bus implements Car {
	public void drive() {
		System.out.println("40명을 싣고 달린다.");
	}
	public void inwon() {}
}

class Taxi implements Car {
	public void drive() {
		System.out.println("총알처럼 달린다.");
	}
	public void inwon() {
		System.out.println("정원이 5명이다.");
	}
}

class Ambulance implements Car {
	public void drive() {
		System.out.println("싸이렌을 울리며 달린다.");
	}
	public void inwon() {}
}

public class CarEx {
	public static void main(String[] args) {
		Car[] car = new Car[3];
		car[0] = new Bus();
		car[1] = new Taxi();
		car[2] = new Ambulance();
		
		for (int i = 0; i < car.length; i++) {
			car[i].drive();
			car[i].inwon();
		}
	}
}
