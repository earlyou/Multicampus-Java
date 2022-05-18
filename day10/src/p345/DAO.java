package p345;

import java.util.ArrayList;

public interface DAO {					// interface는 원래 기능만 정의하는 껍데기이다.
//	static final int a = 1000;			// 딱 정해져있는 변수만 선언 가능
	
	
	
	public default void connect() {		// 최근에는 interface안에 함수도 만들 수 있도록 바뀌었다.
		System.out.println("Connect .....");
	}
	public default void close() {		// 여기서 default는 일반 함수라는 뜻이다. private, public default 아님
		System.out.println("Close .....");
	}
	
	public void insert(CustomerVO c);	// 사실 추상 메소드와 같다, abstract만 빠져있을 뿐
	public void delete(String id);
	public CustomerVO select(String id);
	public ArrayList<CustomerVO> select();
}
