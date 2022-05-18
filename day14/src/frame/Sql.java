package frame;

public class Sql {	// SQL 문만 정의하는 Class
	public static String insertCust = "INSERT INTO CUST VALUES(?,?,?)";		// static: 객체 생성 없이 바로 함수 사용 가능
	public static String deleteCust = "DELETE FROM CUST WHERE id=?";
	public static String updateCust = "UPDATE CUST SET pwd=?, name=? WHERE id=?";
	public static String selectCust = "SELECT * FROM CUST WHERE id=?";
	public static String selectAllCust = "SELECT * FROM CUST";
	
	public static String insertItem = "INSERT INTO ITEM VALUES(?,?,?)";
	public static String deletetItem = "DELETE FROM ITEM WHERE id=?";
	public static String updateItem = "UPDATE ITEM SET name=?, price=? WHERE id=?";
	public static String selectItem = "SELECT * FROM ITEM WHERE id=?";
	public static String selectAllItem = "SELECT * FROM ITEM";
	
	public static String insertProduct = "INSERT INTO PRODUCT VALUES(NULL,?,?,SYSDATE(),?)";	// ?된것만 입력, 나머지는 자동 생성
	public static String deleteProduct = "DELETE FROM PRODUCT WHERE id=?";
	public static String updateProduct = "UPDATE PRODUCT SET name=?, price=?, rate=? WHERE id=?";
	public static String selectProduct = "SELECT * FROM PRODUCT WHERE id=?";
	public static String selectAllProduct = "SELECT * FROM PRODUCT";
}
