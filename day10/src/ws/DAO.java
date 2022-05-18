package ws;

import java.util.ArrayList;

public interface DAO {					// interface�� ���� ��ɸ� �����ϴ� �������̴�.
	
	public void insert(BookVO b);	// ��� �߻� �޼ҵ�� ����, abstract�� �������� ��
	public void delete(String isbn);
	public BookVO update(String isbn, String bname, String aname);
	public BookVO select(String isbn);
	public ArrayList<BookVO> select();
}
