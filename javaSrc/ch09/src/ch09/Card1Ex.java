package ch09;

class Card1 {
	String kind;
	int num;
	public Card1(String kind, int num) {
		this.kind = kind; this.num = num;
	}
	public String toString() {
		return "[" + kind + " " + num + "]";
	}
}
public class Card1Ex {
	public static void main(String[] args) {
		Card1 c1 = new Card1("스페이드", 10);
		Card1 c2 = new Card1("다이아몬드", 7);
		System.out.println(c1);
		System.out.println(c2);
	}
}
