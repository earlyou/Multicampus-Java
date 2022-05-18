package p346;

public class TestApp {

	public static void main(String[] args) {
		OracleDAO oracleDao = new OracleDAO();
		
		DAO dao = oracleDao;		// DAO 테스트
		
		CustomerVO c = new CustomerVO("id01", "pwd01", "lee");
		dao.insert(c);	// insert 테스트
		
		CustomerVO sc = dao.select("id01");
		System.out.println(sc);
	}

}
