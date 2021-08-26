package ch06;

public class Return2 {

	public static void main(String[] args) {
		int result = max(10, 7);
		System.out.println("큰 수 : " + result);
	}

	private static int max(int i, int j) {
		int result = 0;
		if(i > j ) {
			result = i;
		} else {
			result = j;
		}
		return result;
	}
}
