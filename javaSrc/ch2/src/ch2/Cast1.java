package ch2;

public class Cast1 {
	public static void main(String[] args) {
		float f1 = 3.4f;
		int i1 = (int)f1; // 범위가 부족하지만 (명시적)형변환을 이용하여 적용.
		System.out.println("f1 = "+f1);
		System.out.println("i1 = "+i1);
		int i2 = 12;
		float f2 = i2; // (묵시적) 형변환.
		System.out.println("i2 = "+i2);
		System.out.println("f2 = "+f2);
	}
}
