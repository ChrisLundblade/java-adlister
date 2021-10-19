<%--
  Created by IntelliJ IDEA.
  User: christopherlundblade
  Date: 10/19/21
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<jsp:include page="/partials/head.jsp">
    <jsp:param name="title" value="Please Log In" />
</jsp:include>
<body>
    <c:forEach var="ad" items="${ads}">
        <div>
            Title: ${ad.title}
            ID: ${ad.id}
            Posted by: ${ad.userId}<br>
            Content: ${ad.description}

        </div>
        <br>
    </c:forEach>
</body>
</html>
