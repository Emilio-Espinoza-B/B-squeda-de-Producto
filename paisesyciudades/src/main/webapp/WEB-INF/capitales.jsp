<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Capital del País</title>
</head>
<body>
<h1>Capital del País</h1>
<c:choose>
    <c:when test="${not empty capital}">
        <p>La capital de ${pais} es ${capital}.</p>
    </c:when>
    <c:otherwise>
        <p>${mensaje}</p>
    </c:otherwise>
</c:choose>
</body>
</html>
