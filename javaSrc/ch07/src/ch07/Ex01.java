package ch07;

class Product {
	int price;
	int bonusPoint;
	Product(int price){
		this.price = price;;
		bonusPoint = (int)(price / 10.0);
	}
}

class Tv extends Product {
	Tv() { // 1. Product의 생성자를 없애서 default생성자를 이용.
		super(2000); // 2. super() 생성자를 이용하여 매개변수 하나인 생성자 이용.
	}
	public String toString() {
		return "Tv";
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Tv t = new Tv();
		System.out.println(t.toString());
	}
}
