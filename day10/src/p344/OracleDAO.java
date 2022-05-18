package p344;

import java.util.ArrayList;

public class OracleDAO {
	
	public void connect() {
		System.out.println("Oracle Server Connected .......");
	}
	public void close() {
		System.out.println("Oracle Server Closed .......");
	}
	
	public void insert(CustomerVO c) {	// VO�� �����ͺ��̽��� �Է��ϴ� ����
		connect();
		System.out.println(c);
		System.out.println("Inserted ...");// ���� DB�� �ȹ���� ������ �̷��� ǥ��
		close();
	}
	public void delete(String id) {		// ����
		connect();
		System.out.println(id);
		System.out.println("Deleted ...");
		close();
	}
	public CustomerVO select(String id) {		// App�� ����� ������ ��û�ϸ� Oracle���� ������ �����ͼ� CustomerVO�� ���� App�� �ִ� ���
		connect();
		String pwd = "pwd01";
		String name = "James";
		CustomerVO c = new CustomerVO(id, pwd, name);
		close();
		return c;
	}
	public ArrayList<CustomerVO> select(){	// ��� Customer ������ �����Ͷ�, Overloading
		connect();
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>(); // new ArrayList<CustomerVO>()���� CustomerVO�� �����
		list.add(new CustomerVO("id01","pwd01","James1"));	// ����Ʈ�� ��ü �ֱ�
		list.add(new CustomerVO("id02","pwd02","James2"));
		list.add(new CustomerVO("id03","pwd04","James3"));
		close();
		return list;
	}
}
