package ch16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWrit1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일명을 입력하세요");
		String fileName = br.readLine();
		System.out.println("저장하고 싶은 글자를 입력하세요");
		String msg = br.readLine();
		File file = new File("./src/" + fileName);				// 파일 생성
		FileWriter fw = new FileWriter(file);		// 파일에 저장
		fw.write(msg);			// 메세지를 저장.
		fw.close();
		System.out.println("저장 성공.");
		br.close();
	}
}
