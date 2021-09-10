package ch16;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Book2 extends Product implements Serializable {
	String writer; int page;
	public Book2(String name, int price, String writer, int page) {
		super(name, price); this.writer = writer; this.page = page;
	}
	public String toString() {
		return "책 [이름 : " + name + ", 가격 : " + price + ", 작가 : " + writer + ", 쪽수 : " + page + "]";
	}
	private void writeObjec(ObjectOutputStream oos) throws IOException {
		oos.writeUTF(name); oos.writeInt(price);
//		oos.writeUTF(writer); oos.writeInt(page);
		oos.defaultWriteObject();
	}
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		name = ois.readUTF(); price = ois.readInt();
//		writer = ois.readUTF(); page = ois.readInt();
		ois.defaultReadObject();
	}
}
