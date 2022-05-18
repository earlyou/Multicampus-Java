package oracle;

import java.util.ArrayList;

public interface DAO {
	public default void connect() {
		System.out.println("Connect .....");
	}
	public default void close() {		
		System.out.println("Close .....");
	}
	
	// CRUD
	public void insert(Object obj) throws Exception;	// 그냥 Exception 쓴다. 나중에 머리털빠져요.
	public void delete(Object obj) throws Exception;	// Object는 최상위 클래스이기 때문에		
	public void update(Object obj) throws Exception;	// 어떤 VO도 들어갈 수 있다.
	public Object select(Object obj) throws Exception;	// 대신 type casting을 매번 해줘야 한다.
	public ArrayList<Object> select() throws Exception;
}