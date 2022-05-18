package oracle;

import java.util.ArrayList;

public class ItemDAO implements DAO {

	@Override
	public void insert(Object obj) throws Exception {
		connect();
		ItemVO item = (ItemVO)obj;		
		System.out.println(item);
		System.out.println("Inserted ....");
		close();
	}

	@Override
	public void delete(Object obj) throws Exception {
		connect();
		Integer ii = (Integer)obj;
		int id = ii.intValue();
		System.out.println(id+"값이 삭제 되었습니다.");
		close();
	}

	@Override
	public void update(Object obj) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Object select(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Object> select() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
