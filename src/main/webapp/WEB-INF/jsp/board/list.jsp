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
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일자</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="item" varStatus="status">
			<tr>
				<td>${item.no }</td>
				<td><a href="./view.do?no=${item.no}">${item.sj }</a></td>
				<td>${item.writer }</td>
				<td>${item.createDate }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>