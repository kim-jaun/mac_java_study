package ch03;
import java.util.Scanner;
public class For9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
			int n1 = 0;
			do {
				System.out.println("보고싶은 구구단?");
				n1 = sc.nextInt();
				if(n1 == 0) break;
				System.out.println(n1 + "단");
				if (n1 < 10 && n1 >= 2) {
					for (int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %d\n",n1,i, n1*i);
					}
				}else {
					System.out.println("구구단 숫자가 아닙니다.");
				}
			}while(true);
			sc.close();
	}
}
