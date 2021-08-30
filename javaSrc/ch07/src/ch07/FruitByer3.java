package ch07;

public class FruitByer3 {
	int numOfApple; int money; String name;
	public FruitByer3(int numOfApple, int money, String name) {
		this.numOfApple = numOfApple; this.money = money; this.name = name;
	}
	void buyFruit(FruitSeller3 fs, int amt) {
		if (money < amt) {System.out.println("no money");} 
		else {
			int num = fs.saleApple(amt); //판매자의 판매method를 통하여 구매.
			if (num != 0) {
				money -= amt;
				numOfApple += num;
				System.out.printf("사과 %d개 구매, 지출 %d원\n",num, amt);
			}
		}
	}
	void print() {
		System.out.println(name + " 구매자 사과 갯수 : " + numOfApple);
		System.out.println(name + " 구매자 현금잔액 : " + money);
	}
}
