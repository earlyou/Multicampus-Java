package test;

import java.util.List;

import dao.CustDao;
import frame.Dao;
import vo.CustVo;

public class SelectAllCust {

	public static void main(String[] args) {
		Dao<String, CustVo> dao = new CustDao();
		List<CustVo> list = null;
		try {
			list = dao.select();
			for (CustVo custVo : list) {
				System.out.println(custVo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
