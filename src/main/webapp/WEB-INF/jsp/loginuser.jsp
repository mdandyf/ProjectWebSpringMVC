<%--
  Created by IntelliJ IDEA.
  User: Dandy_F122
  Date: 28/12/2018
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Login User</title>
</head>
<body>
    <h2>Submitted User Information</h2>
    <table>
        <tr>
            <td>Username</td>
            <td>${userName}</td>
        </tr>
        <tr>
            <td>Password</td>
            <td>${userPass}</td>
        </tr>
        <tr>
            <td>Sex</td>
            <td>${userGender}</td>
        </tr>
        <tr>
            <td>Nationality</td>
            <td>${userNationality}</td>
        </tr>
        <tr>
            <td>Comment</td>
            <td>${userComment}</td>
        </tr>
        <tr>
            <td>Subscribed to Newsletter</td>
            <td>${receivePaper}</td>
        </tr>
        <tr>
            <td>Known Java Web Framework</td>
            <td>
                <%
                    String[] knownFramework = (String[]) request.getAttribute("knownFramework");
                    int count = 0;
                    for(String framework : knownFramework) {
                        count++;
                        if(count == knownFramework.length) {
                            out.println(framework);
                        } else {
                            out.println(framework + ",");
                        }
                    }
                %>
            </td>
        </tr>
    </table>
</body>
</html>
