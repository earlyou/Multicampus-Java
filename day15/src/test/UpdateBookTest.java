package test;

import dao.BookDao;
import frame.Dao;
import vo.BookVo;

public class UpdateBookTest {

	public static void main(String[] args) {
		Dao<Integer, BookVo> dao = new BookDao();
		BookVo book = new BookVo(3, "½Å", "½Â", false);
		
		try {
			dao.update(book);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
