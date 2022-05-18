package p345;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Start ...");
		DAO dao = new OracleDAO();		// 화면을 개발할 때는 인터페이스를 기준으로 개발한다.
										// MariadbDAO, OracleDAO를 바꿔가면서 레고 조립하듯 코딩 가능
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Input cmd(i, d, s, a, q) ..."); // insert, delete, select, select all, quit
			String cmd = sc.next();
			
			if(cmd.equals("q")) {			// q를 누르면 반복문 종료
				System.out.println("Bye");
				break;
			}else if(cmd.equals("i")) {			// Customer 정보를 DB에 넣겠다
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
