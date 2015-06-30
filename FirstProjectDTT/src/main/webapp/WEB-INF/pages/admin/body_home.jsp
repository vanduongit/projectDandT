<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<h3>Chức năng</h3>
			</div>
		</div>
		<c:forEach items="${MENU_BODY}" varStatus="status" var="m">
			<c:if test="${status.index mod 4 == 0}">
				<div class="row text-center">
			</c:if>
			<div class="col-md-3 hero-feature">
				<div class="thumbail">
						<a href="#"><img src="<c:url value="/resources/img/admin/home/${m.value}"/>" alt="" width="200" height="200"/></a>
						<div class="caption">
							<a href=""><b>${m.key}</b></a>
						</div>
				</div>
			</div>
			<c:if test="${status.index mod 4 == 3 || status.index==MENU_BODY.size()-1}">
				</div>
			</c:if>
		</c:forEach>
		
		<div class="row">
			<div class="col-md-3">
				<h3>Nâng cao</h3>
			</div>
		</div>
		<c:forEach items="${MENU_ADV_BODY}" varStatus="status" var="m">
			<c:if test="${status.index mod 4 == 0}">
				<div class="row text-center">
			</c:if>
			<div class="col-md-3 hero-feature">
				<div class="thumbail">
						<a href="#"><img src="<c:url value="/resources/img/admin/home/${m.value}"/>" alt="" width="200" height="200"/></a>
						<div class="caption">
							<a href=""><b>${m.key}</b></a>
						</div>
				</div>
			</div>
			<c:if test="${status.index mod 4 == 3 || status.index==MENU_BODY.size()-1}">
				</div>
			</c:if>
		</c:forEach>
	</div>	
</body>
</html>