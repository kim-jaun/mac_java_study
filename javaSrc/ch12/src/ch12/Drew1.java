package ch12;

class Shape {
	void draw() {}
	void print() {
		System.out.println("그린다.");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.print("원을 ");
	}
}
class Rectangle extends Shape {
	void draw() {
		System.out.print("사각형을 ");
	}
}
class Triangle extends Shape {
	void draw() {
		System.out.print("삼각형을 ");
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
			s.print();
		}
	}
}
