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
		if(map.containsKey(id)) {	// ���࿡ map�� id�� ���� ��ü�� �����ϸ�
			throw new DuplicatedIDException("ID �ߺ� !");	// exception �߻�
		}
		map.put(id, c);
	}
	@Override
	public void delete(String id) throws NotFoundException {
		if(!map.containsKey(id)) {
			throw new NotFoundException("���̵� �������� ����");
		}
		map.remove(id);
	}
	@Override
	public void update(CustomerVO c) throws NotFoundException {
		if(!map.containsKey(c.getId())) {
			throw new NotFoundException("���̵� �������� ����");
		}
		map.put(c.getId(), c);		//(Key��, �������)
	}
	@Override
	public CustomerVO select(String id) throws NotFoundException {
		CustomerVO c = null;
		if(!map.containsKey(id)) {
			throw new NotFoundException("���̵� �������� ����");
		}
		c = map.get(id);
		return c;
	}
	@Override
	public ArrayList<CustomerVO> select() throws NotFoundException {
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();
		
		if(map.size() == 0) {		// map ����� 0�̶�� ���� ǥ���� ���� ���ٴ� ��, ���⼭ exception throw
			throw new NotFoundException("���̵� �������� ����");
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