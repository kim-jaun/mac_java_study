package ch17;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class UrlConn1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("url을 입력하세요");
		String addr = sc.nextLine();
		try {
			URL url = new URL(addr); // 인터넷 주소로 변경
			URLConnection uc = url.openConnection();	// 그 주소로 연결
			InputStream is = uc.getInputStream();		// 연결된 정보를 inputStream에 넣고 처리
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
			String str = "";
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
