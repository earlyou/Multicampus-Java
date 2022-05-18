package app;

import java.util.List;
import java.util.Scanner;

import dao.BookDAO;
import dao.MemberDAO;
import frame.DAO;
import vo.BookVO;
import vo.MemberVO;

public class LibraryApp {

	public static void main(String[] args) {
		System.out.println("도서관 프로그램을 시작합니다.");
		BookDAO book = new BookDAO();
		MemberDAO member = new MemberDAO();
		DAO<String, BookVO> daob = book;
		DAO<String, MemberVO> daom = member;
		Scanner sc = new Scanner(System.in);
		int a = 0;
		
		out:
		while(true) {	
			while(a == 0) {
				System.out.println("\n이용하실 서비스를 입력해주세요.\nBook / Member / quit");
				String cmd = sc.next();
				if(cmd.equals("quit")) {
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					break;
				}else if(cmd.equals("Book")) {
					a = 1;
				}else if(cmd.equals("Member")) {
					a = 2;
				}
			}
			
			while(a == 1) {		// book 선택
				System.out.println("\n이용하실 서비스를 입력해주세요.(Book)\n"
						+ "(insert, delete, update, select, all, back, quit)");
				String cmd = sc.next();
				
				if(cmd.equals("insert")) {
					System.out.println("새로운 ISBN을 입력해주세요.");
					String isbn = sc.next();
					System.out.println("새로운 책 이름을 입력해주세요.");
					String bname = sc.next();
					System.out.println("책의 저자를 입력해주세요.");
					String aname = sc.next();
					
					BookVO b = new BookVO(isbn, bname, aname);
					try {
						daob.insert(b);
						System.out.println("책 정보가 추가됐습니다.\n"+b);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("delete")) {
					System.out.println("삭제할 책의 ISBN을 입력하세요.");
					String isbn = sc.next();
					try {
						System.out.println("책 정보를 삭제합니다.\n"+daob.select(isbn));
						daob.delete(isbn);
					}catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("update")) {
					System.out.println("수정할 책의 ISBN을 입력해주세요.");
					String isbn = sc.next();
					System.out.println("책의 이름을 수정해주세요.");
					String bname = sc.next();
					System.out.println("책의 저자를 수정해주세요.");
					String aname = sc.next();
					try {
						daob.update(isbn, bname, aname);
						System.out.println("책 정보가 수정되었습니다.\n"+daob.select(isbn));
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("select")) {
					System.out.println("조회하고 싶은 책의 ISDN을 입력해주세요.");
					String isbn = sc.next();
					try {
						System.out.println(daob.select(isbn));
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("all")) {
					System.out.println("모든 책 리스트를 출력합니다.\n");
					try {
						List<BookVO> list = daob.select();
						for (BookVO b : list) {
							System.out.println(b);
						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("back")) {
					System.out.println("이전으로 돌아갑니다.");
					a = 0;
				}else if(cmd.equals("quit")) {
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					break out;
				}
			}
			
			while(a == 2) {		// Member 선택
				System.out.println("\n이용하실 서비스를 입력해주세요.(Member)\n"
						+ "(insert, delete, update, select, all, back, quit)");
				String cmd = sc.next();
				
				if(cmd.equals("insert")) {
					System.out.println("생성하실 회원 ID를 입력해주세요.");
					String id = sc.next();
					System.out.println("회원님 성명을 입력해주세요.");
					String name = sc.next();
					
					MemberVO m = new MemberVO(id, name);
					try {
						daom.insert(m);
						System.out.println("회원님 정보가 추가됐습니다.\n"+m);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("delete")) {
					System.out.println("삭제할 회원님의 ID를 입력하세요.");
					String id = sc.next();
					try {
						System.out.println("회원님의 정보를 삭제합니다.\n"+daom.select(id));
						daom.delete(id);
					}catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("update")) {
					System.out.println("수정할 회원님의 ID를 입력해주세요.");
					String id = sc.next();
					System.out.println("회원님의 성함을 수정해주세요.");
					String name = sc.next();
					try {
						daom.update(id, name);
						System.out.println("책 정보가 수정되었습니다.\n"+daom.select(id));
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("select")) {
					System.out.println("조회하고 회원님의 ID를 입력해주세요.");
					String id = sc.next();
					try {
						System.out.println(daom.select(id));
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("all")) {
					System.out.println("모든 회원 리스트를 출력합니다.\n");
					try {
						List<MemberVO> list = daom.select();
						for (MemberVO m : list) {
							System.out.println(m);
						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("back")) {
					System.out.println("이전으로 돌아갑니다.");
					a = 0;
				}else if(cmd.equals("quit")) {
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					break out;
				}
			}
		}
	}
}
