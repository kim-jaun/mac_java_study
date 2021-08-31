package ch08;

interface I {
	void b();
}
class G1 {
	void a(I f) {
		f.b();
	}
}

class G2 implements I {
	public void b() {
		System.out.println("AAAA");
	}
}

class G3 implements I {
	public void b() {
		System.out.println("BBBBBB");
	}
}

public class InterEx2 {
	public static void main(String[] args) {
		G2 g2 = new G2();
		G1 g1 = new G1();
		G3 g3 = new G3();
		g1.a(g2);
		g1.a(g3);
	}
}
