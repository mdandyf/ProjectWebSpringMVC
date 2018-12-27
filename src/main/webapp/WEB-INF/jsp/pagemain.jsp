
<%--
  Created by IntelliJ IDEA.
  User: Dandy_F122
  Date: 27/12/2018
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Page Redirect</title>
</head>
<body>
    <h2>Spring Page Redirection</h2>
    <p>Click below button to redirect the result to new page</p>
    <form:form method = "GET" action = "/redirect">
        <table>
            <tr>
                <td>
                    <input type = "submit" value = "Redirect Page"/>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
