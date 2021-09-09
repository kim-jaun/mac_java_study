package ch12;

class Shape {
	void draw() {
		System.out.println("그린다.");
		}
}

class Circle extends Shape {
	void draw() {
		System.out.println("원을 그린다.");
	}
}
class Rectangle extends Shape {
	void draw() {
		System.out.println("사각형을 그린다.");
	}
}
class Triangle extends Shape {
	void draw() {
		System.out.println("삼각형을 그린다.");
	}
}

public class Drew1 {
	public static void main(String[] args) {
		Shape[] sh = new Shape[3];
		sh[0] = new Circle();
		sh[1] = new Rectangle();
		sh[2] = new Triangle();
		
		for(Shape s : sh) {
			s.draw();
		}
	}
}
