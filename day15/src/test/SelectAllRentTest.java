package test;

import java.util.List;

import dao.RentDao;
import frame.Dao;
import vo.RentVo;

public class SelectAllRentTest {

	public static void main(String[] args) {
		Dao<Integer, RentVo> dao = new RentDao();
		List<RentVo> list = null;
		
		try {
			list = dao.select();
			for (RentVo rentVo : list) {
				System.out.println(rentVo);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		};
	}

}
