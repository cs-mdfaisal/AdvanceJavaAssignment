<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  session="false"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body bgcolor="pink">

	<%@ include file="header.html" %>
	<%
		HttpSession session = request.getSession(false);
		if(session!=null)
		{	%>
			<p>Dear <%=session.getAttribute("user") %> Choose your favourite products</p>
			
	<% 	}else {	%>
			
			<h2 style="color:red;">Sorry! session expired</h2>
			
	<%	} %>
	
	<%@ include file="footer.html" %>

	
</body>
</html>