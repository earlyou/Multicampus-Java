package test;

import dao.BookDAO;
import dao.MemberDAO;
import frame.DAO;
import vo.BookVO;
import vo.MemberVO;

public class UpdateTest {

	public static void main(String[] args) {
		DAO<String, BookVO> dao = new BookDAO();
		BookVO b = new BookVO("1111", "Ensaio sobre a Cegueira", "Jose");
		
		try {
			dao.insert(b);
			dao.update("1111", "Ensaio sobre a Cegueira", "Jose Saramago");
			System.out.println(b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		DAO<String, MemberVO> dao1 = new MemberDAO();
		MemberVO m = new MemberVO("9999", "½Å½Â¿í");
		
		try {
			dao1.insert(m);
			dao1.update("9999", "Pig");
			System.out.println(m);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
