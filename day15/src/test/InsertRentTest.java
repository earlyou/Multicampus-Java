package test;

import dao.RentDao;
import frame.Dao;
import vo.RentVo;

public class InsertRentTest {

	public static void main(String[] args) {
		Dao<Integer, RentVo> dao = new RentDao();
		RentVo rent = new RentVo(123, "id01");
		try {
			dao.insert(rent);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
