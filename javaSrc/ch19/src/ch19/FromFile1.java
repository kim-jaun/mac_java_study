package ch19;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFile1 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./src/ch19/linedata.txt");
		Stream<String> st = Files.lines(path, Charset.defaultCharset());
		st.forEach(System.out::println);
		st.close();
	}
}
