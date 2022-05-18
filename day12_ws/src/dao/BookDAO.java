package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import frame.DAO;
import vo.BookVO;

public class BookDAO implements DAO<String, BookVO> {
	
	HashMap<String, BookVO> map;
	//Constructor
	public BookDAO() {
		map = new HashMap<String, BookVO>();
	}

	@Override
	public void insert(BookVO v) throws Exception {
		if(map.containsKey(v.getIsbn())) {
			throw new Exception("�ߺ��� ISDN�� �ֽ��ϴ�.");
		}
		map.put(v.getIsbn(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		if(!map.containsKey(k)) {
			throw new Exception("ISDN�� ã�� �� �����ϴ�. å ������ Ȯ�����ּ���.");
		}
		map.remove(k);
	}

	
	@Override
	public void update(String k, String k1, String k2) throws Exception {
		if(!map.containsKey(k)) {
			throw new Exception("å ������ ã�� �� �����ϴ�.");
		}
		BookVO b = null;
		b = map.get(k);
		b.setName(k1);
		b.setAuthor(k2);
	}

	@Override
	public Object select(String k) throws Exception {
		BookVO b = null;
		if(!map.containsKey(k)) {
			throw new Exception("å ������ ã�� �� �����ϴ�.");
		}
		b = map.get(k);
		return b;
	}

	@Override
	public List<BookVO> select() throws Exception {
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		if(map.size() == 0) {
			throw new Exception("å ������ �����ϴ�.");
		}
		
		Collection<BookVO> col = map.values();
		Iterator<BookVO> it = col.iterator();
		
		while(it.hasNext()) {
			BookVO b = it.next();
			list.add(b);
		}
		
		return list;
	}

	@Override
	public void update(String k, String k1) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
