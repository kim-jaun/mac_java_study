package ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StockInput1 {
	public static void main(String[] args) throws IOException {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("stock1"));
			while(true) {
//				배달된 책상부품을 메뉴얼보고 조립
				Stock1 stock = (Stock1)ois.readObject();
				System.out.println(stock);
			}
		} catch (Exception e) {
			System.out.println("처리 완료");
		} finally {
			ois.close();
		}
	}
}
