package p346;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class test {

	public static void main(String[] args) {
		// Map, 저장공간과 비슷 - Key, Value를 저장하는 공간, ArrayList는 Value만 저장
		HashMap<String, CustomerVO> map = new HashMap<String, CustomerVO>();
		
		// Insert, 맵에 데이터를 입력한다.
		CustomerVO c1 = new CustomerVO("id101", "pwd01", "James1");
		CustomerVO c2 = new CustomerVO("id102", "pwd02", "James2");
		CustomerVO c3 = new CustomerVO("id103", "pwd03", "James3");
		CustomerVO c4 = new CustomerVO("id104", "pwd04", "James4");
		CustomerVO c5 = new CustomerVO("id105", "pwd05", "James5");
		
		map.put("id01", c1);		// c1객체는 "id01"이름으로 들어간다, key value
		map.put("id02", c2);
		map.put("id03", c3);
		map.put("id04", c4);
		map.put("id05", c5);
		
		// delete 삭제하기
		map.remove("id02");
		
		// update
		CustomerVO cc = new CustomerVO("id03", "ppp03", "jj03");	// id는 키값이기 때문에 변경 불가
		map.put("id03", cc);			// 기존의 id03을 cc로 바꿔라
		
		
		// select, 맵에서 데이터 추출하기
		String id = "id03";		// id가 id03인 놈을 요청하기
		CustomerVO c = map.get(id);
		System.out.println(c);
		
		
		// select all, 데이터 전부 추출
		Collection<CustomerVO> col = map.values();
		Iterator<CustomerVO> it = col.iterator();
		
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();
		while(it.hasNext()) {		// 데이터 개수인 5번을 반복한다.
			CustomerVO cust = it.next();
			list.add(cust);
		}
		
		for (CustomerVO customerVO : list) {
			System.out.println(customerVO);
		}
	}

}
