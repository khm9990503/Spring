<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>book::register</title>
	</head>
	<body>
		<h3>book 등록</h3>
		<a href="/BookStore/">메인</a>
		<a href="/BookStore/book/list">book 목록</a>
		
		<form action="/BookStore/book/register" method="post">
			<table>
				<tr>
					<td>도서번호</td>
					<td><input type="text" name="bookId"></td>
				</tr>
				<tr>
					<td>도서명</td>
					<td><input type="text" name="bookname"></td>
				</tr>
				<tr>
					<td>출판사</td>
					<td><input type="text" name="publisher"></td>
				</tr>
				<tr>
					<td>가격</td>
					<td><input type="number" name="price"></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit" value="등록"></td>
				</tr>
			</table>
		</form>
		
	</body>
</html>