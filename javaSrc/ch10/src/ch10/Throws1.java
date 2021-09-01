package ch10;

public class Throws1 {
	public static void main(String[] args) {
		for (int k = 0; k < 8; k++) {
			int i = (int)(Math.random()*10);
			m1(i);
		}
	}

	private static void m1(int i) throws ArithmeticException {
			m2(i);
	}
//	throws는 예외가 발생하면 메서드를 보낸 곳으로 처리를 넘긴다.
	private static void m2(int i) throws ArithmeticException {
		try {
			int k = 12;
			System.out.printf("%d / %d = %d\n", k, i, k / i);
		}catch(Exception e) {
//			e.printStackTrace(); = 에러가 난 위치를 차례로 보여준다
			System.out.println("0으로 나눌수 없습니다.");
		}
	}
}
