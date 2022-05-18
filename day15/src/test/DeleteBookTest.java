package test;

import dao.BookDao;
import frame.Dao;
import vo.BookVo;

public class DeleteBookTest {

	public static void main(String[] args) {
		Dao<Integer, BookVo> dao = new BookDao();
		
		try {
			dao.delete(3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
