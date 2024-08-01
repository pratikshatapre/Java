<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Calculator</h1>
<form action="CalculatorServlet1" method="post">
First No:<input type="number" name="num1"/><br/><br/>

Secound No:<input type="number" name="num2"/></br/></br>
select the option:<br/>
<input type="radio" name="operation" value="add">Addition
<input type="radio" name="operation" value="sub">Substraction
<input type="radio" name="operation" value="mult">Multiplication
<input type="radio" name="operation" value="div">Divition
<input type="radio" name="operation" value="mod">Modulus<br/></br>

<input type="submit" value="Calculator"/>
<input type="reset" value="Reset"/>

</form>
<%
String result=(String) request.getAttribute("result");
if(result !=null){
	out.println("<p style='color:red'>Addition is :"+result+"</p>");
	out.println("<p style='color:blue'>Substraction is :"+result+"</p>");
	out.println("<p style='color:green'>Multiplication is :"+result+"</p>");
	out.println("<p style='color:blue'>Divistion is :"+result+"</p>");
	out.println("<p style='color:green'>Modulus is :"+result+"</p>");

}
%>

</body>
</html>