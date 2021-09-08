package ch16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Random1 {
	public static void main(String[] args) throws IOException {
		File file = new File("random.dat");
		FileOutputStream fos = new FileOutputStream(file);
		for (int i = 0; i <= 100; i++) {
			fos.write(i);
		}
		fos.close();
		
		RandomAccessFile raf = new RandomAccessFile("random.dat", "rw");
		for(int i = 0; i <= 100; i+= 10) {
			raf.seek(i);
			System.out.print(raf.readByte() + "\t");
		}
		raf.close();
	}
}
