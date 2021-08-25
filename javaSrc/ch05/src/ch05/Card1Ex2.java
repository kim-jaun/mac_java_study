package ch05;

class Card2 {
	static int width = 100, height = 200;
	String kind;
	int number;
	Card2(String k, int n) {
		kind = k; number = n;
	}
	void disp() {
		System.out.println("---------- Card ----------");
		System.out.println("kind : " + kind);
		System.out.println("number : " + number);
		System.out.println("width : " + width);
		System.out.println("height : " + height);
		System.out.println("==========================");
	}
}

public class Card1Ex2 {
	public static void main(String[] args) {
		Card2 c1 = new Card2("다이아몬드", 7); 
		Card2 c2 = new Card2("스페이드", 1);
		c1.disp(); 
		c2.disp();
	}
}
