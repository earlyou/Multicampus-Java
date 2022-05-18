package ws;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Start ...");
		OracleDAO oracledao = new OracleDAO();
		DAO dao = oracledao;		// ȭ���� ������ ���� �������̽��� �������� �����Ѵ�.
										// MariadbDAO, OracleDAO�� �ٲ㰡�鼭 ���� �����ϵ� �ڵ� ����
		Search search = oracledao;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Input cmd(i, d, u, s, a, c, q) ..."); 
			String cmd = sc.next();	// insert, delete, update, select, select all, search, quit
			
			if(cmd.equals("q")) {			// q�� ������ �ݺ��� ����
				System.out.println("Bye");
				break;
			}else if(cmd.equals("i")) {			// Customer ������ DB�� �ְڴ�
				System.out.println("Input Book info ..");
				System.out.println("Input Book ISDN: ");
				String isdn = sc.next();
				System.out.println("Input Bood name: ");
				String bname = sc.next();
				System.out.println("Input Book author: ");
				String aname = sc.next();
				
				BookVO b = new BookVO(isdn, bname, aname);
				dao.insert(b);
			}else if(cmd.equals("d")) {
				System.out.println("Input Book ISDN: ");
				String isdn = sc.next();
				dao.delete(isdn);
			}else if(cmd.equals("c")) {
				System.out.println("Input Book name: ");
				String bname = sc.next();
				ArrayList<BookVO> list = search.search(bname);
				for (BookVO b : list) {
					System.out.println(b);
				}
			}else if(cmd.equals("s")) {
				System.out.println("Input Book ISDN: ");
				String isdn = sc.next();
				BookVO b = dao.select(isdn);
				System.out.println(b);
			}else if(cmd.equals("a")) {
				ArrayList<BookVO> list = dao.select();
				for (BookVO b : list) {
					System.out.println(b);
				}
			}else if(cmd.equals("u")) {
				System.out.println("Input Book ISDN: ");
				String isdn = sc.next();
				System.out.println("Input Book name: ");
				String bname = sc.next();
				System.out.println("Input Book author: ");
				String aname = sc.next();
				try {
					BookVO b = dao.update(isdn, bname, aname);
					System.out.println(b);
				}catch(Exception e) {
					System.out.println("å ������ �����ϴ�. ��Ȯ�� ISDN�� �Է����ּ���\n");
				}
				
			}
		}
		sc.close();
		System.out.println("End ...");
	}
}
