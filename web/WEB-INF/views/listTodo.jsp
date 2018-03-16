<%--
  Created by IntelliJ IDEA.
  User: Günther
  Date: 15.12.2017
  Time: 09:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/header.jspf" %>
<%@include file="../common/navigation.jspf" %>


<div class="container">
    <p>Hallo ${name}! Herzlich Willkommen</p>





    <table class="table table-striped">
        <caption>Ihre Todos sind:</caption>
        <th>ToDo</th>
        <th>Aktion</th>
        <c:forEach var="todo" items="${todos}">
            <tr>
                <td>
                        ${todo.name}
                </td>
                <td>
                    <a class="btn btn-danger" href="delete-todo.do?name=${todo.name}">Löschen</a>
                </td>
            </tr>
        </c:forEach>
    </table>


    <br>
    <br>


    <form method="get" action="addTodo.do">
        <input type="submit" value="Neues Todo hinzufügen" class="btn btn-success">
    </form>
</div>




<%@include file="../common/footer.jspf" %>
