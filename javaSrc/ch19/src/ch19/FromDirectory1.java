package ch19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectory1 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./src/ch19/");
		Stream<Path> st = Files.list(path);
		st.forEach(s -> System.out.println(s.getFileName()));
		st.close();
	}
}
