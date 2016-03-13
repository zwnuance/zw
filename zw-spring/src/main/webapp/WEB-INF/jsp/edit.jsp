<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>add</title>
</head>
<body>
<form action="/user/edit" method="post">
    Name<input type="text" name="name" value="${user.name}"><br/>
    Age<input type="number" name="age" value="${user.age}"><br/>
    <input type="submit" value="save">&nbsp;<a href="/user/list">Back</a>
</form>
</body>
</html>
