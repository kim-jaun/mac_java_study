package ch16;

import java.io.Serializable;

public class Stock1 implements Serializable{
	String code;
//	transient int num; // transient를 하면 숫자는 0, 문자는 null로 저장.(직렬화 제외)
	int num;
	public Stock1(String code, int num) {
		this.code = code;	this.num = num;
	}
	public String toString() {
		return "주식[코드 : " + code + ", 수량 : " + num + "]";
	}
}
