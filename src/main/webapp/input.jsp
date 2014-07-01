<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Text Parser</title>
    <link rel="stylesheet" href="style/style.css" type="text/css">
</head>
<body>
<h1>TEXT PARSER</h1>

<form action="${pageContext.request.contextPath}/parser" method="post">
    <textarea rows="20" name="textarea" autofocus></textarea>
    <div class="buttonHolder">
        <input class="button" type="submit" value="Parse">
    </div>
</form>

</body>
</html>
