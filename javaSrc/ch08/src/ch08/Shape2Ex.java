package ch08;

public class Shape2Ex {
	public static void main(String[] args) {
		Shape2[] sh2 = new Shape2[3];
		sh2[0] = new Rectangle2();
		sh2[1] = new Triangle2();
		sh2[2] = new Circle2();
		
		for(int i = 0; i < sh2.length; i++) {
			sh2[i].disp();
			sh2[i].draw();
		}
	}
}
