package ch04;

public class ArrCpy4 {
	public static void main(String[] args) {
		String[] cities = {"서울", "부산", "인천", "대구", "대전", "광주"};
		String[] nations = {"미국", "영국", "중국", "종국", "떡국"};
		String[] newArr = new String[cities.length + nations.length];
//		cities newArr로 복사하고 그 뒤에 nations 데이터를 복사한 후에 newArr을 출력.
		System.arraycopy(cities, 0, newArr, 0, cities.length);
		System.arraycopy(nations, 0, newArr, cities.length, nations.length);
		for(String str : newArr) {
			System.out.println(str);
		}
	}
}
