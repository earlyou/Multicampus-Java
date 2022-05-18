package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import frame.Dao;
import frame.Sql;
import vo.ProductVo;

public class ProductDao extends Dao<Integer, ProductVo> {

	@Override
	public void insert(ProductVo v) throws Exception {
		// Connection 
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.insertProduct);
			ps.setString(1, v.getName());		// 첫 번째 ?에 name 넣기
			ps.setInt(2, v.getPrice());			// 두 번째 ?
			ps.setDouble(3, v.getRate());		// 세
			ps.executeUpdate();
		}catch(Exception e) {
			throw e;		// 여기서 try catch로 오류메세지 보여줘봤자 App에서는 보이지 않는다.
		}finally{			// 따라서 여기서는 throw만 하고 App에서 메세지 표시
			close(ps);		// 매우 중요
			close(con);
		}
	}

	@Override
	public void update(ProductVo v) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.updateProduct);
			ps.setString(1, v.getName());
			ps.setInt(2, v.getPrice());
			ps.setDouble(3, v.getRate());
			ps.setInt(4, v.getId());
			ps.executeUpdate();
		}catch(Exception e) {
			throw e;
		}finally {
			close(con);
			close(ps);
		}
	}

	@Override
	public void delete(Integer k) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.deleteProduct);
			ps.setInt(1, k);
			ps.executeUpdate();
		}catch(Exception e) {
			throw e;
		}finally {
			close(ps);
			close(con);
		}
	}

	@Override
	public ProductVo select(Integer k) throws Exception {
		ProductVo p = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectProduct);
			ps.setInt(1, k);
			rs = ps.executeQuery();
			rs.next();
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int price = rs.getInt("price");
			Date regdate = rs.getDate("regdate");
			double rate = rs.getDouble("rate");
			p = new ProductVo(id, name, price, regdate, rate);
		}catch(Exception e) {
			throw e;
		}finally {
			close(rs);
			close(ps);
			close(con);
		}
		return p;
	}

	@Override
	public List<ProductVo> select() throws Exception {
		List<ProductVo> list = new ArrayList<ProductVo>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectAllProduct);
			rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				Date date = rs.getDate("regdate");
				double rate = rs.getDouble("rate");
				ProductVo pro = new ProductVo(id, name, price, date, rate);
				list.add(pro);
			}
		}catch(Exception e) {
			throw e;
		}finally {
			close(rs);
			close(con);
			close(ps);
		}	
		return list;
	}
}
