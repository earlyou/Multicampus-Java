package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import frame.Dao;
import frame.Sql;
import vo.BookVo;

public class BookDao extends Dao<Integer, BookVo> {

	@Override
	public void insert(BookVo v) throws Exception {		// 책 정보 삽입
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.insertBook);
			ps.setString(1, v.getName());
			ps.setString(2, v.getAuthor());
			ps.executeUpdate();
		}catch(Exception e) {
			throw new Exception("잘못된 입력 정보입니다. 다시 입력해주세요");
		}finally {
			close(ps);
			close(con);
		}
		
	}

	@Override
	public void update(BookVo v) throws Exception {		// 책 정보 수정
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.updateBook);
			ps.setString(1, v.getName());
			ps.setString(2, v.getAuthor());
			ps.setInt(3, v.getIsbn());
			int result = ps.executeUpdate();
			if (result != 1) {
				throw new Exception("수정할 책의 정보가 없습니다.");
			}
		}catch(Exception e) {
			throw e;
		}finally {
			close(ps);
			close(con);
		}
	}

	@Override
	public void delete(Integer k) throws Exception {	// 책 정보 삭제
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.deleteBook);
			ps.setInt(1, k);
			int result = ps.executeUpdate();
			if (result != 1) {
				throw new Exception("삭제할 책 정보가 없습니다.");
			}
		}catch(Exception e) {
			throw e;
		}finally {
			close(con);
			close(ps);
		}
	}

	@Override
	public BookVo select(Integer k) throws Exception {		// 책 정보 조회
		BookVo book = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectBook);
			ps.setInt(1, k);
			rs = ps.executeQuery();
			rs.next();
			int isbn = rs.getInt("isbn");
			String name = rs.getString("name");
			String author = rs.getString("author");
			boolean status = rs.getBoolean("status");
			book = new BookVo(isbn, name, author, status);
		} catch (Exception e) {
			throw new Exception("책 정보가 없습니다.");
		}finally {
			close(ps);
			close(con);
			close(rs);
		}
		return book;
	}

	@Override
	public List<BookVo> select() throws Exception {		// 책 정보 전체 조회
		List<BookVo> list = new ArrayList<BookVo>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectAllBook);
			rs = ps.executeQuery();
			while(rs.next()) {
				int isbn = rs.getInt("isbn");
				String name = rs.getString("name");
				String author = rs.getString("author");
				boolean status = rs.getBoolean("status");
				BookVo book = new BookVo(isbn, name, author, status);
				list.add(book);
			}
			if(list.size() == 0) {
				throw new Exception("책 정보가 없습니다.");
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
