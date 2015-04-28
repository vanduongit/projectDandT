package com.dtweb.services.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dtweb.dao.ProductDao;
import com.dtweb.model.Product;
import com.dtweb.services.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
 
}
