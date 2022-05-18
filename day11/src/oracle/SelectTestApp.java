package oracle;

public class SelectTestApp {

	public static void main(String[] args) {
		DAO dao = new CustomerDAO();
		
		CustomerVO c1 = new CustomerVO("id01","pwd01","James");
		
		try {
			dao.insert(c1);
		} catch (DuplicatedIDException e) {
			System.out.println("ม฿บน ID");
		}
		
		try {
			CustomerVO c2 = dao.select("id02");
			System.out.println(c2);
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
