<%--
  Created by IntelliJ IDEA.
  User: Dandy_F122
  Date: 28/12/2018
  Time: 8:55
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>


    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

    <%-- This is for all theme related css and js using spring framework --%>
    <spring:url value="/resources/js/scripts.js" var="scriptJs" />
    <script src="${scriptJs}"></script>
    <spring:url value="/resources/css/styles.css" var="styleCss" />
    <style src="${styleCss}"></style>
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
                <td><form:label path="joinDate"> Join Date</form:label></td>
                <td>
                    <form:input type="text" id="joinDate" name="joinDate" path="joinDate" placeholder="MM/dd/yyyy"/>
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
