package cust;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectCust2 {

	public static void main(String[] args) {
		// JDBC(Java Database Connectivity) Program with MySQL
		
		// Connect���� ���� ����
		Connection con = null;			// DB ����
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM CUST";	// ��ҹ��� ���� ����, ���α׷� �ȿ����� �����ݷ�x
		
		// MySQL JDBC Driver Loading
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// DB������ ���� ""Ŭ������ �� ���̴�.
			System.out.println("MySQL JDBC Driver Loading ...");	// �׽�Ʈ�� ���� ����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();			// ������ �� ã�� �� ������ Exception �߰�
		}
		
		// MySQL Connect		// jdbc:mysql://ip:port/schema?Timezone
		String url = "jdbc:mysql://192.168.35.140:3306/shopdb?serverTimezone=Asia/Seoul";	
		String mid = "admin1";	// ip�� 127.0.0.1���ϸ� root�� ������ ���������� 192.168.35.140�� �����ϸ�
		String mpwd = "111111";	// �ܺο��� ������ ������ �ν��ϰ� ���� ������ root�� �����ϴ� ���� �����Ѵ�.
		try {					// ���� MySQL���� ���ο� ����(admin1)�� ����� �����ؾ� �Ѵ�.
			con = DriverManager.getConnection(url,mid,mpwd);	// ������ ���� �õ�
			System.out.println("MySQL Server Connected ...");
		} catch (SQLException e) {
			e.printStackTrace();		// �������� ������ ���� ������ �ȵ� �� Exception
		}
		
		// SQL�� �̿��� ��û
		try {
			ps = con.prepareStatement(sql);

			// ��û ����� Ȯ��
			rs = ps.executeQuery();	// �Է��� ���� �ݿ��Ѵ�.
			
			while(rs.next()) {		// Ʃ���� ���� ������ ������
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				System.out.println(id+" "+pwd+" "+name);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {		// ������������ ������ ���� ���� ������ ���� ���� finally ���, �ſ� �߿� ���� ����
			// MySQL Close
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(ps != null) {
				try {
					ps.close();		// ps�� ������ ������� �Ѵ�.
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();	// con ���� ����, �ſ� �߿�
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
