package ch03;

public class Do2 {
	public static void main(String[] args) {
		int sum = 0, i = 1;
		do {
			sum += i;
			i++;
		}while(i <= 10);
		System.out.println(sum);
	}
}
