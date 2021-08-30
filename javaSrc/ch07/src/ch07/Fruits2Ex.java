package ch07;

public class Fruits2Ex {
	public static void main(String[] args) {
		FruitSeller2 fs1 = new FruitSeller2(30, 10000, "전지현");
		FruitSeller2 fs2 = new FruitSeller2(10, 6000, "전");
		FruitByer2 fb1 = new FruitByer2(0, 20000, "비");
		FruitByer2 fb2 = new FruitByer2(5, 10000, "by");
		fb1.buyFruit(fs1, 3000);
		fb1.buyFruit(fs2, 2000);
		fb2.buyFruit(fs1, 2000);
		fs1.print(); fs2.print();
		fb1.print(); fb2.print();
		
	}
}
