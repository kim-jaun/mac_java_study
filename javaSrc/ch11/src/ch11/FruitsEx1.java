package ch11;

class Orange1 {
	int sugar;  // 당분함량
	public Orange1(int sugar) {	this.sugar = sugar;	}
	void showSugar() {	System.out.println("당도 : "+sugar);	}
}

class FruitBox1 {
	Object item;
	void store(Object item) {	this.item = item;	}  // 과일 담는 메서드
	Object pullOut() { return item;  	}  // 과일 꺼내는 메서드
}

public class FruitsEx1 {
	public static void main(String[] args) {
		FruitBox1 fb1 = new FruitBox1();
		fb1.store(new Orange1(10));
		Orange1 og1 = (Orange1)fb1.pullOut();
		og1.showSugar();
		FruitBox1 fb2 = new FruitBox1();
		fb1.store("사과");
		Orange1 og2 = (Orange1)fb2.pullOut();
		og2.showSugar();
	}
}