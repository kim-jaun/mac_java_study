package customer;

public class CustomerServiceImp1 {
//	Ex01로 데이터를 전달받아서 Dao작업을 시키고 그 결과를 
	private static CustomerDaoImp1 cd = new CustomerDaoImp1();
	public int insert(Cutomer customer) {
		int result = 0;	
		Cutomer customer2 = cd.select(customer.getId());
		if (customer2 == null) result = cd.insert(customer);
		else System.out.println("이미 있는 아이디 입니다");
		return result;
	}
	public Cutomer select(String id) {
		return cd.select(id);
	}

	public int update(Cutomer customer) {
		int result = 0;	
		Cutomer customer2 = cd.select(customer.getId());
		if (customer2 != null) result = cd.update(customer);
		else System.out.println("정보가 존재하지 않습니다");
		return result;
	}


	
}
