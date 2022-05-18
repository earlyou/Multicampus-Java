package oracle;

import java.util.ArrayList;

public class CustomerTestApp {

	public static void main(String[] args) {
		DAO dao = new CustomerDAO();

		try {
			CustomerVO c = new CustomerVO("id01","pwd01","lee");
			dao.insert(c);
			
			ArrayList<Object> list = dao.select();
			
			for (Object obj : list) {
				System.out.println(obj);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
