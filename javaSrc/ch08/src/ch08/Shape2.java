package ch08;

public abstract class Shape2 {
	void disp() {
		System.out.println("그려보세요.");
	}
	abstract void draw();
}
class Triangle2 extends Shape2 {
	void draw() {
		System.out.println("삼각형을 그린다.");
	}	
}

class Rectangle2 extends Shape2 {
	void disp() {
		System.out.println("어떤걸 그릴까요?");
	}
	void draw() {
		System.out.println("사각형을 그린다.");
	}
}

class Circle2 extends Shape2 {
	void draw() {
		System.out.println("원을 그린다.");
	}
}
