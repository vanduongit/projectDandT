<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="<c:url value="/bootstrap/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/bootstrap/js/jquery-1.11.2.min.js"/>"></script>
<title>Insert title here</title>
</head>
<body>
	
	<!-- Page Content -->
	
	<div class="container">
		<h3>Giỏ hàng sản phẩm</h3>
		<div class="row">
			<div class="col-md-12">
				<table class="table" border="1">
					<tr>
						<th>Xóa</th>
						<th>STT</th>
						<th>Sản phẩm</th>
						<th>Số lượng</th>
						
						<th>Thành tiền</th>
					</tr>
					<c:forEach items="${cartContain.listProduct}" var="p" varStatus="pStatus"> 
						<tr>
							<td></td>
							<td>${pStatus.index+1}</td>
							<td>
								<h4>${p.key.name}</h4>
								${p.key.price} VND
								<img class="img-responsive" alt="" src="<c:url value="/resources/img/ProductImages/${p.key.bigImage}"/>" width="75px" height="100px"/>
							</td>
							<td>${p.value}</td>
							
							<td>${p.key.price*p.value} VND</td>
						</tr>
					 </c:forEach> 
				</table>
			</div>
		</div>
		<!-- End row 1 -->
		<div class="row">
			<div class="col-md-12 text-right">Tổng cộng</div>
		</div>
		<div class="row">
			<div class="col-md-12 text-right"><a href="" class="button">Tiếp tục mua sắm</a></div>
		</div>
	</div>
</body>
</html>