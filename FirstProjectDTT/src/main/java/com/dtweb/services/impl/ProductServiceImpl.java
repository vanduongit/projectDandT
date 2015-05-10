package com.dtweb.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;









import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dtweb.dao.MenuDao;
import com.dtweb.dao.ProductDao;
import com.dtweb.dto.ProductDTO;
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
		return productDao.findAll();
	}

	
	


	public Product getProductById(int id) {
		Product p=productDao.findById(id);
		return p;
	}


	public Product likeProduct(int id,Menu m) {
		Product p=productDao.findById(id);
		int like=p.getAmountLike();
		p.setAmountLike(5);
		productDao.update(p);
		Menu menu=menuDao.findById(1);
		menu.setName("Duong dai ca");
		
		return p;
	}





	public List<ProductDTO> getAllProductDTO() {
		// call to DAO to get all products from table Products.
		List<Product> productsList = productDao.findAll();

		// convert all products to ProductDTO to use in UI.
		List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
		for (Product p : productsList) {
			ProductDTO productDTO = new ProductDTO();
			productDTO.setId(p.getId());
			productDTO.setDescription(p.getDescription());
			productDTO.setTinyImage(p.getTinyImage());
			productDTO.setName(p.getName());
			productDTO.setPrice(p.getPrice());

			if (p.getPromo() != null) {
				Date todayDate = new Date();			

				// check conditions: promotion of product is active
				// AND today must between startDate and EndDate of promote program.
				 if(p.getPromo().getActive() == 1 && todayDate.after(p.getPromo().getStartDate())
						&& todayDate.before(p.getPromo().getEndDate())) {
					float promotePrice = 0;
					if (p.getPromo().getDiscountPercent() > 0) {
						promotePrice = p.getPrice()
								- (p.getPrice() * (p.getPromo().getDiscountPercent()/100));
					} else if (p.getPromo().getDiscountValue() > 0) {
						promotePrice = p.getPrice()
								- p.getPromo().getDiscountValue();
					}					
					productDTO.setPromotePrice(promotePrice);
				}				
			}
			productDTOList.add(productDTO);

		}

		return productDTOList;
	}

}

