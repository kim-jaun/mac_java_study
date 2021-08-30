package ch07;

public class OuterEx {
	public static void main(String[] args) {
		Outer out = new Outer(100, 200);
		Outer.Inner inner = out.new Inner();
		Outer.Inner inner2 = out.getInner();
		System.out.println(inner.area());
		System.out.println(inner2.area());
	}
}
