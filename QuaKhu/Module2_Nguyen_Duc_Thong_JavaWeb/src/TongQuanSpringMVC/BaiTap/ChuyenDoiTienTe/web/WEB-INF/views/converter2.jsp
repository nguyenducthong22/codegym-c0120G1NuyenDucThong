<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 4/14/2020
  Time: 8:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Currency Converter</h2>
<form method="post" action="/converter1.jsp">
    <label for="rate">Rate:</label><br>
    <input type="text" name="rate" id="rate" placeholder="RATE" value="22000"><br>
    <label for="usd">USD:</label><br>
    <input type="text" name="usd" id="usd" placeholder="USD" value="0"><br>
    <input type="submit" id="submit" value="converter">
</form>
</body>
</html>