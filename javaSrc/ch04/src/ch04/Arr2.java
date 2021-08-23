package ch04;

public class Arr2 {
	public static void main(String[] args) {
		// 정수 배열 3개 만들고, 각각 67, 88, 66 대입하고 출력.
		// 문자열 배열 5개 만들고 동시에 대박, 사건, 쪽박, 옹박, 박박을 대입하고 출력.
		int[] i = new int[3];
		i[0] = 67;
		i[1] = 88;
		i[2] = 66;
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		String[] st = {"대박", "사건", "쪽박", "옹박", "박박"};
		for (int s = 0; s < st.length; s++) {
			System.out.println(st[s]);
		}
	}
}
