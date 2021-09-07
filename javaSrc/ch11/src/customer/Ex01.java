package customer;

import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class Ex01 {
//	콘솔차(웹)으로부터 데이터를 받아서 처리하고 그 결과를 콘솔창에 보여준다
	private static CustomerServiceImp1 cs = new CustomerServiceImp1();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("명령어를 입력하세요");
			String command = sc.nextLine();
			if (command.equals("x")) break;
			else if(command.startsWith("insert")) { // insert로 시작하는 명령어
//				,를 기준으로 데이터를 나눠서 배열을 만들고 그것을 매개변수로 사용하여 메서드 실행
//				insert, id, 암호, 암호확인, 이메일, 이름을 입력. 총 6개
				insert(command.split(","));
			} else if (command.startsWith("select")) select(command.split(","));
			else if (command.startsWith("update")) update(command.split(","));
			else if (command.equals("list")) list();
			else if (command.startsWith("delete")) delete(command.split(","));
			else help(); // help 메서드 실행
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
	private static void delete(String[] str) {
		if (str.length != 2) {
			help();
			return;
		}
		int result = cs.delete(str[1]);
		if (result > 0) System.out.println("삭제 되었습니다");
	}
	private static void list() {
		Collection<Cutomer> list = cs.list();
//		null 값이 없음(객체가 생성 안됨). 객체는 생성됐지만 데이터 갯수가 0
		if (list == null || list.size() == 0) System.out.println("데이터가 없습니다");
		else 
			for(Cutomer customer : list) {
				System.out.println(customer);
			}
	}
	private static void update(String[] str) {
		if (str.length != 6) {
			help();
			return; // 메서드 종료
		}
		if (!str[2].equals(str[3])) {
			System.out.println("암호와 암호확인이 다릅니다");
			return;
		}
		Cutomer customer = new Cutomer(str[1], str[2], str[4], str[5], new Date());
//		CustomerServiceImp1에 있는 insert메서드를 실행하고 그결과를 result에 담아라
		int result = cs.update(customer);
		if (result == 1) System.out.println("고객 수정 되었습니다");
		
	}
	
	private static void select(String[] str) {
		if (str.length != 2) {
			help();
			return;
		}
		Cutomer customer = cs.select(str[1]);
		if (customer == null) System.out.println("없는 고객입니다");
		else System.out.println(customer);
	}
	
	private static void insert(String[] str) {
		if (str.length != 6) {
			help();
			return; // 메서드 종료
		}
		if (!str[2].equals(str[3])) {
			System.out.println("암호와 암호확인이 다릅니다");
			return;
		}
		Cutomer customer = new Cutomer(str[1], str[2], str[4], str[5], new Date());
//		CustomerServiceImp1에 있는 insert메서드를 실행하고 그결과를 result에 담아라
		int result = cs.insert(customer);
		if (result == 1) System.out.println("고객 등록 되었습니다");
		
	}
	private static void help() {
		System.out.println("잘못된 명령어 입니다");
		System.out.println("insert, id, 암호, 암호확인, 이메일, 이름");
		System.out.println("update, id, 암호, 암호확인, 이메일, 이름");
		System.out.println("select, id");
		System.out.println("list");
		System.out.println("x");
	}
}
