<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Add new product</title>
</head>

<body>
<form  action="/add"  method = "POST">
    id: <input name="id" type="number" th:field="*{id}"/>
    <br>
    title: <input name="title" type="text"  th:field="*{title}"/>
    <br>
    cost: <input name="cost" type="number" th:field="*{cost}"/>
    <br>
    <button type="submit">Save</button>
</form>
</body>
</html>