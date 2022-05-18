package test;

import dao.RentDao;
import frame.Dao;
import vo.RentVo;

public class DeleteRentTest {

	public static void main(String[] args) {
		Dao<Integer, RentVo> dao = new RentDao();
		
		try {
			dao.delete(3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
