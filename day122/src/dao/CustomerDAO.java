package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import frame.DAO;
import vo.CustomerVO;

public class CustomerDAO implements DAO<String, CustomerVO> {
	
	HashMap<String, CustomerVO> map;
	// Constructor
	public CustomerDAO() {
		map = new HashMap<String, CustomerVO>();
	}
	
	@Override
	public void insert(CustomerVO v) throws Exception {
		String id = v.getId();
		if(map.containsKey(id)) {
			throw new Exception("ID 중복");
		}
		map.put(id, v);
	}

	@Override
	public void delete(String k) throws Exception {
		if(!map.containsKey(k)) {
			throw new Exception("ID가 없음");		// Exception던지고 더 이상 진행하지 않음
		}
		map.remove(k);
		
	}

	@Override
	public void update(CustomerVO v) throws Exception {
		if(!map.containsKey(v.getId())) {
			throw new Exception("ID가 없음");
		}
		map.put(v.getId(), v);
	}

	@Override
	public Object select(String k) throws Exception {
		CustomerVO c = null;
		if(!map.containsKey(k)) {
			throw new Exception("ID가 없음");
		}
		c = map.get(k);
		return c;
	}

	@Override
	public List<CustomerVO> select() throws Exception {
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();
		
		if(map.size() == 0) {		// map 사이즈가 0이라는 것은 표시할 것이 없다는 뜻, 여기서 exception throw
			throw new Exception("ID가 없음");
		}
		
		Collection<CustomerVO> col = map.values();
		Iterator<CustomerVO> it = col.iterator();
		
		while(it.hasNext()) {
			CustomerVO cust = it.next();
			list.add(cust);
		}
		return list;
	}

}
