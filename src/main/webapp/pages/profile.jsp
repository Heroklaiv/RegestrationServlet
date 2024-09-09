<%--
  Created by IntelliJ IDEA.
  User: Игорь
  Date: 07.09.2024
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Profile${currentUser.username}</title>
</head>
<body>
<jsp:include page="_header.jsp"></jsp:include>
<div class="row justify-content-center">
    <div class="card" style="width: 18rem;">
        <ul class="list-group list-group-flush">
            <li class="list-group-item"> Hello ${currentUser.name} !</li>
            <li class="list-group-item"> Your username: ${currentUser.username}</li>
            <li class="list-group-item"> Your username: ${currentUser.age}</li>
            <li class="list-group-item"> Your password: ${currentUser.password}</li>
        </ul>
    </div>
</div>
</body>
</html>
