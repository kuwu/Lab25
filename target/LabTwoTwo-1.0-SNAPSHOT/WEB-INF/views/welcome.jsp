<%--
  Created by IntelliJ IDEA.
  User: kuwu
  Date: 2017/07/24
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Login</title>

</head>
<body>
<div>
    ${message}<br>
        <br>

        <form method="post" action = "/listItems">
            User Name: <input type="text" name="userId">
            <br>
            Password: <input type="password" name="password">
            <br>
            <br>
            <input type="submit" value="Login">
        </form>


       <p>Need an Account?  <a href="getNewCust">Sign Up</a></p>

</div>
</body>
</html>
