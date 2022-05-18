package test;

import dao.ProductDao;
import frame.Dao;
import vo.ProductVo;

public class DeleteProduct {

	public static void main(String[] args) {
		Dao<Integer, ProductVo> dao = new ProductDao();
		try {
			dao.delete(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
