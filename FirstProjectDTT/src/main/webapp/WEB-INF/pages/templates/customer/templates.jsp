<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="bootstrap/js/jquery-1.11.2.min.js"></script>
<title>
	<tiles:insertAttribute name="titles"></tiles:insertAttribute>
</title>
</head>
<body>	
	<tiles:insertAttribute name="header"></tiles:insertAttribute>
	<tiles:insertAttribute name="slider"></tiles:insertAttribute>
	<tiles:insertAttribute name="menu"></tiles:insertAttribute>
	<tiles:insertAttribute name="body"></tiles:insertAttribute>
	<tiles:insertAttribute name="footer"></tiles:insertAttribute>
	
	 <!-- Placed at the end of the document so the pages load faster -->
	
</body>
</html>