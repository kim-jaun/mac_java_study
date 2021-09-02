package ch10;

class Car1 {
	String no; int inTime, outTime, fee;
	public Car1(String no, int inTime, int outTime) {
		this.no = no; this.inTime = inTime; this.outTime = outTime;
	}
	void calFee() {
		fee = (outTime - inTime) * 2000;
	}
	void prn() {
		System.out.println("=========================");
		System.out.println("Car Number : " + no);
		System.out.println("In Time : " + inTime);
		System.out.println("Out Time : " + outTime);
		System.out.println("Parking Fee : " + fee + " won");
	}
}

public class Car1Ex {
	public static void main(String[] args) {
		Car1 c1 = new Car1("36바1234", 10, 15);
		Car1 c2 = new Car1("22가4321", 5, 21);
		Car1 c3 = new Car1("66사3498", 12, 23);
		c1.calFee(); c2.calFee(); c3.calFee();
		c1.prn(); c2.prn(); c3.prn();
		
	}
}
