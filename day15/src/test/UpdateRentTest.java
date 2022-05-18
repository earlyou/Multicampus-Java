package test;

import dao.RentDao;
import frame.Dao;
import vo.RentVo;

public class UpdateRentTest {

	public static void main(String[] args) {
		Dao<Integer, RentVo> dao = new RentDao();
		RentVo rent = new RentVo(3);
		
		try {
			dao.update(rent);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
