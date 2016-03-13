<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Index</title>
</head>
<body>
<table>
    <thead>
        <tr>
            <td>Name</td>
            <td>Age</td>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="u" items="${users}">
            <tr>
                <td><a href="/user/edit/${u.name}">${u.name}</a></td>
                <td>${u.age}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<a href="/user/add">add User</a>
</body>
</html>
