<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html xmlns:c="http://java.sun.com/jsp/jstl/core">
<head>
    <title>String Reversing</title>
</head>
<body>
    <form action="StringReverse" method="post">
        String to reverse: <input type="text" size="100" name="inputString"/>
        &nbsp;&nbsp;
        <input type="submit" value="Reverse it!" />
    </form>
    <c:if test="${not empty reversedString}">
        &nbsp;&nbsp;
        Reversed String: ${reversedString}
    </c:if>
</body>
</html>
