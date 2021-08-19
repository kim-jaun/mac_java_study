package ch2;

public class Cast2 {

	public static void main(String[] args) {
		byte a = (byte)128; // -128 ~ 127
		System.out.println("128을 저장한 byte 값은 : "+a);
		byte b = (byte)256; // -128 ~ 127
		System.out.println("256을 저장한 byte 값은 : "+b);
	}
// 범위를 벗어났기때문에 두번째 함수인 b의 값이 0으로 나온것.
}
