package ws;

import java.util.ArrayList;

public interface DAO {					// interface는 원래 기능만 정의하는 껍데기이다.
	
	public void insert(BookVO b);	// 사실 추상 메소드와 같다, abstract만 빠져있을 뿐
	public void delete(String isbn);
	public BookVO update(String isbn, String bname, String aname);
	public BookVO select(String isbn);
	public ArrayList<BookVO> select();
}
