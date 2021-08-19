package ch2;

public class TripleOp1 {

	public static void main(String[] args) {
		int i1 = 7;
		System.out.println(i1 + "은 짝수입니까?");
		// 변수 = 조건?true일 때 값:false일 때 값
		boolean b1 = i1 % 2 == 0 ? true : false;
		System.out.println("b1 = " + b1);
	}

}
