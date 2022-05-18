package frame;

public class Sql {
	// book(isbn INT, name VARCHAR(30), author VARCHAR(20), status TINYINT)
	public static String insertBook = "INSERT INTO BOOK VALUES(NULL,?,?,TRUE)";
	public static String deleteBook = "DELETE FROM BOOK WHERE isbn=?";
	public static String updateBook = "UPDATE BOOK SET name=?, author=? WHERE isbn=?";
	public static String selectBook = "SELECT * FROM BOOK WHERE isbn=?";
	public static String selectAllBook = "SELECT * FROM BOOK";
	
	// mem(id VARCHAR(30), pwd VARCHAR(20), name VARCHAR(20))
	public static String insertMember = "INSERT INTO MEM VALUES(?,?,?)";
	public static String deleteMember = "DELETE FROM MEM WHERE id=?";
	public static String updateMember = "UPDATE MEM SET pwd=?, name=? WHERE id=?";
	public static String selectMember = "SELECT * FROM MEM WHERE id=?";
	public static String selectAllMember = "SELECT * FROM MEM";
	
	// rent(orderNum INT, isbn INT, id VARCHAR(30), rentdate DATE, returndate DATE)
	public static String insertRent = "INSERT INTO RENT VALUES(NULL,?,?,SYSDATE(),DATE_ADD(SYSDATE(), INTERVAL 7 DAY))";
	public static String deleteRent = "UPDATE BOOK SET status=true WHERE isbn = (SELECT isbn FROM RENT WHERE orderNum=?)";
	public static String updateRent = "UPDATE RENT SET returndate=date_add(returndate,Interval 4 DAY) WHERE orderNum=?";
	public static String selectRent = "SELECT * FROM RENT WHERE isbn=?";
	public static String selectAllRent = "SELECT * FROM RENT";
}