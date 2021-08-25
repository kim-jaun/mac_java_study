package ch05;

public class Box1 {
	int width;
	int height;
	int depth;
//	반환형 메서드명 // 반환형일아 : 메서드를 호출한 곳에 결과를 돌려준다.
	void calVolume() {
		System.out.println("부피 = " + width * height * depth);
	}
}
