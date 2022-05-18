package ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class OracleDAO implements DAO, Search {
	
	HashMap<String, BookVO> map;	// ���� ����µ� String Ÿ������ CustomerVO�� �����??
	
	// Constructor
	public OracleDAO() {
		map = new HashMap<String, BookVO>();
	}

	
	// Method
	@Override
	public void insert(BookVO b) {
		String key = b.getISBN();
		map.put(key, b);
	}

	@Override
	public void delete(String isbn) {
		map.remove(isbn);
	}
	
	@Override
	public BookVO update(String isbn, String bname, String aname) {
		BookVO b = null;
		b = map.get(isbn);
		b.setBname(bname);
		b.setAname(aname);
		return b;
	}

	@Override
	public BookVO select(String isbn) {
		BookVO b = null;
		b = map.get(isbn);
		return b;
	}

	@Override
	public ArrayList<BookVO> select() {
		Collection<BookVO> col = map.values();
		Iterator<BookVO> it = col.iterator();
		
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		while(it.hasNext()) {		// ������ ������ 5���� �ݺ��Ѵ�.
			BookVO cust = it.next();
			list.add(cust);
		}
		return list;
	}


	@Override
	public ArrayList<BookVO> search(String bname) {
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		
		Collection<BookVO> col = map.values();
		Iterator<BookVO> it = col.iterator();
		
		while(it.hasNext()) {
			BookVO b = it.next();
			if(b.getBname().equals(bname)) {
				list.add(b);
			}
		}
		return list;
	}

}
