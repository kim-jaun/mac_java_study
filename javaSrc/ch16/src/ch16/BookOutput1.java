package ch16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BookOutput1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("book1"));
		oos.writeObject(new Book("대지", 20000, "펄벅", 2000));
		oos.writeObject(new Book("파피용", 25000, "베르나르베르베르", 1000));
		oos.writeObject(new Book("죄와벌", 23000, "도엡토브스키", 1500));
		oos.close();
		System.out.println("저장완료");
	}
}
