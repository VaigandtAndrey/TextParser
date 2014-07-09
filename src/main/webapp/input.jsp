<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:bundle basename="i18n.messages">
    <html>
    <head lang="en">
        <meta charset="UTF-8">
        <title><fmt:message key="title"/></title>
        <link rel="stylesheet" href="style/style.css" type="text/css">
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
    </head>
    <body>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <div id="top"><h1><fmt:message key="head"/></h1></div>
    <p></p>

    <div id="left">
        <form action="${pageContext.request.contextPath}/parser" method="post">
            <textarea rows="20" name="textarea" autofocus></textarea>
            <input class="button" type="submit" value="<fmt:message key="input.button.parse"/>">
        </form>
    </div>
    <div id="right">
        <input type="radio" name="action" value="parse" > parse!<br>
        <input type="radio" name="action" value="TestAction"checked> TestAction<br>
        <input type="radio" name="action" value="action1"> action1<br>
        <input type="radio" name="action" value="action2"> action2<br>
    </div>
    </body>
    </html>
</fmt:bundle>