package ch07;

public class Outer {
	private int height;
	private int width;
	public Outer(int height, int width) {
		this.width = width; this.height = height;
	}
	public Inner getInner() { // Inner 객체를 반환형.
		return new Inner();
	}
	class Inner { // 밖의 클래스에 있는 멤버변수가 메서드를 자기 것처럼 사용.
		private float rate = 0.5f;
		public float area() {
			return width * height * rate;
		}
	}
}
