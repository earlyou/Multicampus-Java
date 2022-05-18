package test;

import dao.RentDao;
import frame.Dao;
import vo.RentVo;

public class SelectRentTest {

	public static void main(String[] args) {
		Dao<Integer, RentVo> dao = new RentDao();
		RentVo rent = null;
		
		try {
			rent = dao.select(134);
			System.out.println(rent);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
