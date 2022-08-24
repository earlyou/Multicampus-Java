package ws;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		System.out.println("도서관 프로그램을 시작합니다.");
		OracleDAO oracledao = new OracleDAO();
		DAO dao = oracledao;
		Search search = oracledao;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n이용하실 서비스를 입력해주세요.\n"
					+ "(insert, delete, update, select, all, search, quit)");
			String cmd = sc.next();
			
			if(cmd.equals("insert")) {
				System.out.println("새로운 ISBN을 입력해주세요.");
				String isdn = sc.next();
				System.out.println("새로운 책 이름을 입력해주세요.");
				String bname = sc.next();
				System.out.println("책의 저자를 입력해주세요.");
				String aname = sc.next();
				
				BookVO b = new BookVO(isdn, bname, aname);
				try {
					dao.insert(b);
				} catch (DuplicatedIDException e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("delete")) {
				System.out.println("삭제할 책의 ISDN을 입력하세요.");
				String isdn = sc.next();
				try {
					dao.delete(isdn);
				}catch (NotFoundException e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("update")) {
				System.out.println("수정할 책의 ISDN을 입력해주세요.");
				String isdn = sc.next();
				System.out.println("책의 이름을 수정해주세요.");
				String bname = sc.next();
				System.out.println("책의 저자를 수정해주세요.");
				String aname = sc.next();
				try {
					BookVO b = dao.update(isdn, bname, aname);
					System.out.println("책 정보가 수정되었습니다.\n"+b);
				} catch (NotFoundException e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("select")) {
				System.out.println("조회하고 싶은 책의 ISDN을 입력해주세요.");
				String isdn = sc.next();
				try {
					BookVO b = dao.select(isdn);
					System.out.println(b);
				}catch(NotFoundException e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("all")) {
				System.out.println("모든 책 리스트를 출력합니다.\n");
				try {
					ArrayList<BookVO> list = dao.select();
					for (BookVO b : list) {
						System.out.println(b);
					}
				} catch (NotFoundException e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("search")) {
				System.out.println("찾고싶은 책의 이름을 입력해주세요.");
				String bname = sc.next();
				try {
					ArrayList<BookVO> list = search.search(bname);
					for (BookVO b : list) {
						System.out.println(b);
					}
				} catch (NotFoundException e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("quit")) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			}
		}
		
	}

}
