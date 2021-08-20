package ch03;
import java.util.Scanner;
public class Game1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// number에는 1 ~ 100사이의 숫자 (0 ~ 99)
		int ran = (int) (Math.random() * 100) + 1;
		int num = 0, cnt = 0;
		do {
			cnt++;
			System.out.println("숫자를 맞춰 보세요.");
			num = sc.nextInt();
			if (num == ran) break;
			else if (num > ran) System.out.println("UP");
			else System.out.println("DOWN");
		}while(true);
		System.out.println(cnt + "번에 정답 : " + ran);
		sc.close();
	}
}
