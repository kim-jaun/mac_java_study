package ch03;

public class Do5 {
	public static void main(String[] args) {
		System.out.println("구구단");
		System.out.println("=======");
		int i = 1, j = 2;
		do {
			do {
				System.out.printf("%d * %d = %d\t", j, i, i * j);
				j++;
			}while (j <= 9);
			System.out.println();
			i++;
			j = 2;
		}while (i <= 9);
	}
}
