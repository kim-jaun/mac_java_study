package ch11;

import java.util.ArrayList;
import java.util.Scanner;

public class Arr4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		ArrayList<String> al = new ArrayList<>();
		while(true) {
			System.out.println("이름을 입력하세요.");
			name = sc.nextLine();
			if(name.equals("x")) break;
			al.add(name);
		}
		for (String n : al) {
			System.out.println(n);
		}
		sc.close();
	}
}
