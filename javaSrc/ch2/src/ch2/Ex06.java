package ch2;

public class Ex06 {

	public static void main(String[] args) {
		float pi = 3.141592f;
//		3141.1592f => 3141 (int로 형변환이 된 결과) => 3.141 (float로 형변환)
//		Math.round 반올림하여 정수로 변환.
		float f1 = Math.round(pi * 1000) / 1000f;
		System.out.println("f1 = " + f1);
	}

}
