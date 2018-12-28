<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Dandy_F122
  Date: 28/12/2018
  Time: 8:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <h2>User Information</h2>
    <form:form method="POST" action="/loginUser">
        <table>
            <tr>
                <td><form:label path="userName"> User Name</form:label></td>
                <td><form:input path="userName"/></td>
            </tr>
            <tr>
                <td><form:label path="userPass"> Password</form:label></td>
                <td><form:password path="userPass"/></td>
            </tr>
            <tr>
                <td><form:label path="userGender"> Sex</form:label></td>
                <td>
                    <form:radiobutton path="userGender" label="Male" value="M"/>
                    <form:radiobutton path="userGender" label="Female" value="F"/>
                </td>
            </tr>
            <tr>
                <td><form:label path="userNationality"> Nationality</form:label></td>
                <td>
                    <form:select path="userNationality">
                        <form:option value="NONE" label="Select"/>
                        <form:options items="${nationality}"/>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="userComment"> Comment</form:label></td>
                <td><form:textarea path="userComment" cols="30" rows="5"/></td>
            </tr>
            <tr>
                <td><form:label path="receivePaper"> Receive Paper?</form:label></td>
                <td><form:checkbox path="receivePaper"/></td>
            </tr>
            <tr>
                <td><form:label path="knownFramework"> Known Java Web Framework</form:label></td>
                <td><form:checkboxes path="knownFramework" items="${webJavaFramework}"/></td>
            </tr>
            <tr>
                <td colspan = "2">
                    <input type = "submit" value = "Submit"/>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
