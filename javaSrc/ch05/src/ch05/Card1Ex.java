package ch05;

class Card1 {
	static int width = 100;
	int height = 200;
	String kind;
	int number;
	
	void disp() {
		System.out.println("card kind : " + kind + "\tcard number : " + number + "\twidth : " + width + "\theight : " + height);
	}
}

public class Card1Ex {
	public static void main(String[] args) {
		Card1 c1 = new Card1(); Card1 c2 = new Card1();
		c1.kind = "다이아몬드"; c2.kind = "스페이드";
		c1.number = 7; c2.number = 1;
		c1.disp(); c2.disp();
	}
}
