package ch11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("로제","010-222-2222");
		map.put("iu","010-233-2322");
		map.put("jun","010-211-1222");
		System.out.println("로제 : " + map.get("로제"));
		System.out.println("로제 : " + map.get("iu"));
		
		Set<String> set = map.keySet(); // map데이터에서 key만 추출
		for(String key : set) {
			System.out.println(key + " = " + map.get(key));
		}
	}
}
