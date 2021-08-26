package ch05;
class D1 {
//	변수는 선언할수 있지만 실행문은 method안에서 사용
	int k1 = 3; // 인스턴스변수는 객체가 생성될 때마다 실행.
	int[] i1 = new int[3];
	static int s1 = 7; // 클래스 변수는 클래스 로딩할 때 1회 실행.
	static int[] k2 = new int[5];
	
	{	// 인스턴스 초기화 블럭에는 실행문을 사용가능, 객체가 생성될 때마다 실행.
		for (int i = 0; i < i1.length; i++) {
			i1[i] = i;
		}
	}
	static { //클래스 초기화 블럭, 클래스를 로딩할 때 실행.
		for (int i = 0; i < k2.length; i++) {
			k2[i] = i;
		}
	}
}
public class InitBlk1 {
	public static void main(String[] args) {
		for (int i = 0; i < D1.k2.length; i++) {
			System.out.println(D1.k2[i]);
		}
		System.out.println("===================");
		D1 d = new D1();
		for(int i = 0; i < d.i1.length; i++) {
			System.out.println(d.i1[i]);
		}
	}
	
}
