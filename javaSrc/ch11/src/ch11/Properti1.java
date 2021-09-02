package ch11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class Properti1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		외부에 있는 확장자가 .properties를 읽어서 사용할 때 사용
//		외부파일은 "키 = 값" 형식으로 구성되어있다.
//		참조변수 .getProperty(키)를 사용하여 값을 읽는다.
		Properties pro = new Properties();
		String path = Properti1.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path,"utf-8");
		pro.load(new FileReader(path));
		
		System.out.println("driver : " + pro.getProperty("driver"));
		System.out.println("url : " + pro.getProperty("url"));
		System.out.println("username : " + pro.getProperty("username"));
		System.out.println("password : " + pro.getProperty("password"));
	}
}
