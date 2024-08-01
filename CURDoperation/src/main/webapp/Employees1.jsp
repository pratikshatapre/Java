<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> Employees</h1>
    <form action="CreateEmployee" method="post">
        Name: <input type="text" name="name" required><br><br>
        Position: <input type="text" name="position" required><br><br>
        Salary: <input type="number" name="salary" step="0.01" required><br><br>
        <input type="submit">
    </form>
</body>
</html>
