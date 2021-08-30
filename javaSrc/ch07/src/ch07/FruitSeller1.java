package ch07;

public class FruitSeller1 {
	int numOfApple = 20;
	int money = 0;
	final int PRICE_PER_APPLE = 1000;
	
	int saleApple(int amt) { // 사과 판매, amt 판매금액.
		money += amt; // 판매자 수입.
		int num = amt/PRICE_PER_APPLE; // 판매 갯수.
		numOfApple -= num; //판매자 사과갯수
		return num; //구매자에게 줄 사과 갯수
	}
	
	void print() {
		System.out.println("판매자 사과 갯수 : " + numOfApple);
		System.out.println("판매자 현금잔액 : " + money);
	}
}
