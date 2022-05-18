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
	public void insert(CustomerVO c) throws DuplicatedIDException;	// DuplicatedIDException: id 중복문제
	public void delete(String id) throws NotFoundException;			// NotFoundException: id가 없을 때 문제
	public void update(CustomerVO c) throws NotFoundException;		// NotFoundException
	public CustomerVO select(String id) throws NotFoundException;	// NotFoundException
	public ArrayList<CustomerVO> select() throws NotFoundException;	// NotFoundException
}
