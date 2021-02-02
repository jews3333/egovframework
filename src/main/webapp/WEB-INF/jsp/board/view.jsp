<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<caption></caption>
		<tbody>
			<tr>
				<th>제목</th>
				<td>${view.sj }</td>
			</tr>
			<tr>
				<th>작성자</th>
				<td>${view.writer }</td>
			</tr>
			<tr>
				<th>작성일</th>
				<td>${view.createDate }</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${view.cn }</td>
			</tr>
		</tbody>
	</table>
</body>
</html>