package test;

import dao.BookDao;
import frame.Dao;
import vo.BookVo;

public class SelectBookTest {

	public static void main(String[] args) {
		Dao<Integer, BookVo> dao = new BookDao();
		BookVo book = null;
		
		try {
			book = dao.select(999);
			System.out.println(book);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
