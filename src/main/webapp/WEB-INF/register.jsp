<%--
  Created by IntelliJ IDEA.
  User: christopherlundblade
  Date: 10/24/21
  Time: 11:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration for Adlister</title>
</head>
<body>
    <h1>Registration</h1>
    <form action="/register" method="POST">
        <div>
            <label for="username">Username</label>
            <input id="username" name="username" placeholder="Enter username" type="text">
        </div>
        <div>
            <label for="email">Email</label>
            <input id="email" name="email" placeholder="Enter email" type="text">
        </div>
        <div>
            <label for="password">Password</label>
            <input id="password" name="password" placeholder="Enter password" type="text">
        </div>
        <button type="submit">Register</button>
    </form>
</body>
</html>
