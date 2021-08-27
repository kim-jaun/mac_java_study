package ch06;

public class Card {
	int num;
	boolean kwang;
	public Card(int num, boolean kwang) {
		this.num = num; this.kwang = kwang;
	}
	public String toString() {
		return num + (kwang?"광":"");
	}
	public static void main(String[] args) {
		Card[] card = new Card[20];
		for(int i = 0; i < card.length; i++) {
			int num = i % 10 + 1;
			boolean kwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			card[i] = new Card(num, kwang);
		}
		for(int i = 0; i < card.length; i++) {
			System.out.println(card[i]);
		}
	}
}
