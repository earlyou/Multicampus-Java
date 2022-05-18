package oracle;

import java.util.ArrayList;

public class CustomerDAO implements DAO {

	@Override
	public void insert(Object obj) throws Exception {	// 최상위 객체인 obj에 CustomerVO 객체 들어가기 가능
		connect();
		CustomerVO c = (CustomerVO)obj;
		System.out.println(c);
		System.out.println("Inserted ...");
		close();
	}

	@Override
	public void delete(Object obj) throws Exception {	// id를 입력하면 삭제
		connect();
		String id = (String)obj;
		System.out.println(id);
		System.out.println("Deleted ...");
		close();
	}

	@Override
	public void update(Object obj) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Object select(Object obj) throws Exception {
		connect();
		String id = (String)obj;
		CustomerVO c = new CustomerVO(id,"pwd01","lee");		
		close();
		return c;
	}

	@Override
	public ArrayList<Object> select() throws Exception {
		connect();
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(new CustomerVO("id01", "pwd01", "lee"));
		list.add(new CustomerVO("id02", "pwd02", "kim"));
		list.add(new CustomerVO("id03", "pwd03", "koo"));
		close();
		return list;
	}

}
