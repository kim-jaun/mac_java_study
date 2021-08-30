package ch07;

public class FruitByer1 {
	int numOfApple = 0;
	int money = 5000;
	void buyFruit(FruitSeller1 fs, int amt) {
		int num = fs.saleApple(amt); //판매자의 판매method를 통하여 구매.
		money -= amt;
		numOfApple += num;
	}
	void print() {
		System.out.println("구매자 사과 갯수 : " + numOfApple);
		System.out.println("구매자 현금잔액 : " + money);
	}
}
