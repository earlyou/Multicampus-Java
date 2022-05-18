package test;

import dao.CustDao;
import frame.Dao;
import vo.CustVo;

public class InsertCust {

	public static void main(String[] args) {
		Dao<String, CustVo> dao = new CustDao();		// <?,CustVo>는 없어도 무관함
		
		CustVo cust = new CustVo("id77", "pwd77", "이말숙");
		try {
			dao.insert(cust);
		} catch (Exception e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
	}
}