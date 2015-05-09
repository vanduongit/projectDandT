package com.dtweb.services.impl;

import java.util.List;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dtweb.dao.MenuDao;
import com.dtweb.dao.ProductDao;
import com.dtweb.model.Menu;
import com.dtweb.model.Product;
import com.dtweb.services.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	
	@Autowired 
	MenuDao menuDao;
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

	
	


	public Product getProductById(int id) {
		Product p=productDao.findById(id);
		return p;
	}


	public Product likeProduct(int id,Menu m) {
		Product p=productDao.findById(id);
//		int like=p.getAmountLike();
//		p.setAmountLike(5);
//		productDao.update(p);
		Menu menu=menuDao.findById(1);
		menu.setName("Duong dai ca");
		
		return p;
	}
 
}
