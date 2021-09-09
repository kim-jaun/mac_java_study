package ch16;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.GregorianCalendar;

public class ObjectInput1 {
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("out1"));
			while(true) {
				GregorianCalendar gc = (GregorianCalendar) ois.readObject();
				System.out.printf("%TF\n",gc);
			}
		} 
		catch(EOFException e) {
			System.out.println("전부 읽었습니다");
		}
		catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다");
		}
		catch (ClassNotFoundException e) {
			System.out.println("파일을 찾을수 없습니다");
		}
		
	}
}
