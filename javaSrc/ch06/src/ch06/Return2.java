package ch06;

public class Return2 {

	public static void main(String[] args) {
		// 연산결과를 정수로 가지고 와서 result 저장.
		int result = add(10, 5);
		System.out.println("연산결과 : " + result);
		double k1 = minus(10.7, 2.1);
		System.out.println("연산결과 : " + k1);
	}
private static double minus(double d, double j) {
		return d - j;
	}
	//				   반환형 : 작업한 결과를 이 메서드를 호출한 곳에 돌려줘라(정수로)
	private static int add(int i, int j) {
		return i + j;
	}

}
