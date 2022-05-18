package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import frame.DAO;
import vo.MemberVO;

public class MemberDAO implements DAO<String, MemberVO> {
	
	HashMap<String, MemberVO> map;
	// Constructor
	public MemberDAO() {
		map = new HashMap<String, MemberVO>();
	}

	@Override
	public void insert(MemberVO v) throws Exception {
		if(map.containsKey(v.getId())) {
			throw new Exception("중복된 ID가 있습니다.");
		}
		map.put(v.getId(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		if(!map.containsKey(k)) {
			throw new Exception("없는 회원 정보입니다. ID를 확인해주세요.");
		}
		map.remove(k);
	}

	@Override
	public void update(String k, String k1) throws Exception {
		if(!map.containsKey(k)) {
			throw new Exception("책 정보를 찾을 수 없습니다.");
		}
		MemberVO m = null;
		m = map.get(k);
		m.setName(k1);
	}

	@Override
	public Object select(String k) throws Exception {
		MemberVO m = null;
		if(!map.containsKey(k)) {
			throw new Exception("회원 정보가 없습니다. ID를 확인해주세요.");
		}
		m = map.get(k);
		return m;
	}

	@Override
	public List<MemberVO> select() throws Exception {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		if(map.size() == 0) {
			throw new Exception("회원 정보가 없습니다.");
		}
		
		Collection<MemberVO> col = map.values();
		Iterator<MemberVO> it = col.iterator();
		
		while(it.hasNext()) {
			MemberVO mem = it.next();
			list.add(mem);
		}
		return list;
	}

	@Override
	public void update(String k, String k1, String k2) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
