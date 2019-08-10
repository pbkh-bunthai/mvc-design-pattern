<!--Sample syntax-->
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<table>
    <!--Header here-->
    <tr>
        <td>...</td>
        <td>...</td>
        <td>...</td>
    </tr>
    <c:forEach var = "user" items="${users}">
        <tr>
            <td>${user.name}</td>
            <td>${user.gender}</td>
            <td>${user.role}</td>
        </tr>
    </c:forEach>
</table>