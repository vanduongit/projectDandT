<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:set var="p" value="${product}"/>
	<!-- Page content -->
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<img class="img-responsive" alt="" src="<c:url value="/resources/img/ProductImages/${p.bigImage}"/>"/>
			</div>
			<div class="col-md-6">
				<h2>${p.name}</h2>
				<h6>Mã sản phẩm: ${p.codePro }</h6>
				<form class="form-inline" action="">
					<table>
						<tr>
							<th>Hãng: </th>
							<td>${p.brand.name}</td>						
						</tr>
						<tr>
							<th valign="middle">Tình trạng: </th>
							<td valign="bottom">
								<c:if test="${p.amount > 0}">
									<h4 style="font-weight: bold;color: blue">Còn hàng</h4>
								</c:if>
								<c:if test="${p.amount <= 0}">
									<h4 style="font-weight: bold;color: red">Hết hàng</h4>
								</c:if>
							</td>						
						</tr>
						<tr>
							<th valign="middle">Giá:</th>
							<td>
								<h4 style="font-weight: bold;color: green">${p.price} VNĐ</h4>
							</td>
						</tr>
						<tr>
							<th>Số lượng:</th>
							<td>
								<div class="form-group">      								
        							<input type="text" class="form-control" maxlength="2" value="1"/>	      								
      								<div class="btn-group-vertical" role="group" aria-label="...">
	 									<button value="add" class="btn btn-xs">+</button>
	 									<button value="sub" class="btn btn-xs">-</button>	 									
									</div>	
      							</div>
							</td>
						</tr>
						<tr>
							<td></td>
							<td>
								<button class="btn btn-danger" style="width: 100%">Thêm vào giỏ hàng</button><br/>
								<button class="btn btn-primary btn-lg" style="width: 100%">Mua ngay</button><br/>	
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<!-- End row 1 -->
		<div class="row">
			<div class="col-md-12">
				
			</div>
		</div>
	</div>
	<!-- End container -->
	
</body>
</html>