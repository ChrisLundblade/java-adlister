<%@ page import="personSubFolder.Person" %><%--
  Created by IntelliJ IDEA.
  User: christopherlundblade
  Date: 10/14/21
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    request.setAttribute("dude", new Person("Miles", "Milliardo", 4, 26));
%>
<html>
<head>
    <title>Display Extra Person</title>
</head>
<body>
    <ul>
        <li>${dude.id}</li><li>${dude.firstName}</li><li>${dude.lastName}</li><li>${dude.age}</li>
    </ul>
</body>
</html>
