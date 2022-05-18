package oracle;

import java.util.ArrayList;

public interface DAO {
	public default void connect() {
		System.out.println("Connect .....");
	}
	public default void close() {		
		System.out.println("Close .....");
	}
	
	// CRUD
	public void insert(Object obj) throws Exception;	// �׳� Exception ����. ���߿� �Ӹ��к�����.
	public void delete(Object obj) throws Exception;	// Object�� �ֻ��� Ŭ�����̱� ������		
	public void update(Object obj) throws Exception;	// � VO�� �� �� �ִ�.
	public Object select(Object obj) throws Exception;	// ��� type casting�� �Ź� ����� �Ѵ�.
	public ArrayList<Object> select() throws Exception;
}