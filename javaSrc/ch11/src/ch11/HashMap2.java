package ch11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap2 {
	public static void main(String[] args) {
		String[] nations = {"미국", "영국", "중국", "한국", "일본"};
		String[] capitals = { "뉴욕", "런던", "베이징", "서울", "도쿄"};
		Map<String, String> map = new HashMap<>();
		for(int i = 0; i < nations.length; i++) {
			map.put(nations[i], capitals[i]);
		}
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
	}
}
