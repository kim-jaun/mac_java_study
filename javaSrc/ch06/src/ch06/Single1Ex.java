package ch06;

class Single1 {
//	prinvate를 막은 이유 : load될 때 한번만 실행.
	private static Single1 instance = new Single1();
	private Single1() {}	// 외부에서 객체를 생성하지 못하게 하기 위해
	public static Single1 getInstance() {
//		이 클래스를 사요하는 경우는 하나의 객체를 가지고 공용.
		return instance;
	}
}

public class Single1Ex {
	public static void main(String[] args)	{
//		Single1 s1 = new Single1();
//		Single1 s2 = new Single1();
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		하나의 객체를 가지고 여러 곳에서 사용한다.
		Single1 s1 = Single1.getInstance();
		Single1 s2 = Single1.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		}
}
