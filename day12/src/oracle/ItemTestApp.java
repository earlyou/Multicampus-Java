package oracle;

public class ItemTestApp {

	public static void main(String[] args) {
		DAO dao = new ItemDAO();
	
		try {
			ItemVO item = new ItemVO(100, "Pants", 10000.0);
			dao.insert(item);
			
			dao.delete(100);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
