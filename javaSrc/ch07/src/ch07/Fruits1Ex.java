package ch07;

public class Fruits1Ex {
	public static void main(String[] args) {
		FruitSeller1 fs1 = new FruitSeller1();
		FruitByer1 fb1 = new FruitByer1();
		FruitSeller1 fs2 = new FruitSeller1();
		FruitByer1 fb2 = new FruitByer1();
		fb1.buyFruit(fs1, 3000);
		fb1.buyFruit(fs2, 2000);
		fb2.buyFruit(fs1, 2000);
		fb2.buyFruit(fs2, 5000);
		fs1.print();
		fb1.print();
		fs2.print();
		fb2.print();
	}
}
