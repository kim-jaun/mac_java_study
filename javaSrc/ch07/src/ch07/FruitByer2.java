package ch07;

public class FruitByer2 {
	int numOfApple; int money; String name;
	public FruitByer2(int numOfApple, int money, String name) {
		this.numOfApple = numOfApple; this.money = money; this.name = name;
	}
	void buyFruit(FruitSeller2 fs, int amt) {
		int num = fs.saleApple(amt); //판매자의 판매method를 통하여 구매.
		money -= amt;
		numOfApple += num;
	}
	void print() {
		System.out.println(name + " 구매자 사과 갯수 : " + numOfApple);
		System.out.println(name + " 구매자 현금잔액 : " + money);
	}
}
