<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">		
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
<link href='http://fonts.googleapis.com/css?family=Bree+Serif' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Philosopher' rel='stylesheet' type='text/css'>
		
<link rel="stylesheet" href="/css/font-awesome.min.css"/>
	
<link rel="stylesheet" href="/css/style.css" />
<script src="/js/modernizr-2.6.2.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/HomePage.css">
</head>
<body>
	<!-- Page Content -->
	<div class="container">

		<!-- Title -->
		<div class="row">
			<div class="col-lg-12">
				<h3>Sản Phẩm Mới</h3>
			</div>
		</div>

		<!-- Page Features -->
		<div class="row text-center">
			<!-- list of the best feature products. -->
			<c:if test="${not empty listProduct}">				
					<c:forEach var="p" items="${listProduct}">
					<c:choose>
						<c:when test="${p.promotePrice > 0}">
							<div class="col-md-3 col-sm-6 hero-feature">
								<div class="thumbnail">
									<a href="product/detail/${p.id}"><img
										src="resources/img/ProductImages/${p.tinyImage}" alt=""></a>
									<div class="caption">
										<h3>${p.name}</h3>										
										<p>	Giá: <strike>${p.price} VND</strike></p>
										<div class="promoteprice"><p>Giá KM: ${p.promotePrice} VND</p></div>										
										<p>
											<a href="#" class="btn btn-primary">Buy Now!</a> <a href="#"
												class="btn btn-default">More Info</a>
										</p>
									</div>
								</div>
							</div>
						</c:when>

						<c:otherwise>
						<div class="col-md-3 col-sm-6 hero-feature">
								<div class="thumbnail">
									<a href="product/detail/${p.id}"><img
										src="resources/img/ProductImages/${p.tinyImage}" alt=""></a>
									<div class="caption"">
										<h3>${p.name}</h3>																		
										<div class="promoteprice"><p>Giá: ${p.price} VND</p></div>
										<p style="visibility: collapse;">hidden</p>																									
										<p>
											<a href="#" class="btn btn-primary">Buy Now!</a> <a href="#"
												class="btn btn-default">More Info</a>
										</p>
									</div>
								</div>
							</div>
						</c:otherwise>
					</c:choose>		
					</c:forEach>				
			</c:if>
		</div>

		<!-- Title -->
		<div class="row">
			<div class="col-lg-12">
				<h3>Sản Phẩm Bán Chạy</h3>
			</div>
		</div>

		<!-- Page Features -->
		<div class="row text-center">
			<!-- list of the best feature products. -->
			<c:if test="${not empty listProduct}">				
					<c:forEach var="p" items="${listProduct}">
					<c:choose>
						<c:when test="${p.promotePrice > 0}">
							<div class="col-md-3 col-sm-6 hero-feature">
								<div class="thumbnail">
									<a href="product/detail/${p.id}"><img
										src="resources/img/ProductImages/${p.tinyImage}" alt=""></a>
									<div class="caption">
										<h3>${p.name}</h3>										
										<p>	Giá: <strike>${p.price}</strike></p>
										<p>Giá KM: ${p.promotePrice}</p>										
										<p>
											<a href="#" class="btn btn-primary">Buy Now!</a> <a href="#"
												class="btn btn-default">More Info</a>
										</p>
									</div>
								</div>
							</div>
						</c:when>

						<c:otherwise>
						<div class="col-md-3 col-sm-6 hero-feature">
								<div class="thumbnail">
									<a href="product/detail/${p.id}"><img
										src="resources/img/ProductImages/${p.tinyImage}" alt=""></a>
									<div class="caption"">
										<h3>${p.name}</h3>																		
										<p>Giá: ${p.price}</p>
										<p style="visibility: collapse;">hidden</p>																									
										<p>
											<a href="#" class="btn btn-primary">Buy Now!</a> <a href="#"
												class="btn btn-default">More Info</a>
										</p>
									</div>
								</div>
							</div>
						</c:otherwise>
					</c:choose>		
					</c:forEach>				
			</c:if>
		</div>
		<!-- Title -->
		<div class="row">
			<div class="col-lg-12">
				<h3>Sản Phẩm Khuyến Mãi</h3>
			</div>
		</div>

		<div class="row text-center">
			<!-- list of the best feature products. -->
			<c:if test="${not empty listProduct}">				
					<c:forEach var="p" items="${listProduct}">
					<c:choose>
						<c:when test="${p.promotePrice > 0}">
							<div class="col-md-3 col-sm-6 hero-feature">
								<div class="thumbnail">
									<a href="product/detail/${p.id}"><img
										src="resources/img/ProductImages/${p.tinyImage}" alt=""></a>
									<div class="caption">
										<h3>${p.name}</h3>										
										<p>	Giá: <strike>${p.price}</strike></p>
										<p>Giá KM: ${p.promotePrice}</p>										
										<p>
											<a href="#" class="btn btn-primary">Buy Now!</a> <a href="#"
												class="btn btn-default">More Info</a>
										</p>
									</div>
								</div>
							</div>
						</c:when>

						<c:otherwise>
						<div class="col-md-3 col-sm-6 hero-feature">
								<div class="thumbnail">
									<a href="product/detail/${p.id}"><img
										src="resources/img/ProductImages/${p.tinyImage}" alt=""></a>
									<div class="caption"">
										<h3>${p.name}</h3>																		
										<p>Giá: ${p.price}</p>
										<p style="visibility: collapse;">hidden</p>																									
										<p>
											<a href="#" class="btn btn-primary">Buy Now!</a> <a href="#"
												class="btn btn-default">More Info</a>
										</p>
									</div>
								</div>
							</div>
						</c:otherwise>
					</c:choose>		
					</c:forEach>				
			</c:if>
		</div>
</body>
</html>
