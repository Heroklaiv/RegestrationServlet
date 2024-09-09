<%--
  Created by IntelliJ IDEA.
  User: Игорь
  Date: 07.09.2024
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>

    <title>Registration</title>

</head>
<body>
<jsp:include page="_header.jsp"></jsp:include>
<div class="container">
    <div class="row justify-content-center">
        <form class="col-4" action="/user/reg" method="post" enctype="multipart/form-data">
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Name</label>
                <input type="text" name="name" class="form-control" id="exampleInputEmail1">

            </div>
            <div class="mb-3">
                <label for="exampleInputEmail2" class="form-label">Username</label>
                <input type="text" name="username" class="form-control" id="exampleInputEmail2">

            </div>
            <div class="mb-3">
                <label for="exampleInputEmail3" class="form-label">Age</label>
                <input type="text" name="age" class="form-control" id="exampleInputEmail3">

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