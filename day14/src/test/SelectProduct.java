package test;

import dao.ProductDao;
import frame.Dao;
import vo.ProductVo;

public class SelectProduct {

	public static void main(String[] args) {
		Dao<Integer, ProductVo> dao = new ProductDao();
		
		ProductVo p = null;
		try {
			p = dao.select(1);
			System.out.println(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
