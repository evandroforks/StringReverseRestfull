<html>
<head>
    <title>String Reversing</title>
</head>
<body>
    <form action="StringReverse" method="post">
        String to reverse: <input type="text" size="100" name="inputString"/>
        &nbsp;&nbsp;
        <input type="submit" value="Reverse it!" />
    </form>
    <h:outputText rendered="${empty reversedString}">
        &nbsp;&nbsp;
        Reversed String: ${reversedString}
    </h:outputText>
</body>
</html>
