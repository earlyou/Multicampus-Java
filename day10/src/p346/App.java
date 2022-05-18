package p346;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Start ...");
		OracleDAO oracleDao = new OracleDAO();		// map저장공간이 각각 생기는걸 방지하기 위해 하나의 객체만 생성함
		// CRUD
		DAO dao = oracleDao;		// 화면을 개발할 때는 인터페이스를 기준으로 개발한다.
										// MariadbDAO, OracleDAO를 바꿔가면서 레고 조립하듯 코딩 가능
		// Search
		Search search = oracleDao;// Search인터페이스를 기반으로 OracleDAO를 탑재한다.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Input cmd(i, d, u, s, a, c, q) ..."); 
			String cmd = sc.next();	// insert, delete, update, select, select all, search, quit
			
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
			}else if(cmd.equals("c")) {
				System.out.println("Input Customer name: ");
				String name = sc.next();
				ArrayList<CustomerVO> list = search.search(name);
				for (CustomerVO c : list) {
					System.out.println(c);
				}
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
			}else if(cmd.equals("u")) {
				System.out.println("Input Customer id: ");
				String id = sc.next();
				System.out.println("Input Customer pwd: ");
				String pwd = sc.next();
				System.out.println("Input Customer name: ");
				String name = sc.next();
				
				CustomerVO c = new CustomerVO(id, pwd, name);
				dao.update(c);
			}
		}
		sc.close();
		System.out.println("End ...");
	}

}
