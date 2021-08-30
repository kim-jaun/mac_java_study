package ch07;

public class Car1 {
	private Engine eg; // 포함관계.
	private String color;
	Car1() {}
	Car1(Engine eg, String color){
		this.eg = eg; this.color = color;
	}
	void print() {
		eg.print();
		System.out.println("색깔 : " + color);
	}
}
