package p344;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// Collection API
//		CustomerVO cs[] = new CustomerVO[5];
		
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>(); // new ArrayList<CustomerVO>()���� CustomerVO�� �����
		list.add(new CustomerVO("id01","pwd01","James1"));	// ����Ʈ�� ��ü �ֱ�
		list.add(new CustomerVO("id02","pwd02","James2"));
		list.add(new CustomerVO("id03","pwd04","James3"));
		
		for (CustomerVO c : list) {		// list���� CustomerVO��ü�� �ϳ��� Ƣ��´�.
			System.out.println(c);		// list ������ �ϳ��� ��µȴ�.
		}
		
	}

}
