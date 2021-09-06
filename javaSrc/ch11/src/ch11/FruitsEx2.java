package ch11;

class Orange2 {
	int sugar;  // 당분함량
	public Orange2(int sugar) {	this.sugar = sugar;	}
	void showSugar() {	System.out.println("당도 : "+sugar);	}
}

class Apple {
	int weight;
	public Apple(int weight) {
		this.weight = weight;
	}
	void showWeight() {
		System.out.println("무게 : " + weight);
	}
}

class FruitBox2<T> {
	T item;
	void store(T item) {	this.item = item;	}  // 과일 담는 메서드
	T pullOut() { return item;  	}  // 과일 꺼내는 메서드
}

public class FruitsEx2 {
	public static void main(String[] args) {
		FruitBox2<Orange2> fb1 = new FruitBox2<>();
		fb1.store(new Orange2(10));
		Orange2 og1 = (Orange2)fb1.pullOut();
		og1.showSugar();
		FruitBox2<Orange2> fb2 = new FruitBox2<>();
//		fb2.store("사과"); // 사과라는 문제는 Orange2가 아니므로 에러 발생
//		fb2.store(new Apple(10));
	}
}