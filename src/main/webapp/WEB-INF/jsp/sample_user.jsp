<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<html>
<body>

    <form method="POST" action="postUser">
        Name: <br>
        <input name="name"> <br>
        Gender: <br>
        <input name="gender"> <br>
        Role: <br>
        <input name="role"> <br>
        <input type="submit">
    </form>

    <br>

    <table border="1">
        <tr>
            <td>Name</td>
            <td>Gender</td>
            <td>Role</td>
        </tr>

        <c:forEach var = "user" items="${users}">
            <tr>
                <td>${user.name}</td>
                <td>${user.gender}</td>
                <td>${user.role}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>