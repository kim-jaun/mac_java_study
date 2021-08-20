package ch03;

public class While5 {
	public static void main(String[] args) {
		int sum = 0, i = 1;
		while (i <= 10) {
			sum += i;
			System.out.println("i가 " + i + "일 때 sum은 " + sum + "이다.");
			i++;
		}
	}
}