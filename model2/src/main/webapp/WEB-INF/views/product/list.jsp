<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품 목록 페이지</h1>
	<p>상품 목록을 확인해보세요</p>
	
	<table border="1" style="width: 100%;">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>제조회사</th>
				<th>가격</th>
				<th>할인가격</th>
				<th>재고수량</th>
				<th>판매여부</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.no}</td>
				<td>${product.name}</td>
				<td>${product.maker.name}</td>
				<td><fmt:formatNumber value="${product.price}"/> 원</td>
				<td><fmt:formatNumber value="${product.discountPrice}"/> 원</td>
				<td>${product.stock}</td>
				<td>${product.soldOut}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>