package ch06;

class B2 {
	// 생성자 오버로딩
	int x, y, z;
	B2() {}
	B2(int w, int h, int d){
		x = w; y = h; z = d;
	}
	// 메서드 오버로딩.
	int volume() {
		return x * y * z;
	}
	int volume(int x, int y, int z) {
		return x * y * z;
	}
	double volume(double x, double y, double z) {
		return x * y * z;
	}
}

public class MathodOverloading2 {
	public static void main(String[] args) {
		B2 b1 = new B2();
		System.out.println(b1.volume(3, 5, 7));
		System.out.println(b1.volume(3.5, 4.2, 5.5));
		B2 b = new B2(12, 15, 20);
		System.out.println(b.volume());
	}
}
