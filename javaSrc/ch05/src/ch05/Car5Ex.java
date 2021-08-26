package ch05;
class Car5 {
	String no; int inTime, outTime, fee;
	public Car5(String n, int i, int o) {
		no = n; inTime = i; outTime = o;
	}
	void calFee() {
		fee = (outTime - inTime) * 1000;
	}
	void disp() {
		System.out.println("============");
		System.out.println("차량번호 : " + no);
		System.out.println("입고시간 : " + inTime);
		System.out.println("출고시간 : " + outTime);
		System.out.println("주차요금 : " + fee);
	}
}
public class Car5Ex {
	public static void main(String[] args) {
		Car5 c1 = new Car5("가 1234", 10, 15);
		Car5 c2 = new Car5("바 5678", 9, 18);
		Car5 c3 = new Car5("라 2222", 12, 17);
		c1.calFee(); c2.calFee(); c3.calFee();
		c1.disp(); c2.disp(); c3.disp();
	}
}
