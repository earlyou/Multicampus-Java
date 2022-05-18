package ws;

import java.util.ArrayList;

public interface DAO {
	public void insert(BookVO b) throws DuplicatedIDException;
	public void delete(String isdn) throws NotFoundException;
	public BookVO update(String isdn, String bname, String aname) throws NotFoundException;
	public BookVO select(String bname) throws NotFoundException;
	public ArrayList<BookVO> select() throws NotFoundException;
}
