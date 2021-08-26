package ch05;
class Shape1 {
	int width, height, depth;
	final double PI = 3.14;
//	width 원의 넓이는 width * width * PI
//	width, height 사각형의 넓이는 width * height
//	width, height, depth 값을 세팅
	public Shape1(int w) {
		width = w;
	}
	public Shape1(int w, int h) {
		width = w; height = h;
	}
	public Shape1(int w, int h, int d) {
		width = w; height = h; depth = d;
	}
	void calCircle() {
		System.out.println("Circls : " + width * width * PI);
	}
	void calRectanle() {
		System.out.println("Rectanle : " + width * height);
	}
	void calVolume() {
		System.out.println("Volume : " + width * height * depth);
	}
}
public class Shape1Ex {
	public static void main(String[] args) {
		Shape1 s1 = new Shape1(10);
		Shape1 s2 = new Shape1(10, 30);
		Shape1 s3 = new Shape1(10, 23, 15);
		s1.calCircle();
		s2.calRectanle();
		s3.calVolume();
	}
}
