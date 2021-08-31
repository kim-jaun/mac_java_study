package ch08;

class Person {
	void move() {
		System.out.println("두 다리로 걷는다.");
	}
}

interface Fish {
	void swin();
}

public class Mermaid extends Person implements Fish{
	public void swin() {
		System.out.println("지느러미를 이용하여 수영한다.");
	}
	public static void main(String[] args) {
		Mermaid mm = new Mermaid();
		mm.move(); mm.swin();
	}
}
