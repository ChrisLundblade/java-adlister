<%--
  Created by IntelliJ IDEA.
  User: christopherlundblade
  Date: 10/15/21
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    if((request.getParameter("username")) != null &&
    (request.getParameter("password")) != null) {
        if (( request.getParameter("username")).equals("admin") &&
                (request.getParameter("password")).equals("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <%@include file="partials/header.jsp"%>
    <%@include file="partials/navbar.jsp"%>
    <form method="POST" id="login" name="login-form" >
        <div>
            <label for="password">Username:</label>
                <input placeholder="Username" name="username" type="text" id="username">

        </div>
        <br>
        <div>
            <label for="username">Password: </label>
                <input placeholder="Password" name="password" type="password" id="password">
        </div>
        <button type="submit">Log In</button>
    </form>
    <%@include file="partials/footer.jsp"%>
</body>
</html>
