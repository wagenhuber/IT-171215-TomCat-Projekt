<%--
  Created by IntelliJ IDEA.
  User: wagenhuberg
  Date: 15.12.2017
  Time: 09:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Willkommen</title>
</head>
<body>
<p>Hallo ${name}! Herzlich Willkommen</p>
<p>Deine Todos sind: ${todos}</p>
<ol>
    <c:forEach var="todo" items="${todos}">
        <li>
            ${todo.name}
        </li>
    </c:forEach>
</ol>
</body>
</html>
