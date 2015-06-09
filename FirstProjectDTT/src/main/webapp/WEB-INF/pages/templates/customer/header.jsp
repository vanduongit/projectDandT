<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
<style>
	.navbar-brand{
		font-size: 20pt;
	 }
</style>
</head>
<body>
	
	<!-- Header --> 
	<div class="container" >
		 <div class="row">
		 	<div class="col-md-3">                                                 
            <h1>MASTER</h1>         
            </div>
            <div class="col-md-6" style="margin-top: 20px;">                               
            	<form action="" class="form-inline" role="form">
                	<input type="text" class="form-control" id="usr" style="width: 70%">
                	<a href="#" class="btn btn-info btn-md"><span class="glyphicon glyphicon-search"></span>Search</a>
            	</form>               
            </div>
            <div class="col-md-3" style="margin-top: 20px">
            
            <c:choose>
    			<c:when test="${sessionScope.user != null}">    			                                            
            			Chào mừng, <a href='#'>${sessionScope.user}</a> | 
            			<a href='#'>Đăng xuất</a> |                        		                                               
            		    <a href="${pageContext.request.contextPath}/cart/show"><span class="glyphicon glyphicon-shopping-cart"></span></a>                       		    			        			
    			</c:when>
    			<c:otherwise>
        			<a href="${pageContext.request.contextPath}/login">Đăng nhập</a> | 
					<a href="">Đăng Ký</a> |
					<a href="${pageContext.request.contextPath}/cart/show"><span class="glyphicon glyphicon-shopping-cart"></span></a> 
    			</c:otherwise>
			</c:choose>
            
			
	    		
			
            
            </div>
		 </div>		
	</div> 
	<!--end container --> 
</body>
</html>