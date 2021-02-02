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
	<form:form commandName="boardVO" bame="boardForm" id="boardForm" method="post" action="./action.do?no=${data.no }">
		<input type="text" name="sj" id="sj" value="${data.sj }" />
		<input type="text" name="writer" id="writer" value="${data.writer }" />
		<input type="text" name="cn" id="cn" value="${data.cn }" />
		<button>전송</button>
	</form:form>
</body>
</html>