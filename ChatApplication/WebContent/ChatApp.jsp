<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Chat Application</title>
</head>
<body>
	<form action="ChatApp.jsp" method="post">
		Message<input type = "text" name="txtMessage"><br>
		<input type = "submit" value="Go">
	</form>
	<br><br>
	<hr>
	<%!String message = " ";
	String temp;
	%>
	<%
		if(request.getParameter("txtMessage")!=null){
			temp = request.getParameter("txtMessage");
			message += temp + "<br>";
		}
	%>
	<%="nikhila" %>
	<%=message %>
</body>
</html>