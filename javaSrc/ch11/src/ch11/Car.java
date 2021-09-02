package ch11;

public abstract class Car {
	abstract void print();
}

class Bus extends Car{
	void print() {
		System.out.println("Bus");
	}
}

class Texi extends Car{
	void print() {
		System.out.println("Texi");
	}
}

class FireEngine {
	void print() {
		System.out.println("FireEngine");
	}
}