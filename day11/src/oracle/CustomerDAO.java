package oracle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class CustomerDAO implements DAO {

	HashMap<String, CustomerVO> map;
	
	// Constructor
	public CustomerDAO(){
		map = new HashMap<String, CustomerVO>();
	}
	
	// Method
	@Override
	public void insert(CustomerVO c) throws DuplicatedIDException {
		String id = c.getId();
		if(map.containsKey(id)) {	// 만약에 map에 id를 갖는 객체가 존재하면
			throw new DuplicatedIDException("ID 중복 !");	// exception 발생
		}
		map.put(id, c);
	}
	@Override
	public void delete(String id) throws NotFoundException {
		if(!map.containsKey(id)) {
			throw new NotFoundException("아이디가 존재하지 않음");
		}
		map.remove(id);
	}
	@Override
	public void update(CustomerVO c) throws NotFoundException {
		if(!map.containsKey(c.getId())) {
			throw new NotFoundException("아이디가 존재하지 않음");
		}
		map.put(c.getId(), c);		//(Key값, 변경사항)
	}
	@Override
	public CustomerVO select(String id) throws NotFoundException {
		CustomerVO c = null;
		if(!map.containsKey(id)) {
			throw new NotFoundException("아이디가 존재하지 않음");
		}
		c = map.get(id);
		return c;
	}
	@Override
	public ArrayList<CustomerVO> select() throws NotFoundException {
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();
		
		if(map.size() == 0) {		// map 사이즈가 0이라는 것은 표시할 것이 없다는 뜻, 여기서 exception throw
			throw new NotFoundException("아이디가 존재하지 않음");
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
