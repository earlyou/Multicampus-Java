package test;

import dao.MemberDao;
import frame.Dao;
import vo.MemberVo;

public class SelectMemberTest {

	public static void main(String[] args) {
		Dao<String, MemberVo> dao = new MemberDao();
		MemberVo mem = null;
		
		try {
			mem = dao.select("id01");
			System.out.println(mem);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
