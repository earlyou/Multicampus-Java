package p345;

import java.util.ArrayList;

public class MariadbDAO implements DAO {

	@Override
	public void insert(CustomerVO c) {
		connect();
		System.out.println("Mariadb Inserted: "+c);
		close();
	}

	@Override
	public void delete(String id) {
		connect();
		System.out.println("Mariadb Deleted: "+id);
		close();
	}

	@Override
	public CustomerVO select(String id) {
		connect();
		System.out.println("Mariadb Selected: "+id);
		CustomerVO c = new CustomerVO("id01","pwd01","James");	// ���� DB
		close();
		return c;
	}

	@Override
	public ArrayList<CustomerVO> select() {
		connect();
		System.out.println("Mariadb Selected All: ");
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();
		list.add(new CustomerVO("id01","pwd01","James1"));	// ����Ʈ�� ��ü �ֱ�
		list.add(new CustomerVO("id02","pwd02","James2"));
		list.add(new CustomerVO("id03","pwd04","James3"));
		close();
		return list;
	}

}
