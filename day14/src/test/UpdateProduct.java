package test;

import dao.ProductDao;
import frame.Dao;
import vo.ProductVo;

public class UpdateProduct {

	public static void main(String[] args) {
		Dao<Integer, ProductVo> dao = new ProductDao();
		
		ProductVo pro = new ProductVo(6, "Coffee", 7000, 8);
		
		try {
			dao.update(pro);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
