package ch08;

class Shape {
	void draw() {
		System.out.println("그린다");
	}
}
class Circle extends Shape {
	public void draw() {
		System.out.println("원을 그린다");
	}
}
class Triangle extends Shape {
	protected void draw() {
		System.out.println("삼각형을 그린다");
	}
}
class Rectangle extends Shape {
	void draw() {
		System.out.println("사각형을 그린다");
	}
}
public class ShapeEx {
	public static void main(String[] args) {
		Shape[] shapes = {new Circle(), new Triangle(), new Rectangle()};
		for(Shape shape: shapes) {
			shape.draw();
		}
	}
}

