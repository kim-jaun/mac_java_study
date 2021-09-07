package customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CustomerDaoImp1 { // DAO Data Access Object
//	전달받은 고객데이터를 map을 이용하여 저장, 수정, 삭제, 추출
//	Map에 저장하면 프로그램 종료 후에는 없어진다. DB에 저장하면 계속 보관됨
	private Map<String, Cutomer> map = new HashMap<>();

	public Cutomer select(String id) {
		return map.get(id);
	}

	public int insert(Cutomer customer) {
		map.put(customer.getId(), customer);
		return 1;
	}
	public int update(Cutomer customer) {
		map.put(customer.getId(), customer);
		return 1;
	}

	public Collection<Cutomer> list() {
		return map.values();
	}

	public int delete(String id) {
		map.remove(id);
		return 1;
	}
	
}
