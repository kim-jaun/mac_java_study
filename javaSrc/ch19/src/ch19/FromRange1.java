package ch19;

import java.util.stream.IntStream;

public class FromRange1 {
	static int sum = 0;
	public static void main(String[] args) {
		IntStream st = IntStream.rangeClosed(1, 100);
		st.forEach(a -> sum += a); // 변수명은 전역변수를 사용
		System.out.println("합계 : " + sum);
	}
}
