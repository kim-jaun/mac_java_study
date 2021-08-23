package ch04;

public class Arr3 {
	public static void main(String[] args) {
		int[] st = {34, 56, 77, 25, 88};
		// 일반 for문 
		for (int s = 0; s < st.length; s++) {
			System.out.println(st[s]);
		}
		System.out.println("===============");
		// 확장 for, 신 for
		for(int i : st) { // 배열안에 값을 하나씩 차례로 대입하여 처리, 없으면 종료.
			// 인덱스 위치는 모름.
			System.out.println(i);
		}
	}
}
