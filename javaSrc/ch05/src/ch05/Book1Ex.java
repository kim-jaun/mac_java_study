package ch05;

public class Book1Ex {
	public static void main(String[] args) {
		Book1 b1 = new Book1();
		Book1 b2 = new Book1();
		Book1 b3 = new Book1();
		
		Book1[] book = {b1, b2, b3}; // 객체도 배열로 만들 수 있다.
		String[] titles = {"대지", "죄와 벌", "노인과 바다"};
		String[] writers = {"펄벅", "토예토예프스키", "하밍웨이"};
		int[] prices = {20000, 25000, 23000};
		
		for (int i = 0; i < book.length; i++) {
			book[i].title = titles[i];
			book[i].writer = writers[i];
			book[i].price = prices[i];
			book[i].disp();
		}
	}
}
