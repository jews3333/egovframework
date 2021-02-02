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
	폼
	<form:form commandName="boardVO" bame="boardForm" id="boardForm" method="post" action="./action.do">
		<input type="text" name="cn" id="cn" value="" />
		<input type="text" name="writer" id="writer" value="" />
		<input type="text" name="sj" id="sj" value="" />
		<button>전송</button>
	</form:form>
</body>
</html>