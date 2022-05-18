package test;

import dao.CustDao;
import frame.Dao;
import vo.CustVo;

public class SelectCust {

	public static void main(String[] args) {
		Dao<String,CustVo> dao = new CustDao();
		CustVo cust = null;
		try {
			cust = dao.select("id45");		// 제네릭<>을 썻기 때문에 type casting이 필요 없다
			System.out.println(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
