package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import frame.Dao;
import frame.Sql;
import vo.MemberVo;

public class MemberDao extends Dao<String, MemberVo> {

	@Override
	public void insert(MemberVo v) throws Exception {		// ȸ�� ���� �Է�
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.insertMember);
			ps.setString(1, v.getId());
			ps.setString(2, v.getPwd());
			ps.setString(3, v.getName());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("����� �Է� ����");
		}finally {
			close(ps);
			close(con);
		}
	}

	@Override
	public void update(MemberVo v) throws Exception {		// ȸ������ ����
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.updateMember);
			ps.setString(1, v.getPwd());
			ps.setString(2, v.getName());
			ps.setString(3, v.getId());
			int result = ps.executeUpdate();
			if (result != 1) {
				throw new Exception("������ ȸ�� ������ �����ϴ�.");
			}
		} catch (Exception e) {
			throw e;
		}finally {
			close(con);
			close(ps);
		}
	}

	@Override
	public void delete(String k) throws Exception {			// ȸ������ ����
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.deleteMember);
			ps.setString(1, k);
			int result = ps.executeUpdate();
			if (result != 1) {
				throw new Exception("������ ȸ�� ������ �����ϴ�.");
			}
		} catch (Exception e) {
			throw e;
		}finally {
			close(con);
			close(ps);
		}
	}

	@Override
	public MemberVo select(String k) throws Exception {			// ȸ������ ��ȸ
		MemberVo member = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectMember);
			ps.setString(1, k);
			rs = ps.executeQuery();
			rs.next();
			String id = rs.getString("id");
			String pwd = rs.getString("pwd");
			String name = rs.getString("name");
			member = new MemberVo(id, pwd, name);
		} catch (Exception e) {
			throw new Exception("ȸ�� ������ �����ϴ�.");
		}finally {
			close(rs);
			close(ps);
			close(con);
		}
		return member;
	}

	@Override
	public List<MemberVo> select() throws Exception {		// ȸ������ ��ü ��ȸ
		List<MemberVo> list = new ArrayList<MemberVo>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectAllMember);
			rs = ps.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				MemberVo member = new MemberVo(id, pwd, name);
				list.add(member);
			}
			if(list.size() == 0) {
				throw new Exception("ȸ�� ������ �����ϴ�.");
			}
		} catch (Exception e) {
			throw e;
		}finally {
			close(rs);
			close(ps);
			close(con);
		}
		return list;
	}

}
