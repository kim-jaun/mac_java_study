package ch12;

public class AccountEx {
	public static void main(String[] args) {
		Account act = new Account(10000);
		AccountUser[] au = new AccountUser[5];
		au[0] = new AccountUser(act, "No.1");
		au[1] = new AccountUser(act, "No.2");
		au[2] = new AccountUser(act, "No.3");
		au[3] = new AccountUser(act, "No.4");
		au[4] = new AccountUser(act, "No.5");
		
		for(AccountUser a : au) {
			a.start();
		}
	}
}
