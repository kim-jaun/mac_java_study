package ch11;

import java.util.ArrayList;
import java.util.Scanner;

public class Arr5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pat = "";
		ArrayList<String> al = new ArrayList<>();
		while(true) {
			System.out.println("동물을 입력하세요.");
			pat = sc.nextLine();
			if(pat.equals("x")) break;
			al.add(pat);
		}
		prn(al);
		al.add(2,"도롱뇽"); prn(al);
		al.add(4,"공룡"); prn(al);
		al.remove(1); prn(al);
		al.remove("애벌레"); prn(al);
		sc.close();
	}

	private static void prn(ArrayList<String> al) {
		for(int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + "\t");
		}
		System.out.println();
		
	}
	
}
