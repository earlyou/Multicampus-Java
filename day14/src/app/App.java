package app;

import java.util.List;
import java.util.Scanner;

import dao.CustDao;
import frame.Dao;
import vo.CustVo;

public class App {

	public static void main(String[] args) {
		Dao<String, CustVo> dao = new CustDao();
		
		System.out.println("Start ...");
		Scanner sc = new Scanner(System.in);
		
		while(true) {								
			System.out.println("Input cmd(i, s, l, q) ...");
			String cmd = sc.next();// insert, select all, login, quit
			
			if(cmd.equals("q")) {		// quit
				System.out.println("Bye");
				break;
			}else if(cmd.equals("i")) {	// insert
				System.out.println("Input Customer Info ..");
				String id = sc.next();
				String pwd = sc.next();
				String name = sc.next();
				CustVo c = new CustVo(id, pwd, name);
				try {
					dao.insert(c);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
			}else if(cmd.equals("s")) {	// select
				System.out.println("Select All Customer Info ..");
				List<CustVo> list = null;
				try {
					list = dao.select();
					for (CustVo c : list) {
						System.out.println(c);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}else if(cmd.equals("l")) {	// login
				System.out.println("Input id and pwd ..");
				String id = sc.next();
				String pwd = sc.next();
				CustVo c = null;
				try {
					c = dao.select(id);	// id가 있는지 없는지 부터 확인하는 작업
					if(c.getPwd().equals(pwd)) {
						System.out.println("Login OK");
					}else {				// 비번 틀렸을 때 Exception
						throw new Exception();
					}
				} catch (Exception e) {
					System.out.println("Login Fail...");	// 입력한 id가 없을 때 Exception발생
				}
			}
		}
		sc.close();
		System.out.println("End ...");
	}
}