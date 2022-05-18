package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import frame.Dao;
import frame.Sql;
import vo.BookVo;
import vo.MemberVo;
import vo.RentVo;

public class RentDao extends Dao<Integer, RentVo> {

	@Override
	public void insert(RentVo v) throws Exception {		// 대출하기
		Dao<Integer, BookVo> book = new BookDao();
		Dao<String, MemberVo> mem = new MemberDao();
		Connection con = null;
		PreparedStatement ps = null;
		PreparedStatement pp = null;
		if (book.select(v.getIsbn()).isStatus() != true) {
			throw new Exception("이미 대출 중인 책입니다.");
		}
		if(mem.select(v.getId()) == null) {
			throw new Exception("회원 정보가 없습니다.");
		}
		if(!mem.select(v.getId()).getPwd().equals(v.getPwd())) {
			throw new Exception("비밀번호를 확인해주세요.");
		}
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.insertRent);
			ps.setInt(1, v.getIsbn());
			ps.setString(2, v.getId());
			pp = con.prepareStatement("UPDATE BOOK SET status=false WHERE isbn=?");
			pp.setInt(1, v.getIsbn());
			ps.executeUpdate();
			pp.executeUpdate();
		} catch (Exception e) {
			throw new Exception("잘못된 입력 정보입니다. 다시 입력해주세요");
		}finally {
			close(con);
			close(ps);
			close(pp);
		}
	}

	@Override
	public void update(RentVo v) throws Exception {		// 반납 연장하기
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.updateRent);
			ps.setInt(1, v.getOrderNum());
			int result = ps.executeUpdate();
			if (result != 1) {
				throw new Exception("수정할 대출 정보가 없습니다.");
			}
		}catch(Exception e) {
			throw e;
		}finally {
			close(con);
			close(ps);
		}
	}


	@Override
	public void delete(Integer k) throws Exception {	// 반납하기
		Connection con = null;
		PreparedStatement ps = null;
		PreparedStatement pp = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.deleteRent);
			pp = con.prepareStatement("UPDATE RENT SET returndate=SYSDATE() WHERE orderNum=?");
			ps.setInt(1, k);		// 대출날짜에 오늘 날짜로 기록
			pp.setInt(1, k);
			pp.executeUpdate();
			int result = ps.executeUpdate();
			if (result != 1) {
				throw new Exception("삭제할 대출 정보가 없습니다.");
			}
		} catch (Exception e) {
			throw e;
		}finally {
			close(con);
			close(ps);
			close(pp);
		}
	}

	@Override
	public RentVo select(Integer k) throws Exception {		// 조회하기
		RentVo rent = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectRent);
			ps.setInt(1, k);
			rs = ps.executeQuery();
			rs.next();
			int orderNum = rs.getInt("orderNum");
			int isbn = rs.getInt("isbn");
			String id = rs.getString("id");
			Date rentdate = rs.getDate("rentdate");
			Date returndate = rs.getDate("returndate");
			rent = new RentVo(orderNum, isbn, id, rentdate, returndate);
		} catch (Exception e) {
			throw new Exception("대출 정보가 없습니다.");
		}finally {
			close(ps);
			close(con);
			close(rs);
		}
		return rent;
	}

	@Override
	public List<RentVo> select() throws Exception {			// 전체 조회하기 
		List<RentVo> list = new ArrayList<RentVo>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectAllRent);
			rs = ps.executeQuery();
			while (rs.next()) {
				int orderNum = rs.getInt("orderNum");
				int isbn = rs.getInt("isbn");
				String id = rs.getString("id");
				Date rentdate = rs.getDate("rentdate");
				Date returndate = rs.getDate("returndate");
				RentVo rent = new RentVo(orderNum, isbn, id, rentdate, returndate);
				list.add(rent);
			}
			if(list.size() == 0) {
				throw new Exception("대출 정보가 없습니다.");
			}
		} catch (Exception e) {
			throw e;
		}finally {
			close(ps);
			close(con);
			close(rs);
		}
		return list;
	}
	
}
