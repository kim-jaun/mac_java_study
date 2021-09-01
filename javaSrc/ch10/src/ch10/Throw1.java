package ch10;

public class Throw1 {
	public static void main(String[] args) {
//		throw는 자신이 에러를 발생시켜서 던지다
		m1();
	}

	private static void m1() {
		try {
			m2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void m2() throws Exception {
//		throw 예외를 발생시켜서 던지다
//		throws 예외를 발생하면 메서드를 호출한 곳으로 처리를 넘긴다
//		try catch 예외가 발생하면 내가 받아서 처리하겠다
		throw new Exception("eoqkr");
	}
}
