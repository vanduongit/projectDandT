<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Page Content -->
	<div class="container">

		<!-- Title -->
		<div class="row">
			<div class="col-lg-12">
				<h3>San Pham Noi Bat</h3>
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
										<p>	Gi�: <strike>${p.price}</strike></p>
										<p>Gi� KM: ${p.promotePrice}</p>										
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
										<p>Gi�: ${p.price}</p>
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
				<h3>San Pham Hot</h3>
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
										<p>	Gi�: <strike>${p.price}</strike></p>
										<p>Gi� KM: ${p.promotePrice}</p>										
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
										<p>Gi�: ${p.price}</p>
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
				<h3>San Pham</h3>
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
										<p>	Gi�: <strike>${p.price}</strike></p>
										<p>Gi� KM: ${p.promotePrice}</p>										
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
										<p>Gi�: ${p.price}</p>
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
