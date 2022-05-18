package test;

import java.util.List;

import dao.BookDAO;
import dao.MemberDAO;
import frame.DAO;
import vo.BookVO;
import vo.MemberVO;

public class SelectAllTest {

	public static void main(String[] args) {
		List<BookVO> list = null;
		DAO<String, BookVO> dao = new BookDAO();
		try {
			System.out.println(list);
			list = dao.select();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		BookVO b = new BookVO("1234", "Death by Black Hole", "Neil deGrasse Tyson");
		BookVO b1 = new BookVO("1357", "What is Real?", "Adam Becker");
		BookVO b2 = new BookVO("1111", "Relativity", "Albert Eistein");
		try {
			dao.insert(b);	   dao.insert(b1);		dao.insert(b2);
			list = dao.select();
			System.out.println(list);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		List<MemberVO> list1 = null;
		DAO<String, MemberVO> dao1 = new MemberDAO();
		try {
			System.out.println(list1);
			list1 = dao1.select();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		MemberVO m = new MemberVO("111", "신승욱");
		MemberVO m1 = new MemberVO("222", "루밍");
		MemberVO m2 = new MemberVO("333", "유자");
		try {
			dao1.insert(m);	   dao1.insert(m1);		dao1.insert(m2);
			list1 = dao1.select();
			System.out.println(list1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
