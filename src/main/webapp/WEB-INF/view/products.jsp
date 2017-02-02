<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="/Waa/resources/css/main.css" rel="stylesheet" type="text/css"></head>
<body>
	
	<security:authorize ifAnyGranted="ROLE_USER">
        <c:url value="/j_spring_security_logout" var="logoutUrl" />

	<!-- csrt for log out-->
		<form action="${logoutUrl}" method="post">
		  <input type="hidden"
			name="${_csrf.parameterName}"
			value="${_csrf.token}" />
			<input type="submit"  value="logout"/>
		</form>
    </security:authorize>
    <div class="jumbotron">
		<h1 class="display-3">Product Page</h1>
	</div>
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