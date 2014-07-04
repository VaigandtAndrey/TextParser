<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:bundle basename="i18n.messages">
<html>
<head lang="en">
    <title><fmt:message key="title"/></title>
    <link rel="stylesheet" href="style/style.css" type="text/css">
</head>
<body>
<h1><fmt:message key="head"/></h1>

<h2><fmt:message key="output.text.submitted"/></h2>
<a>${text}</a>

<h2><fmt:message key="output.text.paragraph"/>:</h2>
<c:forEach var="sent" items="${paragraph}" varStatus="loop">
    <br> <a>${loop.index}. ${sent}</a><br>
</c:forEach>
<h2><fmt:message key="output.text.sentence"/></h2>
<c:forEach var="sent" items="${sentence}" varStatus="loop">
    <br> <a>${loop.index}. ${sent}</a><br>
</c:forEach>
<h2><fmt:message key="output.text.word"/></h2>
<c:forEach var="sent" items="${word}" varStatus="loop">
    <br> <a>${loop.index}. ${sent}</a><br>
</c:forEach>
<h2><fmt:message key="output.text.letter"/></h2>
<c:forEach var="sent" items="${letter}" varStatus="loop">
    <br> <a>${loop.index}. ${sent}</a><br>
</c:forEach>

</body>
</html>
</fmt:bundle>


