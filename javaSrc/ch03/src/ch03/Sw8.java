package ch03;

public class Sw8 {
	public static void main(String[] args) {
		int salary = Integer.parseInt(args[0]);
		String grade = "";
		if (salary > 1000000) grade = "A";
		else {
		switch (salary/100000) {
		case 10 : grade = "A"; break;
		case 9 : grade = "B"; break;
		case 8 : grade = "C"; break;
		case 7 : grade = "D"; break;
		default : grade = "E";
		}}
		
		System.out.println(grade);
	}
}
