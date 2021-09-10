package ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BookInput2 {
	public static void main(String[] args) throws IOException {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("book2"));
			while(true) {
				Book2 bool = (Book2)ois.readObject();
				System.out.println(bool);
			}
		} catch (Exception e) {
			System.out.println("처리 완료");
		} finally {
			ois.close();
		}
		
	}
}
