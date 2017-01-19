<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="/Waa/resources/css/main.css" rel="stylesheet" type="text/css"></head>

</head>
<body>
	<section class="product-detail">
	<div class="product">
		<header>
		    <hgroup>
		      <h1>${product.name}</h1>
		    </hgroup>
		  </header>
		    <section>
 
				  	<p>${product.description}</p>
				    <details>
				   		<summary>${product.unitsInStock}</summary>
				  	</details>
				  	
					<div class="order-button">
						<form action="/Waa/order" method="post">
							<select name="qty">
						  		<option value="1">1</option>
						  		<option value="2">2</option>
						  		<option value="3">3</option>
						  		<option value="4">4</option>
						  	</select>
							<input type="hidden" value="${product.productId}" name="id"/>
							<input type="submit" value="Add Cart"/>
						</form>
					</div>
			</section>
			
		</div>
	 
</section>
</body>
</html>