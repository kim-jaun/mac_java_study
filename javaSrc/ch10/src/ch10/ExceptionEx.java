package ch10;

class A1 extends Exception {
	A1(String msg){
		super(msg);
	}
}

public class ExceptionEx {
	public static void main(String[] args) {
		try {
			throw new A1("error");
		} catch (A1 a) {
			System.out.println(a.getMessage());
		}
	}
}
