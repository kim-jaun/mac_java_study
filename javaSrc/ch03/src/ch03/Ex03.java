package ch03;

public class Ex03 {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				int sum = i + j;
				if (sum == 6) {
					System.out.printf("%d + %d = %d\n",j,i,sum);
				}
			}
		}
	}
}
