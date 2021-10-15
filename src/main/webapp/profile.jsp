<%--
  Created by IntelliJ IDEA.
  User: christopherlundblade
  Date: 10/15/21
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="partials/header.jsp">
    <jsp:param name="title" value="profile"/>
</jsp:include>
<body>

    <%@include file="partials/header.jsp"%>
    <%@include file="partials/navbar.jsp"%>
    <h1>This is the Profile Page</h1>
    <%@include file="partials/footer.jsp"%>
</body>
</html>
