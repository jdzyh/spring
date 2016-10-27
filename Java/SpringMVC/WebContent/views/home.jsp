<%@ page language="java" contentType="text/html;charset=utf-8"%>
<%@ page session="false" %>
<html>
	<head>
		<title>Spittr</title>
		<link rel="stylesheet" 
			  type="test/css" 
			  href="<c:url value="/resources/style.css"/>" >
	</head>
	<body>
		<h1>Welcome to Spittr</h1>
		<a href="<c:url value="/spittles" />">Spittles</a>
		<a href="<c:url value="/spitter/register" />">Register</a>
	</body>
</html>