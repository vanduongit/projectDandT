<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<script src="<c:url value="/bootstrap/js/jquery-1.11.2.min.js"/>"></script>
	<script src="<c:url value="/bootstrap/js/bootstrap.min.js"/>"></script>
	<link href="<c:url value="/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet" />
	
	<link href='http://fonts.googleapis.com/css?family=Bree+Serif' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Philosopher' rel='stylesheet' type='text/css'>
		
	<link rel="stylesheet" href="/css/font-awesome.min.css"/>	
	<link rel="stylesheet" href="/css/style.css" />
	<script src="/js/modernizr-2.6.2.min.js"></script>


<title>
	<tiles:insertAttribute name="titles"></tiles:insertAttribute>
</title>
</head>
<body>		
	<c:if test="${mapSession == null}">
		<c:redirect url="${pageContext.request.contextPath}/"/>
	</c:if>
	<tiles:insertAttribute name="header"></tiles:insertAttribute>
	<tiles:insertAttribute name="slider"></tiles:insertAttribute>
	<tiles:insertAttribute name="menu"></tiles:insertAttribute>
	<tiles:insertAttribute name="body"></tiles:insertAttribute>
	<tiles:insertAttribute name="footer"></tiles:insertAttribute>
	
	 <!-- Placed at the end of the document so the pages load faster -->
	
</body>
</html>