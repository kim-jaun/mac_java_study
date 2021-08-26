package ch05;

public class Account1Ex {
	public static void main(String[] args) {
		int money = 0;
		Account1 ac1 = new Account1("sinhan 1215", "kimjaun", 10000);
		Account1 ac2 = new Account1("sinhan 55515", "jaun", 10000);
		for(int i = 0; i < 5; i++) {
			money = (int)(Math.random()*2000)+100;
			ac1.deposit(money);
			money = (int)(Math.random()*2000)+100;
			ac1.withdraw(money);
			ac1.prn();
		}
		for(int i = 0; i < 5; i++) {
			money = (int)(Math.random()*2000)+100;
			ac2.deposit(money);
			money = (int)(Math.random()*2000)+100;
			ac2.withdraw(money);
			ac2.prn();
		}
	}
}
