<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${products}" var="product"> 
		<div class="boxed">
			<h3>${ product.name}</h3>
			<p>${ product.description} 
			<p>Price ${ product.unitPrice}USD</p>
			<p>Availabe ${ product.unitsInStock} units in stock</p>
		<%-- 	<a href="${pageContext.request.contextPath}${('/detail/').concat(product.productId).concat('/').concat(product.unitPrice)}">view detail</a>
			<a href="${pageContext.request.contextPath}${('/order/').concat(product.productId).concat('/').concat(product.unitPrice)}">Order</a>
		 --%>	<hr>
			

		</div>
	</c:forEach>
</body>
</html>