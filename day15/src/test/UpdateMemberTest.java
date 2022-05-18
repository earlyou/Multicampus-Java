package test;

import dao.MemberDao;
import frame.Dao;
import vo.MemberVo;

public class UpdateMemberTest {

	public static void main(String[] args) {
		Dao<String, MemberVo> dao = new MemberDao();
		MemberVo mem = new MemberVo("id01", "pwd11", "À¯ÀÚ");
		
		try {
			dao.update(mem);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}