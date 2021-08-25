package ch05;

public class Car4 {
	String kind;
	int displacement;
	public Car4() {}
	public Car4(String k, int d) {
		kind = k; displacement = d;
	}
	void disp() {
		System.out.println("=============");
		System.out.println("kind : " + kind);
		System.out.println("Displacement : " + displacement);
	}
}
