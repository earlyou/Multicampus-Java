package p346;

public class TestApp {

	public static void main(String[] args) {
		OracleDAO oracleDao = new OracleDAO();
		
		DAO dao = oracleDao;		// DAO �׽�Ʈ
		
		CustomerVO c = new CustomerVO("id01", "pwd01", "lee");
		dao.insert(c);	// insert �׽�Ʈ
		
		CustomerVO sc = dao.select("id01");
		System.out.println(sc);
	}

}
