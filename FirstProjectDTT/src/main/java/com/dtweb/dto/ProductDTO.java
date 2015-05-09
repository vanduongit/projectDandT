package com.dtweb.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.dtweb.model.Brand;
import com.dtweb.model.Category;
import com.dtweb.model.CommentProduct;
import com.dtweb.model.OrderDetail;
import com.dtweb.model.Promotion;

/**
 * @author Thong 
 *
 */
public class ProductDTO {	
	
	private int id;	
	
	private String tag;	
	
	private String name;
	
	private String content;
	
	private String detail;
	
	private int priority;
	
	private int index;
	
	private float price;
	
	private String tinyImage;
	
	private String bigImage;
	
	private Date dateTime;
	
	private Brand brand;
	
	private int brandTag;
	
	private String title;
	
	private String description;
	
	private String keyword;
	
	private int active;
	
	private int ord;
	
	private String lang;
	
	
	private String image1;
	
	private String image2;
	
	private String image3;
	
	private String image4;
	
	private String image5;
	
	private String codePro;
	
	private int amount;
	
	private int amountToBuy;
	
	private int amountLike;
	
	private Date beginDate;
	
	private Date endDate;
	
	private String property1;
	
	private String property2;
	
	private String property3;
	
	private String property4;
	
	private String property5;
	
	private String property6;
	
	private String property7;
	
	private Category category;
	
	private String cateTag;
	
	private String createUser;
	
	private Date createDate;
	
	private Promotion promo;	
	
	private Set<CommentProduct> commentRecords = new HashSet<CommentProduct>(
			0);
	
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(
			0);

}
