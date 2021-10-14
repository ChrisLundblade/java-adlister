<%--
  Created by IntelliJ IDEA.
  User: christopherlundblade
  Date: 10/14/21
  Time: 3:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="personSubFolder.Person" %>

<%
    Person p1 = new Person("Jeff", "Bridges", 1, 53);
    Person p2 = new Person("Cody", "Duckworth", 2, 4);
    Person p3 = new Person("Jim", "Halpert", 3, 35);
    request.setAttribute("people", new Person[]{p1,p2,p3});
%>
<html>
<head>
    <title>Title</title>
<%--    <link rel="stylesheet" href="stylesheets/person-list.css">--%>
    <style><%@include file="stylesheets/person-list.css" %></style>
</head>
<body>
    <table>
        <tr>
            <th>
                ID
            </th>
            <th>
                First Name
            </th>
            <th>
                Last Name
            </th>
            <th>
                Age
            </th>
        </tr>
        <c:forEach var="person" items="${people}">
            <tr>
                <td>${person.id}</td>
                <td>${person.firstName}</td>
                <td>${person.lastName}</td>
                <td>${person.age}</td>
            </tr>
        </c:forEach>
    </table>
    <%@include file="fragments/display-extra-person.jsp" %>
</body>
</html>