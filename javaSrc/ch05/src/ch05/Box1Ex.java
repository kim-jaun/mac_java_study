package ch05;

public class Box1Ex {
	public static void main(String[] args) {
		Box1 b1 = new Box1();
		Box1 b2 = new Box1();
		b1.width = 10; b1.height = 20; b1.depth = 30;
		b1.calVolume();
		
		b2.width = 12; b2.height = 15; b2.depth = 20;
		b2.calVolume();
	}
}
