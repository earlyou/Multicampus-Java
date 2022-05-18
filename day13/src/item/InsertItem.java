package item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertItem {

	public static void main(String[] args) {
		// JDBC(Java Database Connectivity) Program with MySQL
		
		// Connect위한 변수 선언
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO ITEM VALUES(?,?,?)";	// id,name,price
		
		// MySQL JDBC Driver Loading
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL JDBC Driver Loading ...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// MySQL Connect
		String url = "jdbc:mysql://192.168.35.140:3306/shopdb?serverTimezone=Asia/Seoul";
		String mid = "admin1";
		String mpwd = "111111";
		try {
			con = DriverManager.getConnection(url,mid,mpwd);
			System.out.println("MySQL Server Connected ...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// SQL을 이용한 요청
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, 0005);
			ps.setString(2, "Beer");
			ps.setFloat(3, 2500);
			// 요청 결과 확인
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// MySQL Close
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
