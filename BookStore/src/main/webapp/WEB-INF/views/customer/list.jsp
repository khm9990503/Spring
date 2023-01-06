<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>customer::list</title>
	</head>
	<body>
		<h3>customer 목록</h3>
		<a href="/BookStore/">메인</a>
		<a href="/BookStore/customer/register">customer 등록</a>
		
		<table border="1">
			<tr>
				<th>고객번호</th>
				<th>고객명</th>
				<th>주소</th>
				<th>휴대폰</th>
				<th>관리</th>
			</tr>
			<c:forEach var="customer" items="${customers }">
				<tr>
					<td>${customer.cusid}</td>
					<td>${customer.name}</td>
					<td>${customer.address}</td>
					<td>${customer.phone}</td>
					<td>
						<a href="/BookStore/customer/modify?cusid=${customer.cusid}">수정</a>
						<a href="/BookStore/customer/delete?cusid=${customer.cusid}">삭제</a>
					</td>
				</tr>
			</c:forEach>
			
		</table>
		
	</body>
</html>