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
			<div class="col-md-12" id='cartShop'>
				<table class="table" border="1">
					<tr>
						<th>Xóa</th>
						<th>STT</th>
						<th>Sản phẩm</th>
						<th>Số lượng</th>
						<th>Thành tiền</th>
					</tr>
					<c:if test="${cartContain.listProduct.size()==0 || cartContain==null}">
						<tr>
							<td colspan="5"><h3>Không có sản phẩm nào trong giỏ hàng</h3></td>
						</tr>
					</c:if>
					<c:forEach items="${cartContain.listProduct}" var="p" varStatus="pStatus"> 
						<tr>
							<td><a href="javascript:removeCart(${p.key.id })" class=""><span class="glyphicon glyphicon-remove"></span></a></td>
							<td>${pStatus.index+1}</td>
							<td><h4>${p.key.name}</h4>${p.key.price} VND<img class="img-responsive" alt="" src="<c:url value="/resources/img/ProductImages/${p.key.bigImage}"/>" width="75px" height="100px"/></td>
							<td>${p.value}</td>
							
							<td>${p.key.price*p.value} VND</td>
						</tr>
					 </c:forEach> 
				</table>
			</div>
		</div>
		<!-- End row 1 -->
		<div class="row">
			<div class="col-md-12 text-right" id='totalPrice'>Tổng cộng: ${cartContain.totalPrice}</div>
		</div>
		<div class="row">
			<div class="col-md-12 text-right"><a href="" class="button">Tiếp tục mua sắm</a></div>
		</div>
	</div>
	<script type="text/javascript">
		function removeCart(id){
			var html='';
			$.ajax({
				type:'GET',
				url:'remove/'+id,
				dataType:'json',
				contentType: 'application/json',
				success:function(data){
					html+='<table class="table" border="1">';
					html+='<tr>';
					html+='<th>Xóa</th>';
					html+='<th>STT</th>';
					html+='<th>Sản phẩm</th>';
					html+='<th>Số lượng</th>';
					html+='<th>Thành tiền</th>';
					html+='</tr>';
					var index=0;
					$.each(data['listProduct'],function(k,v){
						index+=1;
						var product=$.parseJSON(k);
						html+="<tr>";
						html+="<td><a href='javascript:removeCart("+product.id+")'><span class='glyphicon glyphicon-remove'></span></a></td>"
						html+="<td>"+index+"</td>";
						if(product.promotePrice==0){
							html+="<td><h4>"+product.name+"</h4>"+product.price+" VND<img class='img-responsive' alt='No Image' src='<c:url value='/resources/img/ProductImages/"+product.bigImage+"'/>' width='75px' height='100px'/></td>";	
						}else{
							html+="<td><h4>"+product.name+"</h4>"+product.price+" VND - <h4>"+product.promotePrice+" VND</h4><img class='img-responsive' alt='No Image' src='<c:url value='/resources/img/ProductImages/"+product.bigImage+"'/>' width='75px' height='100px'/></td>";
						}
						
						html+="<td>"+v+"</td>";
						html+="<td>"+v*product.price+" VND</td>";
						html+="</tr>"
					});
					if(index==0){
						html+="<tr>";
							html+="<td colspan='5'><h3>Không có sản phẩm nào trong giỏ hàng</h3></td>";
						html+="</tr>";
					}
					html+='</table>';
					
					$('#cartShop').html(html);
					$('#totalPrice').html("Tổng cộng: "+data['totalPrice']);
				},
				error: function (xhr, ajaxOptions, thrownError) {
			       alert(xhr.responseText);
			    }
				
			});
		}
		
	</script>
</body>
</html>