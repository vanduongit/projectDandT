package com.dtweb.services;

import java.util.List;

import com.dtweb.dto.ProductDTO;
import com.dtweb.model.Menu;
import com.dtweb.model.Product;

public interface ProductService {
	List<Product> getAllProduct();
	
	List<ProductDTO> getAllProductDTO();
	
	Product getProductById(int id);
	
	Product likeProduct(int id,Menu m);
}
