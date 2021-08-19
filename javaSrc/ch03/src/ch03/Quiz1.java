package ch03;

public class Quiz1 {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = "";
		if (month == 12 || month == 1 || month == 2)
			season = "겨울 입니다.";
		else if (month == 3 || month == 4 || month == 5)
			season = "봄 입니다.";
		else if (month == 6 || month == 7 || month == 8)
			season = "여름 입니다.";
		else if (month == 9 || month == 10 || month == 11)
			season = "가을 입니다.";
		else season = "월을 입력하세요.";
		System.out.println(season);
	}

}
