package ch07;

public class Fruits3Ex {
	public static void main(String[] args) {
		FruitSeller3 fs1 = new FruitSeller3(25, 10000, "전지현");
		FruitSeller3 fs2 = new FruitSeller3(20, 6000, "전");
		FruitByer3 fb1 = new FruitByer3(0, 20000, "비");
		FruitByer3 fb2 = new FruitByer3(5, 10000, "by");
		fb1.buyFruit(fs1, 20000);
		fb1.buyFruit(fs2, 20000);
		fb2.buyFruit(fs1, 15000);
		fs1.print(); fs2.print();
		fb1.print(); fb2.print();
		
	}
}
