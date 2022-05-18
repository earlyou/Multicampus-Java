package p345;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Start ...");
		DAO dao = new OracleDAO();		// ȭ���� ������ ���� �������̽��� �������� �����Ѵ�.
										// MariadbDAO, OracleDAO�� �ٲ㰡�鼭 ���� �����ϵ� �ڵ� ����
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Input cmd(i, d, s, a, q) ..."); // insert, delete, select, select all, quit
			String cmd = sc.next();
			
			if(cmd.equals("q")) {			// q�� ������ �ݺ��� ����
				System.out.println("Bye");
				break;
			}else if(cmd.equals("i")) {			// Customer ������ DB�� �ְڴ�
				System.out.println("Input Customer info ..");
				System.out.println("Input Customer id: ");
				String id = sc.next();
				System.out.println("Input Customer pwd: ");
				String pwd = sc.next();
				System.out.println("Input Customer name: ");
				String name = sc.next();
				
				CustomerVO c = new CustomerVO(id, pwd, name);
				dao.insert(c);
			}else if(cmd.equals("d")) {
				System.out.println("Input Customer id: ");
				String id = sc.next();
				dao.delete(id);
			}else if(cmd.equals("s")) {
				System.out.println("Input Customer id: ");
				String id = sc.next();
				CustomerVO c = dao.select(id);
				System.out.println(c);
			}else if(cmd.equals("a")) {
				ArrayList<CustomerVO> list = dao.select();
				for (CustomerVO c : list) {
					System.out.println(c);
				}
			}
		}
		sc.close();
		System.out.println("End ...");
	}

}
