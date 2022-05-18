package test;

import dao.BookDAO;
import dao.MemberDAO;
import frame.DAO;
import vo.BookVO;
import vo.MemberVO;

public class DeleteTest {

	public static void main(String[] args) {
		DAO<String, BookVO> dao = new BookDAO();
		BookVO b = new BookVO("1234", "Cosmos", "Carl Sagan");
		
		try{
			dao.insert(b);
			System.out.println("1");
			dao.delete("1234");
			System.out.println("2");
//			dao.delete("1111");
//			System.out.println("3");
			dao.delete("1234");
			System.out.println("4");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		DAO<String, MemberVO> dao1 = new MemberDAO();
		MemberVO m = new MemberVO("1355", "½Å½Â¿í");
		
		try {
			dao1.insert(m);
			System.out.println("1'");
			dao1.delete("1355");
			System.out.println("2'");
//			dao.delete("1355");
//			System.out.println("3'");
			dao1.delete("1111");
			System.out.println("4'");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
