package ch07;

public class Car3Ex {
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		FireEngine3 fe = new FireEngine3();
		Ambulance3 am = new Ambulance3();
		Car3[] car = {c1, fe, am};
		for(Car3 c : car) {
			c.drive();
			if (c instanceof FireEngine3) {
				FireEngine3 fe3 = (FireEngine3)c;
				fe3.job();
				((FireEngine3)c).job();
			}
		}
	}
}
