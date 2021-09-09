package ch16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReader1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("읽고 싶은 파일명");
		String fileName = sc.nextLine();
		BufferedReader br = new BufferedReader(
				new FileReader(fileName));
		String str = "";
//		null > 더이상 읽을 데이터가 없다
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
		sc.close();
	}
}
