<%--
  Created by IntelliJ IDEA.
  User: Игорь
  Date: 09.09.2024
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>My message</title>
</head>
<body>


<div class="container text-center">
    <div class="row justify-content-md-center">
        <jsp:include page="_header.jsp"></jsp:include>
        <c:forEach var="user" items="${users}">

            <div class="col-4">
                <div id="list-example" class="list-group">


                    <div class="dropdown">
                        <a class="btn btn-secondary dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                ${user.username}
                        </a>

                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="#">Action</a></li>
                            <li><a class="dropdown-item" href="#">Another action</a></li>
                            <li><a class="dropdown-item" href="#">Something else here</a></li>
                        </ul>
                    </div>

                       
                </div>

            </div>

            <div class="col col-lg-7">
                Variable width content
            </div>
            <div class="col col-lg-1">
                3 of 3
            </div>
        </c:forEach>
    </div>

</div>
</body>
</html>
