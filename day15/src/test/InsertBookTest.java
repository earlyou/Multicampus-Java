package test;

import dao.BookDao;
import frame.Dao;
import vo.BookVo;

public class InsertBookTest {

	public static void main(String[] args) {
		Dao<Integer, BookVo> dao = new BookDao();
		BookVo book1 = new BookVo("�Ž¿�", "�Ž¿�");
		
		try {
			dao.insert(book1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
}