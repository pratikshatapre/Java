<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> Login to Check Account Balance</h2>
<form action="LoginServlet5" method="post">
<input type="text" name="username"/>
<input type="password" name="password"/>
<input type="hidden" name="sessionid" value="1234567890"/>
<input type="submit"/>
</form>
<%  
String m=(String)request.getAttribute("message");
if(m!=null){
	out.println(m);
}


%>
</body>
</html>