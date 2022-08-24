package ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class OracleDAO implements DAO, Search {
	
	HashMap<String, BookVO> map;
	
	// Constructor
	public OracleDAO() {
		map = new HashMap<String, BookVO>();
	}

	@Override
	public ArrayList<BookVO> search(String bname) throws NotFoundException {
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		if(map.size() == 0) {
			throw new NotFoundException("å ������ �����ϴ�.\n");
		}
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

	@Override
	public void insert(BookVO b) throws DuplicatedIDException {
		String key = b.getIsdn();
		if(map.containsKey(key)) {
			throw new DuplicatedIDException("�ߺ��� ID�� �ֽ��ϴ�.\n");
		}
		map.put(key, b);
	}

	@Override
	public void delete(String isdn) throws NotFoundException {
		if(!map.containsKey(isdn)) {
			throw new NotFoundException("å�� ã�� �� �����ϴ�.\n");
		}
		map.remove(isdn);
	}

	@Override
	public BookVO update(String isdn, String bname, String aname) throws NotFoundException {
		BookVO b = map.get(isdn);
		if(!map.containsKey(isdn)) {
			throw new NotFoundException("å�� ã�� �� �����ϴ�.\n");
		}
		b.setBname(bname);
		b.setAname(aname);
		return b;
	}

	@Override
	public BookVO select(String bname) throws NotFoundException {
		BookVO b = null;
		if(!map.containsKey(bname)) {
			throw new NotFoundException("å�� ã�� �� �����ϴ�.");
		}
		b = map.get(bname);
		return b;
	}

	@Override
	public ArrayList<BookVO> select() throws NotFoundException {
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		
		if(map.size() == 0) {
			throw new NotFoundException("å�� ã�� �� �����ϴ�.");
		}
		
		Collection<BookVO> col = map.values();
		Iterator<BookVO> it = col.iterator();
		
		while(it.hasNext()) {
			BookVO book = it.next();
			list.add(book);
		}
		
		return list;
	}

}
