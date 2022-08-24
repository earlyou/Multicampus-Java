package ws;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		System.out.println("������ ���α׷��� �����մϴ�.");
		OracleDAO oracledao = new OracleDAO();
		DAO dao = oracledao;
		Search search = oracledao;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n�̿��Ͻ� ���񽺸� �Է����ּ���.\n"
					+ "(insert, delete, update, select, all, search, quit)");
			String cmd = sc.next();
			
			if(cmd.equals("insert")) {
				System.out.println("���ο� ISBN�� �Է����ּ���.");
				String isdn = sc.next();
				System.out.println("���ο� å �̸��� �Է����ּ���.");
				String bname = sc.next();
				System.out.println("å�� ���ڸ� �Է����ּ���.");
				String aname = sc.next();
				
				BookVO b = new BookVO(isdn, bname, aname);
				try {
					dao.insert(b);
				} catch (DuplicatedIDException e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("delete")) {
				System.out.println("������ å�� ISDN�� �Է��ϼ���.");
				String isdn = sc.next();
				try {
					dao.delete(isdn);
				}catch (NotFoundException e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("update")) {
				System.out.println("������ å�� ISDN�� �Է����ּ���.");
				String isdn = sc.next();
				System.out.println("å�� �̸��� �������ּ���.");
				String bname = sc.next();
				System.out.println("å�� ���ڸ� �������ּ���.");
				String aname = sc.next();
				try {
					BookVO b = dao.update(isdn, bname, aname);
					System.out.println("å ������ �����Ǿ����ϴ�.\n"+b);
				} catch (NotFoundException e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("select")) {
				System.out.println("��ȸ�ϰ� ���� å�� ISDN�� �Է����ּ���.");
				String isdn = sc.next();
				try {
					BookVO b = dao.select(isdn);
					System.out.println(b);
				}catch(NotFoundException e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("all")) {
				System.out.println("��� å ����Ʈ�� ����մϴ�.\n");
				try {
					ArrayList<BookVO> list = dao.select();
					for (BookVO b : list) {
						System.out.println(b);
					}
				} catch (NotFoundException e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("search")) {
				System.out.println("ã����� å�� �̸��� �Է����ּ���.");
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
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				break;
			}
		}
		
	}

}
