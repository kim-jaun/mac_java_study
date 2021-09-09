package ch16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutput1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("out1"));
//		writeObject를 사용하면 직열화 binary코드로 저장
		oos.writeObject(new GregorianCalendar(2021,8,7));
		oos.writeObject(new GregorianCalendar(2021,8,8));
		oos.writeObject(new GregorianCalendar(2021,8,9));
		oos.close();
		
		System.out.println("저장 완료.");
	}
}
