package test;

import java.util.List;

import dao.MemberDao;
import frame.Dao;
import vo.MemberVo;

public class SelectAllMemberTest {
	
	public static void main(String[] args) {
		Dao<String, MemberVo> dao = new MemberDao();
		List<MemberVo> list = null;
		
		try {
			list = dao.select();
			for (MemberVo memberVo : list) {
				System.out.println(memberVo);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
