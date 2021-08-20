package ch03;

public class Sw4 {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String msg = "";
		switch(month) { 
		case 12 : case 1 : case 2 : // 중첩 조건문. 
			switch(month) { // break문은 하나의 switch문만 종료시킨다.
			case 12 : msg = "초"; break;
			case 1 : msg = "중"; break;
			case 2 : msg = "늦"; break;
			}
			msg += "겨울"; break;
		case 3 : case 4 : case 5 : 
			switch(month) {
			case 3 : msg = "초"; break;
			case 4 : msg = "중"; break;
			case 5 : msg = "늦"; break;
			}
			msg += "봄"; break;
		case 6 : case 7 : case 8 : 
			switch(month) {
			case 6 : msg = "초"; break;
			case 7 : msg = "중"; break;
			case 8 : msg = "늦"; break;
			}
			msg += "여름"; break;
		case 9 : case 10 : case 11 : 
			switch(month) {
			case 9 : msg = "초"; break;
			case 10 : msg = "중"; break;
			case 11 : msg = "늦"; break;
			}
			msg += "가을"; break;
		default : msg = "월을 입력해 주세요.";
		}
		System.out.println(msg);
	}
}
