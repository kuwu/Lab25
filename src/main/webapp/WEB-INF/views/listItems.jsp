<%--
  Created by IntelliJ IDEA.
  User: kuwu
  Date: 2017/08/03
  Time: 6:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Menu</title>
</head>
<body>

<table border="1">
    <c:forEach var="myVar" items="${cList}">
    <tr>
        <td>${myVar.itemId}</td>
        <td>${myVar.name}</td>
        <td>${myVar.descript}</td>
        <td>${myVar.quanity}</td>

    </tr>

    </c:forEach>

</body>
</html>
