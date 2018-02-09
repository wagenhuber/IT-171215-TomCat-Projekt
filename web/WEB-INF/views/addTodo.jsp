<%--
  Created by IntelliJ IDEA.
  User: wagenhuberg
  Date: 19.01.2018
  Time: 09:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/header.jspf"%>
<%@include file="../common/navigation.jspf"%>


<div class="container">
<form method="post" action="/addTodo.do">
    Todoname: <input type="text" name="name" >
    <input type="submit" value="Eintragen">
</form>
</div>
<%@include file="../common/footer.jspf"%>
