
package ch07;

class G1 {
	G1() {
		System.out.println("매개변수 없는 부모");
	}
	G1(int k){
		System.out.println("매개변수 1 개 부모 k = " + k);
	}
}

class G2 extends G1 {
	G2(int k) {
		super(k);
		System.out.println("자식 생성자 k = " + k);
	}
}

public class Super3 {
	public static void main(String[] args) {
		G2 g = new G2(7);
	}
}
