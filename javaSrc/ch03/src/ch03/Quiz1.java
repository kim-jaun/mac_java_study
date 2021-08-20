package ch03;

public class Quiz1 {

	public static void main(String[] args) {
		int value = Integer.parseInt(args[0]);
		String msg = "";
		if (value < 10) msg = "10 미만의 값입니다.";
		else if (value >= 10 && value < 100) msg = "10이상 100 미만의 값입니다.";
		else if (value >= 100 && value < 1000) msg = "100이상 1000 미만의 값입니다.";
		else msg = "1000 이상의 값입니다.";
		System.out.println(" 해당 값은 " + msg);
	}

}
