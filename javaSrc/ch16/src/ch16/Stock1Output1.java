package ch16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Stock1Output1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("stock"));
		oos.writeObject(new Stock1("111", 100));
		oos.writeObject(new Stock1("222", 200));
		oos.writeObject(new Stock1("333", 300));
		oos.close();
		System.out.println("저장완료");
	}
}
