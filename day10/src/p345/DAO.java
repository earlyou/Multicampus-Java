package p345;

import java.util.ArrayList;

public interface DAO {					// interface�� ���� ��ɸ� �����ϴ� �������̴�.
//	static final int a = 1000;			// �� �������ִ� ������ ���� ����
	
	
	
	public default void connect() {		// �ֱٿ��� interface�ȿ� �Լ��� ���� �� �ֵ��� �ٲ����.
		System.out.println("Connect .....");
	}
	public default void close() {		// ���⼭ default�� �Ϲ� �Լ���� ���̴�. private, public default �ƴ�
		System.out.println("Close .....");
	}
	
	public void insert(CustomerVO c);	// ��� �߻� �޼ҵ�� ����, abstract�� �������� ��
	public void delete(String id);
	public CustomerVO select(String id);
	public ArrayList<CustomerVO> select();
}
