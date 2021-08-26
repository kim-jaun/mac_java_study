package ch05;

class Box2 {
	int width, height, depth;
	public Box2() {}
	public Box2(int w, int h, int d) {
		width = w; height = h; depth = d;
	}
	void volum() {
		System.out.println("부피 : " + width * height * depth);
	}
}


public class Box2Ex {

	public static void main(String[] args) {
		Box2 b1 = new Box2();
		b1.width = 10; b1.height = 10; b1.depth = 10;
		b1.volum();
		Box2 b2 = new Box2(10, 20, 30); Box2 b3 = new Box2(12, 15, 20);
		b2.volum(); b3.volum();
	}

}
