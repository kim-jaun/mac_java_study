package ch11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class Properti1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
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
