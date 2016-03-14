<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>add</title>
</head>
<body>
<form action="/user/add" method="post">
    UserId<input type="text" name="userId"><br/>
    Name<input type="text" name="name"><br/>
    Age<input type="number" name="age"><br/>
    <input type="submit" value="save">&nbsp;<a href="/user/list">Back</a>
</form>
</body>
</html>
