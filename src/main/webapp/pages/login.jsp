<%--
  Created by IntelliJ IDEA.
  User: Игорь
  Date: 07.09.2024
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="_header.jsp"></jsp:include>
<div class="container">
    <div class="row justify-content-center">

        <form class="col-4" action="/user/login" method="post" enctype="multipart/form-data">
            <div class="alert alert-warning" role="alert">
                ${message}
            </div>
            <div class="mb-3">
                <label for="exampleInputEmail2" class="form-label">Username</label>
                <input type="text" name="username" class="form-control" id="exampleInputEmail2">

            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">Password</label>
                <input type="password" name="password" class="form-control" id="exampleInputPassword1">
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</div>
</body>
</html>
