<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>

<head>
    <title>Prime Numbers</title>
</head>

<body>

    <h1>Prime Numbers</h1>

    <%
        Integer number = (Integer) request.getAttribute("number");

        ArrayList<Integer> primeNumbers =
                (ArrayList<Integer>) request.getAttribute("primeNumbers");
    %>

    <p>
        Prime numbers less than <b><%= number %></b>:
    </p>

    <table border="1" cellpadding="10">

        <tr>
            <th>S.No</th>
            <th>Prime Number</th>
        </tr>

        <%
            int count = 1;

            for (Integer prime : primeNumbers) {
        %>

        <tr>
            <td><%= count++ %></td>
            <td><%= prime %></td>
        </tr>

        <%
            }
        %>

    </table>

</body>

</html>