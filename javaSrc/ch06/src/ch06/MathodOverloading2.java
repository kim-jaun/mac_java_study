package ch06;

class B2 {
	int volume(int x, int y, int z) {
		return x * y * z;
	}
	double volume(int x, int y, int z) {
		return x * y * z;
	}
}

public class MathodOverloading2 {
	public static void main(String[] args) {
		B2 b1 = new B2();
		System.out.println(b1.volume(3, 5, 7));
		Systme.out.println(b1.volume(3.5, 4.2, 5.5));
	}
}
