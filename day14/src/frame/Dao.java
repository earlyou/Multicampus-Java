package frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
					// ���׸� ���: Key, Value Object
public abstract class Dao<K,V> {		// CRUD�� ���� ���������� �ʿ��� �͵��� ������
	// Field
	// MySQL Connect		// jdbc:mysql://ip:port/schema?Timezone
	String url = "jdbc:mysql://192.168.35.140:3306/shopdb?serverTimezone=Asia/Seoul";	
	String mid = "admin1";	// ip�� 127.0.0.1���ϸ� root�� ������ ���������� 192.168.35.140�� �����ϸ�
	String mpwd = "111111";	// �ܺο��� ������ ������ �ν��ϰ� ���� ������ root�� �����ϴ� ���� �����Ѵ�.
	
	// Constructor
	public Dao() {
		// MySQL JDBC Driver Loading
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// DB������ ���� ""Ŭ������ �� ���̴�.
			System.out.println("MySQL JDBC Driver Loading ...");	// �׽�Ʈ�� ���� ����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();			// ������ �� ã�� �� ������ Exception �߰�
		}
	}
	
	// Method
	public Connection getConnection() throws SQLException {	// ���⼭ try catch�� �ع����� 
		Connection con = null;								// App ����ڴ� �� ���� �߻��ߴ��� ��
		con = DriverManager.getConnection(url,mid,mpwd);	// ������ ���� �õ�
		return con;
	}
	public void close(Connection con) {				// Overloading
		if(con != null) {
			try {
				con.close();	// con ���� ����, �ſ� �߿�
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void close(PreparedStatement ps) {
		if(ps != null) {
			try {
				ps.close();		// ps�� ������ ������� �Ѵ�.
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void close(ResultSet rset) {
		if(rset != null) {
			try {
				rset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// Abstract Method
	public abstract void insert(V v) throws Exception;
	public abstract void update(V v) throws Exception;
	public abstract void delete(K k) throws Exception;
	public abstract V select(K k) throws Exception;		// V�� ����
	public abstract List<V> select() throws Exception;	// V ����Ʈ ����
}
