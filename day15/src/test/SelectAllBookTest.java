package test;

import java.util.List;

import dao.BookDao;
import frame.Dao;
import vo.BookVo;

public class SelectAllBookTest {

	public static void main(String[] args) {
		Dao<Integer, BookVo> dao = new BookDao();
		List<BookVo> list = null;
		
		try {
			list = dao.select();
			for (BookVo b : list) {
				System.out.println(b);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
