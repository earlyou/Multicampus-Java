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
		System.out.println("������ ���α׷��� �����մϴ�.");
		BookDAO book = new BookDAO();
		MemberDAO member = new MemberDAO();
		DAO<String, BookVO> daob = book;
		DAO<String, MemberVO> daom = member;
		Scanner sc = new Scanner(System.in);
		int a = 0;
		
		out:
		while(true) {	
			while(a == 0) {
				System.out.println("\n�̿��Ͻ� ���񽺸� �Է����ּ���.\nBook / Member / quit");
				String cmd = sc.next();
				if(cmd.equals("quit")) {
					System.out.println("���α׷��� �����մϴ�.");
					sc.close();
					break;
				}else if(cmd.equals("Book")) {
					a = 1;
				}else if(cmd.equals("Member")) {
					a = 2;
				}
			}
			
			while(a == 1) {		// book ����
				System.out.println("\n�̿��Ͻ� ���񽺸� �Է����ּ���.(Book)\n"
						+ "(insert, delete, update, select, all, back, quit)");
				String cmd = sc.next();
				
				if(cmd.equals("insert")) {
					System.out.println("���ο� ISBN�� �Է����ּ���.");
					String isbn = sc.next();
					System.out.println("���ο� å �̸��� �Է����ּ���.");
					String bname = sc.next();
					System.out.println("å�� ���ڸ� �Է����ּ���.");
					String aname = sc.next();
					
					BookVO b = new BookVO(isbn, bname, aname);
					try {
						daob.insert(b);
						System.out.println("å ������ �߰��ƽ��ϴ�.\n"+b);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("delete")) {
					System.out.println("������ å�� ISBN�� �Է��ϼ���.");
					String isbn = sc.next();
					try {
						System.out.println("å ������ �����մϴ�.\n"+daob.select(isbn));
						daob.delete(isbn);
					}catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("update")) {
					System.out.println("������ å�� ISBN�� �Է����ּ���.");
					String isbn = sc.next();
					System.out.println("å�� �̸��� �������ּ���.");
					String bname = sc.next();
					System.out.println("å�� ���ڸ� �������ּ���.");
					String aname = sc.next();
					try {
						daob.update(isbn, bname, aname);
						System.out.println("å ������ �����Ǿ����ϴ�.\n"+daob.select(isbn));
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("select")) {
					System.out.println("��ȸ�ϰ� ���� å�� ISDN�� �Է����ּ���.");
					String isbn = sc.next();
					try {
						System.out.println(daob.select(isbn));
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("all")) {
					System.out.println("��� å ����Ʈ�� ����մϴ�.\n");
					try {
						List<BookVO> list = daob.select();
						for (BookVO b : list) {
							System.out.println(b);
						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("back")) {
					System.out.println("�������� ���ư��ϴ�.");
					a = 0;
				}else if(cmd.equals("quit")) {
					System.out.println("���α׷��� �����մϴ�.");
					sc.close();
					break out;
				}
			}
			
			while(a == 2) {		// Member ����
				System.out.println("\n�̿��Ͻ� ���񽺸� �Է����ּ���.(Member)\n"
						+ "(insert, delete, update, select, all, back, quit)");
				String cmd = sc.next();
				
				if(cmd.equals("insert")) {
					System.out.println("�����Ͻ� ȸ�� ID�� �Է����ּ���.");
					String id = sc.next();
					System.out.println("ȸ���� ������ �Է����ּ���.");
					String name = sc.next();
					
					MemberVO m = new MemberVO(id, name);
					try {
						daom.insert(m);
						System.out.println("ȸ���� ������ �߰��ƽ��ϴ�.\n"+m);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("delete")) {
					System.out.println("������ ȸ������ ID�� �Է��ϼ���.");
					String id = sc.next();
					try {
						System.out.println("ȸ������ ������ �����մϴ�.\n"+daom.select(id));
						daom.delete(id);
					}catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("update")) {
					System.out.println("������ ȸ������ ID�� �Է����ּ���.");
					String id = sc.next();
					System.out.println("ȸ������ ������ �������ּ���.");
					String name = sc.next();
					try {
						daom.update(id, name);
						System.out.println("å ������ �����Ǿ����ϴ�.\n"+daom.select(id));
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("select")) {
					System.out.println("��ȸ�ϰ� ȸ������ ID�� �Է����ּ���.");
					String id = sc.next();
					try {
						System.out.println(daom.select(id));
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("all")) {
					System.out.println("��� ȸ�� ����Ʈ�� ����մϴ�.\n");
					try {
						List<MemberVO> list = daom.select();
						for (MemberVO m : list) {
							System.out.println(m);
						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else if(cmd.equals("back")) {
					System.out.println("�������� ���ư��ϴ�.");
					a = 0;
				}else if(cmd.equals("quit")) {
					System.out.println("���α׷��� �����մϴ�.");
					sc.close();
					break out;
				}
			}
		}
	}
}
