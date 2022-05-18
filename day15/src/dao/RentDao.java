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
	public void insert(RentVo v) throws Exception {		// �����ϱ�
		Dao<Integer, BookVo> book = new BookDao();
		Dao<String, MemberVo> mem = new MemberDao();
		Connection con = null;
		PreparedStatement ps = null;
		PreparedStatement pp = null;
		if (book.select(v.getIsbn()).isStatus() != true) {
			throw new Exception("�̹� ���� ���� å�Դϴ�.");
		}
		if(mem.select(v.getId()) == null) {
			throw new Exception("ȸ�� ������ �����ϴ�.");
		}
		if(!mem.select(v.getId()).getPwd().equals(v.getPwd())) {
			throw new Exception("��й�ȣ�� Ȯ�����ּ���.");
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
			throw new Exception("�߸��� �Է� �����Դϴ�. �ٽ� �Է����ּ���");
		}finally {
			close(con);
			close(ps);
			close(pp);
		}
	}

	@Override
	public void update(RentVo v) throws Exception {		// �ݳ� �����ϱ�
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.updateRent);
			ps.setInt(1, v.getOrderNum());
			int result = ps.executeUpdate();
			if (result != 1) {
				throw new Exception("������ ���� ������ �����ϴ�.");
			}
		}catch(Exception e) {
			throw e;
		}finally {
			close(con);
			close(ps);
		}
	}


	@Override
	public void delete(Integer k) throws Exception {	// �ݳ��ϱ�
		Connection con = null;
		PreparedStatement ps = null;
		PreparedStatement pp = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.deleteRent);
			pp = con.prepareStatement("UPDATE RENT SET returndate=SYSDATE() WHERE orderNum=?");
			ps.setInt(1, k);		// ���⳯¥�� ���� ��¥�� ���
			pp.setInt(1, k);
			pp.executeUpdate();
			int result = ps.executeUpdate();
			if (result != 1) {
				throw new Exception("������ ���� ������ �����ϴ�.");
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
	public RentVo select(Integer k) throws Exception {		// ��ȸ�ϱ�
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
			throw new Exception("���� ������ �����ϴ�.");
		}finally {
			close(ps);
			close(con);
			close(rs);
		}
		return rent;
	}

	@Override
	public List<RentVo> select() throws Exception {			// ��ü ��ȸ�ϱ� 
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
				throw new Exception("���� ������ �����ϴ�.");
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
