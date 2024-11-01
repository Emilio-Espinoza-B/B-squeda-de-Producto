<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Países</title>
</head>
<body>
<h1>Lista de Países</h1>
<ul>
    <c:forEach var="pais" items="${paises}">
        <li>${pais}</li>
    </c:forEach>
</ul>
</body>
</html>
