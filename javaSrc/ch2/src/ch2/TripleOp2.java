package ch2;

public class TripleOp2 {

	public static void main(String[] args) {
		// 사용 예) 게시글이 237개, 한 페이지에 10개씩 게시
		// 화면이 몇개 필요? TripleOp2
		int count = 237, page = 0;
		page = count % 10 == 0 ? count / 10 : count / 10 + 1;
		System.out.println(count + "게시하려면 " + page + "가 필요");
	}

}
