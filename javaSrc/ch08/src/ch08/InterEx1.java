package ch08;

class F1 {
	void a(F2 f) {
		f.b();
	}
	void a(F3 f) {
		f.b();
	}
}

class F2 {
	void b() {
		System.out.println("AAAA");
	}
}

class F3 {
	void b() {
		System.out.println("BBBBBB");
	}
}

public class InterEx1 {
	public static void main(String[] args) {
		F2 f2 = new F2();
		F1 f1 = new F1();
		F3 f3 = new F3();
		f1.a(f2);
		f1.a(f3);
	}
}
