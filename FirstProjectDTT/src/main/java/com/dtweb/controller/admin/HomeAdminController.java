package com.dtweb.controller.admin;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/administrator")
public class HomeAdminController {
	
	@RequestMapping(value="/")
	public String showHome(ModelMap model){
		Map<String, String> menu=new HashMap<String,String>();
		menu.put("Sản phẩm", "watch.jpg");
		menu.put("Khuyến mãi", "KM.png");
		menu.put("Nhà phân phối", "brand.jpg");
		menu.put("Bình luận", "comment.jpg");
		menu.put("Khách hàng", "customer.jpg");
		menu.put("Đơn hàng", "order.png");
		menu.put("Cấu hình", "config.jpg");
		model.put("MENU_BODY", menu);
		Map<String, String> menuAdvance=new HashMap<String,String>();
		menuAdvance.put("Quản lý admin", "admin.jpg");
		menuAdvance.put("Danh mục", "menu.png");
		menuAdvance.put("Nhóm sản phẩm", "category.png");
		model.put("MENU_ADV_BODY", menuAdvance);
		return "homeAdmin";
	}
	
	@RequestMapping(value="/addProduct")
	public String showAddProduct(ModelMap model){
		return "addProduct";
	}
}
