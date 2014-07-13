<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:bundle basename="i18n.messages">
    <html>
    <head lang="en">
        <title><fmt:message key="title"/></title>
        <link rel="stylesheet" href="style/style.css" type="text/css">
            <%--<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">--%>
    </head>
    <body>
        <%--<script src="http://code.jquery.com/jquery-latest.js"></script>--%>
        <%--<script src="js/bootstrap.min.js"></script>--%>
    <h1><fmt:message key="head"/></h1>

    <h2><fmt:message key="output.text.submitted"/></h2>
        ${text}
    <h2><fmt:message key="output.text.source"/></h2>
        ${text.toSourceString()}

    </body>
    </html>
</fmt:bundle>


