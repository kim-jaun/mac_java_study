package ch2;

public class Var2 {
	public static void main(String[] args) {
		float f1 = 4.4f;
		float f2 = 4.45F;
		double d1 = 3.67;
		double d2 = f1 + f2;
//		float f3 = f1 + d1; 범위가 작은 데이터는 큰 곳에 저장 못 한다. 
		System.out.println("f1 = "+f1);
		System.out.println("f2 = "+f2);
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
	}
}
