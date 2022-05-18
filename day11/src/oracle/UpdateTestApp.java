package oracle;

public class UpdateTestApp {

	public static void main(String[] args) {
		DAO dao = new CustomerDAO();
		
		CustomerVO c1 = new CustomerVO("id01", "pwd01", "James");
		
		try {
			dao.insert(c1);
		} catch (DuplicatedIDException e) {
			System.out.println("ม฿บน ID");
		}
		
//		dao.update(c1);
	}

}
