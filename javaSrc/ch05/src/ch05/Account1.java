package ch05;

public class Account1 {
	String accountNo, name; int balance;
	Account1(String a, String n, int b){
		accountNo = a; name = n; balance = b;
	}
	void deposit(int money) {
		balance += money;
		System.out.println(name + "님 입금액 : " + money);
	}
	void withdraw(int money) {
		if (balance >= money) {
			balance -= money;
			System.out.println(name + "님 출금액 : " + money);
		} else System.out.println("잔액이 부족합니다.");
	}
	void prn() {
		System.out.println("예금주 : " + name);
		System.out.println("현재 잔액 : " + balance);
	}
}
