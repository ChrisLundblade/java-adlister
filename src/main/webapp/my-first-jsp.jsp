<%--
  Created by IntelliJ IDEA.
  User: christopherlundblade
  Date: 10/14/21
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%! String myName = "Chris";  %>--%>
<% String myName = request.getParameter("myName"); %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>
        My first name is <span class="my-name"><%= myName %></span>.
    </h1>
    <%@ include file="my-first-fragment.html" %>

</body>
</html>
