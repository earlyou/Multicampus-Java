package test;

import dao.BookDAO;
import dao.MemberDAO;
import frame.DAO;
import vo.BookVO;
import vo.MemberVO;

public class SelectTest {

	public static void main(String[] args) {
		DAO<String, BookVO> dao = new BookDAO();
		BookVO b = new BookVO("1234", "Harry Potter", "Joanne Kathleen Rowling");
		
		try {
			dao.insert(b);
			System.out.println(dao.select("1234"));
			System.out.println(dao.select("4567"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		DAO<String, MemberVO> dao1 = new MemberDAO();
		MemberVO m = new MemberVO("3432", "½Å½Â¿í");
		
		try {
			dao1.insert(m);
			System.out.println(dao1.select("3432"));
			System.out.println(dao1.select("4567"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
