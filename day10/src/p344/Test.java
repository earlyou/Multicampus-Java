package p344;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// Collection API
//		CustomerVO cs[] = new CustomerVO[5];
		
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>(); // new ArrayList<CustomerVO>()에서 CustomerVO는 없어도됨
		list.add(new CustomerVO("id01","pwd01","James1"));	// 리스트에 객체 넣기
		list.add(new CustomerVO("id02","pwd02","James2"));
		list.add(new CustomerVO("id03","pwd04","James3"));
		
		for (CustomerVO c : list) {		// list에서 CustomerVO객체가 하나씩 튀어나온다.
			System.out.println(c);		// list 정보가 하나씩 출력된다.
		}
		
	}

}
