<%@ page import="com.example.Employee" %>

<jsp:useBean id="employee" class="com.example.Employee" scope="request" />

<jsp:setProperty name="employee" property="*" />

<!DOCTYPE html>
<html>
<head>
    <title>Employee Details</title>
</head>
<body>

    <h1>Employee Information</h1>

    <p>
        <b>Employee Name:</b>
        <jsp:getProperty name="employee" property="employeeName" />
    </p>

    <p>
        <b>Employee ID:</b>
        <jsp:getProperty name="employee" property="employeeId" />
    </p>

</body>
</html>