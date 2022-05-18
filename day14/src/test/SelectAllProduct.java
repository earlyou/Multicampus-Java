package test;

import java.util.List;

import dao.ProductDao;
import frame.Dao;
import vo.ProductVo;

public class SelectAllProduct {

	public static void main(String[] args) {
		Dao<Integer, ProductVo> dao = new ProductDao();
		List<ProductVo> list = null;
		try {
			list = dao.select();
			for (ProductVo productVo : list) {
				System.out.println(productVo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
