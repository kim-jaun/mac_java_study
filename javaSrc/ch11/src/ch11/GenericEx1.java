package ch11;

public class GenericEx1 {

	public static void main(String[] args) {

		GenericE<String> g = new GenericE<>();  // T는 String

		String[] strs = {"대박","쪽박","옹박"};

		g.set(strs);
		g.print();

		System.out.println("=========");

		GenericE<Integer> g2 = new GenericE<>(); // T는 Integer

		Integer[] i1 = {23, 56, 88, 99};

		g2.set(i1);

		g2.print();

	}

}