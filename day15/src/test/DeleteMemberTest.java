package test;

import dao.MemberDao;
import frame.Dao;
import vo.MemberVo;

public class DeleteMemberTest {

	public static void main(String[] args) {
		Dao<String, MemberVo> dao = new MemberDao();
		
		try {
			dao.delete("1");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
