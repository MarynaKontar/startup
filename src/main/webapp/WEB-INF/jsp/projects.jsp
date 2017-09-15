<%--
  Created by IntelliJ IDEA.
  User: Guillaume Gingembre
  Date: 15/09/2017
  Time: 07:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>Projects list</title>
</head>
<body>
<table>
    <c:forEach var="project" items="${projet}">
        <tr>
            <td>
                    ${project}
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
