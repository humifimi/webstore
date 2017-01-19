<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="purchase" method="post">
	<div class="boxed">
			<h3>${ product.name}</h3>
			<p>${ product.description} 
			<p>Price ${ product.unitPrice}USD</p>
			<p>Availabe ${ product.unitsInStock} units in stock</p></p>
			<label>Quantity</label><p><input type="text" name="qty"/>
			<input type="submit" value="CheckOut"/>
			<input type="hidden" value="${product.productId}" name="id"/>
			
			<hr>
			</form>

		</div>
</body>
</html>