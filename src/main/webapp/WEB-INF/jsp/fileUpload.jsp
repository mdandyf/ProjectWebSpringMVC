<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Dandy_F122
  Date: 02/01/2019
  Time: 8:51
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>File Upload</title>
</head>
<body>
<form:form method = "POST" modelAttribute = "fileUpload"
           enctype = "multipart/form-data">
    Please select a file to upload :
    <input type = "file" name = "file" />
    <input type = "submit" value = "upload" />
</form:form>
</body>
</html>
