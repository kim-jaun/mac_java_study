package ch03;

public class if6 {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
		if (score >= 90) grade = "A";
		else if (score >= 80) grade = "B";
		else if (score >= 70) grade = "C";
		else if (score >= 60) grade = "D";
		else grade = "F";
		
		int etc = score % 10;
		if (score > 100) grade = "점수를 입력하세요.";
		else if (score == 100) grade += "+";
		else if (etc >= 5) grade += "+";
		else grade += "0";
		System.out.println("점수 : " + score + ", 학점 : " + grade);
	}

}
