package test;

import dao.BookDAO;
import dao.MemberDAO;
import frame.DAO;
import vo.BookVO;
import vo.MemberVO;

public class InsertTest {

	public static void main(String[] args) {
		DAO<String, BookVO> dao = new BookDAO();
		BookVO b = new BookVO("1234", "Elegant Universe", "Brian Greene");
		
		try {
			dao.insert(b);
			System.out.println("1");
			dao.insert(b);
			System.out.println("2");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(b);
		
		DAO<String, MemberVO> dao1 = new MemberDAO();
		MemberVO m = new MemberVO("5678", "½Å½Â¿í");
		
		try {
			dao1.insert(m);
			System.out.println("1'");
			dao1.insert(m);
			System.out.println("2'");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(m);
	}

}
