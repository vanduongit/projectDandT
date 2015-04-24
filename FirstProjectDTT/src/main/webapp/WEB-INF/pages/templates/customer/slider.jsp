<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img class="img-responsive img-full"
					src="http://ironsummitmedia.github.io/startbootstrap-business-casual/img/slide-1.jpg"
					alt="">
			</div>
			<div class="item">
				<img class="img-responsive img-full"
					src="http://ironsummitmedia.github.io/startbootstrap-business-casual/img/slide-2.jpg"
					alt="">
			</div>
			<div class="item">
				<img class="img-responsive img-full"
					src="http://ironsummitmedia.github.io/startbootstrap-business-casual/img/slide-3.jpg"
					alt="">
			</div>
		</div>

	</div>
	<script>
		$('.carousel').carousel({
			interval : 5000
		//changes the speed
		})
	</script>
</body>
</html>