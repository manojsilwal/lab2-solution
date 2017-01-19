<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="/Waa/resources/css/main.css" rel="stylesheet" type="text/css"></head>
<body>
	<div class="content">
		<ul class="products">
			<c:forEach var="product" items="${products}">
				<li class="item">
					<ul class="product-col">
						<li><a href="/Waa/product/${product.productId}">${product.name}</a></li>
					</ul>
				</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>