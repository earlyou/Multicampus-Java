package p344;

import java.util.ArrayList;

public class OracleDAO {
	
	public void connect() {
		System.out.println("Oracle Server Connected .......");
	}
	public void close() {
		System.out.println("Oracle Server Closed .......");
	}
	
	public void insert(CustomerVO c) {	// VO를 데이터베이스에 입력하는 역할
		connect();
		System.out.println(c);
		System.out.println("Inserted ...");// 아직 DB를 안배웠기 때문에 이렇게 표현
		close();
	}
	public void delete(String id) {		// 삭제
		connect();
		System.out.println(id);
		System.out.println("Deleted ...");
		close();
	}
	public CustomerVO select(String id) {		// App이 사용자 정보를 요청하면 Oracle에서 정보를 가져와서 CustomerVO를 만들어서 App에 주는 기능
		connect();
		String pwd = "pwd01";
		String name = "James";
		CustomerVO c = new CustomerVO(id, pwd, name);
		close();
		return c;
	}
	public ArrayList<CustomerVO> select(){	// 모든 Customer 정보를 가져와라, Overloading
		connect();
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>(); // new ArrayList<CustomerVO>()에서 CustomerVO는 없어도됨
		list.add(new CustomerVO("id01","pwd01","James1"));	// 리스트에 객체 넣기
		list.add(new CustomerVO("id02","pwd02","James2"));
		list.add(new CustomerVO("id03","pwd04","James3"));
		close();
		return list;
	}
}
