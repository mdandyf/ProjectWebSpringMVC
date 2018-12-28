<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Dandy_F122
  Date: 27/12/2018
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Landing Page</title>
</head>
<body>
<h2>Spring Landing Pag</h2>
<p>Click below button to get a simple HTML page</p>
<form:form method = "GET" action = "/staticPage">
    <table>
        <tr>
            <td>
                <input type = "submit" value = "Get HTML Page"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
