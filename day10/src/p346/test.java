package p346;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class test {

	public static void main(String[] args) {
		// Map, ��������� ��� - Key, Value�� �����ϴ� ����, ArrayList�� Value�� ����
		HashMap<String, CustomerVO> map = new HashMap<String, CustomerVO>();
		
		// Insert, �ʿ� �����͸� �Է��Ѵ�.
		CustomerVO c1 = new CustomerVO("id101", "pwd01", "James1");
		CustomerVO c2 = new CustomerVO("id102", "pwd02", "James2");
		CustomerVO c3 = new CustomerVO("id103", "pwd03", "James3");
		CustomerVO c4 = new CustomerVO("id104", "pwd04", "James4");
		CustomerVO c5 = new CustomerVO("id105", "pwd05", "James5");
		
		map.put("id01", c1);		// c1��ü�� "id01"�̸����� ����, key value
		map.put("id02", c2);
		map.put("id03", c3);
		map.put("id04", c4);
		map.put("id05", c5);
		
		// delete �����ϱ�
		map.remove("id02");
		
		// update
		CustomerVO cc = new CustomerVO("id03", "ppp03", "jj03");	// id�� Ű���̱� ������ ���� �Ұ�
		map.put("id03", cc);			// ������ id03�� cc�� �ٲ��
		
		
		// select, �ʿ��� ������ �����ϱ�
		String id = "id03";		// id�� id03�� ���� ��û�ϱ�
		CustomerVO c = map.get(id);
		System.out.println(c);
		
		
		// select all, ������ ���� ����
		Collection<CustomerVO> col = map.values();
		Iterator<CustomerVO> it = col.iterator();
		
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();
		while(it.hasNext()) {		// ������ ������ 5���� �ݺ��Ѵ�.
			CustomerVO cust = it.next();
			list.add(cust);
		}
		
		for (CustomerVO customerVO : list) {
			System.out.println(customerVO);
		}
	}

}
