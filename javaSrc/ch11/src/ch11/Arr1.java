package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Arr1 {
	public static void main(String[] args) {
//		E : Element의 약자. Generic K : Key, V : Value, T : Type
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("구렁"); a1.add("8"); a1.add("7");
		a1.add("8"); a1.add("199");
		System.out.println("a1 : " + a1.size());
//		일반 for문
		for(int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("============");
		for(String snake:a1) {
			System.out.println(snake);
		}
		System.out.println("============");
//		a1.iterater() : 데이터 모두를 Iterator() 형식으로 추출
		Iterator<String> it = a1.iterator();
		while(it.hasNext() ) { // 데이터를 추출한 것이 있는지 확인.
			System.out.println(it.next()); // 가지고 와서 출력.
		}
	}
}
