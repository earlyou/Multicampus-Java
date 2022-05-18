package test;

import dao.MemberDao;
import frame.Dao;
import vo.MemberVo;

public class InsertMemberTest {

	public static void main(String[] args) {
		Dao<String, MemberVo> dao = new MemberDao();
		MemberVo mem1 = new MemberVo("id01", "pwd01", "½Å½Â¿í");
		
		try {
			dao.insert(mem1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}