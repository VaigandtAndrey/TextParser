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
<h2>Text submitted:</h2>
<a>${text}</a>


<h2>Text by sentences:</h2>
<c:forEach var="sent" items="${sentences}">
    <a>${sent}<br></a>
</c:forEach>
</body>
</html>



