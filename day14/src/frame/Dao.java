package frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
					// 제네릭 사용: Key, Value Object
public abstract class Dao<K,V> {		// CRUD를 위해 공통적으로 필요한 것들을 정의함
	// Field
	// MySQL Connect		// jdbc:mysql://ip:port/schema?Timezone
	String url = "jdbc:mysql://192.168.35.140:3306/shopdb?serverTimezone=Asia/Seoul";	
	String mid = "admin1";	// ip를 127.0.0.1로하면 root로 접속이 가능하지만 192.168.35.140로 접속하면
	String mpwd = "111111";	// 외부에서 접속한 것으로 인식하고 보안 문제로 root로 접속하는 것을 차단한다.
	
	// Constructor
	public Dao() {
		// MySQL JDBC Driver Loading
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// DB연동을 위해 ""클래스를 쓸 것이다.
			System.out.println("MySQL JDBC Driver Loading ...");	// 테스트를 위한 라인
		} catch (ClassNotFoundException e) {
			e.printStackTrace();			// 파일을 못 찾을 수 있으니 Exception 추가
		}
	}
	
	// Method
	public Connection getConnection() throws SQLException {	// 여기서 try catch를 해버리면 
		Connection con = null;								// App 사용자는 왜 오류 발생했는지 모름
		con = DriverManager.getConnection(url,mid,mpwd);	// 서버에 접속 시도
		return con;
	}
	public void close(Connection con) {				// Overloading
		if(con != null) {
			try {
				con.close();	// con 연결 끊기, 매우 중요
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void close(PreparedStatement ps) {
		if(ps != null) {
			try {
				ps.close();		// ps도 연결을 끊어줘야 한다.
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
	public abstract V select(K k) throws Exception;		// V를 리턴
	public abstract List<V> select() throws Exception;	// V 리스트 리턴
}
