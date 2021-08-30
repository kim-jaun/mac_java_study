package ch07;

public class Car2Ex {
	public static void main(String[] args) {
//		묵시적 관계, up casting
		Car2 c1 = new FireEngine2();
		Car2 c2 = new Ambulance2();
//		부모를 선언하고 자식을 생성하여 대입했을 경우에는 부모가 가진 메서드만 실행.
		c2.drive(); // c2.siren();
//		명시적 관계, down casting, 실행할때 에러 발생.
//		FireEngine2 f2 = (FireEngine2) new Car2();
		FireEngine2 f1 = (FireEngine2)c1;
//		FireEngine2 f2 = (FireEngine2)c2();
//		자식을 선언하고 부모를 대입했을 경우에 자식이 실행할수있는 메서드를 모두 실행 가능.
		f1.drive(); f1.water();
		
	}
}
