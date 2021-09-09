package ch16;

import java.io.Serializable;

class Product {
	String name; int price;
	public Product() {}
	Product(String name, int price){
		this.name = name; this.price = price;
	}
	public String toString() {
		return "제품 [이름 : " + name + ", 가격 : " + price + "]";
	}
}

public class Book extends Product implements Serializable {
	String writer; int page;
	public Book(String name, int price, String writer, int page) {
		super(name, price); this.writer = writer; this.page = page;
	}
	public String toString() {
		return "책 [이름 : " + name + ", 가격 : " + price + ", 작가 : " + writer + ", 쪽수 : " + page + "]";
	}
}
