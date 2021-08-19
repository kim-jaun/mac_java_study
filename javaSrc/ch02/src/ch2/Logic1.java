package ch2;

public class Logic1 {

	public static void main(String[] args) {
		int i1 = 7, i2 = 8;
		boolean b1 = i1 > i2, b2 = i1 < i2, b3 = i1 == i2, b4 = i1 == i2;
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " + b4);
		System.out.println("=============");
		System.out.println("b1 && b2 " + (b1 && b2));
		System.out.println("b1 && b3 " + (b1 && b3));
		System.out.println("b1 && b4 " + (b1 && b4));
		System.out.println("=======	======");
		System.out.println("b1 || b2 " + (b1 || b2));
		System.out.println("b1 || b3 " + (b1 || b3));
		System.out.println("b1 || b4 " + (b1 || b4));
	}

}
