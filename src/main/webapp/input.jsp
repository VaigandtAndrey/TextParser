<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Cp1251" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:bundle basename="i18n.messages">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title><fmt:message key="title"/></title>
    <link rel="stylesheet" href="style/style.css" type="text/css">
</head>
<body>
<div id="top"><h1><fmt:message key="head"/></h1></div>
<p></p>
<div id="left">
    <form action="${pageContext.request.contextPath}/parser" method="post">
        <textarea rows="20" name="textarea" autofocus></textarea>
        <input class="button" type="submit" value="<fmt:message key="input.button.parse"/>">
    </form>
</div>
    <div id="right">
        <input type="radio" name="action" value="parse" checked> parse!<br>
    </div>
</body>
</html>
</fmt:bundle>