package cust;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteCust {

	public static void main(String[] args) {
		// JDBC(Java Database Connectivity) Program with MySQL
		
		// Connect위한 변수 선언
		Connection con = null;			// DB 접속
		PreparedStatement ps = null;
		String sql = "DELETE FROM CUST WHERE id=?";	// 대소문자 구분 주의, 프로그램 안에서는 세미콜론x
		
		// MySQL JDBC Driver Loading
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// DB연동을 위해 ""클래스를 쓸 것이다.
			System.out.println("MySQL JDBC Driver Loading ...");	// 테스트를 위한 라인
		} catch (ClassNotFoundException e) {
			e.printStackTrace();			// 파일을 못 찾을 수 있으니 Exception 추가
		}
		
		// MySQL Connect		// jdbc:mysql://ip:port/schema?Timezone
		String url = "jdbc:mysql://192.168.35.140:3306/shopdb?serverTimezone=Asia/Seoul";	
		String mid = "admin1";	// ip를 127.0.0.1로하면 root로 접속이 가능하지만 192.168.35.140로 접속하면
		String mpwd = "111111";	// 외부에서 접속한 것으로 인식하고 보안 문제로 root로 접속하는 것을 차단한다.
		try {					// 따라서 MySQL에서 새로운 계정(admin1)을 만들고 접속해야 한다.
			con = DriverManager.getConnection(url,mid,mpwd);	// 서버에 접속 시도
			System.out.println("MySQL Server Connected ...");
		} catch (SQLException e) {
			e.printStackTrace();		// 서버문제 등으로 인해 접속이 안될 때 Exception
		}
		
		// SQL을 이용한 요청
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, "id05");	// 첫 번째 ?에 넣기
			// 요청 결과를 확인
			int result = ps.executeUpdate();	// 입력한 값을 반영한다.
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {		// 비정상적으로 오류가 났을 때도 연결을 끊기 위해 finally 사용, 매우 중요 시험 출제
			// MySQL Close
			if(ps != null) {
				try {
					ps.close();		// ps도 연결을 끊어줘야 한다.
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();	// con 연결 끊기, 매우 중요
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
