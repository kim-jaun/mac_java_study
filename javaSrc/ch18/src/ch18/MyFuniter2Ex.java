package ch18;

interface MyInter2 {
	public int method(int x, int y);
}

public class MyFuniter2Ex {
	public static void main(String[] args) {
		MyInter2 mi = new MyInter2() {
			public int method(int x, int y) { return x+y; }
		};
		System.out.println(mi.method(12, 23));
//		매개변수가 있으면 매개변수명 사용
		mi = (x,y) -> {	return x+y;	};
		System.out.println(mi.method(11, 8));
//		문장이 하나일경우에는 중괄호({})생략, return문만 있으면 return 생략
		mi = (x,y) -> x+y;
		System.out.println(mi.method(55, 23));
	}
}
