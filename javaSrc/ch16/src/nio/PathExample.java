package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
	public static void main(String[] args) {
		Path path = Paths.get("src/nio/PathExample.java");
		System.out.println("파일명 : " + path.getFileName());
		System.out.println("부모디렉토리 : " + path.getParent().getFileName());
		System.out.println("경로수 : " + path.getNameCount());
		for(int i = 0; i < path.getNameCount(); i++) {
			System.out.println(path.getName(i));
		}
	}
}
