<%-- jSP Controller --%>
<jsp:useBean id="ob" class="com.phoenix.web.models.LoginBean" scope="request">
</jsp:useBean>

<jsp:setProperty property="username" name="ob"/>
<jsp:setProperty property="password" name="ob" param="passwd"/>


<%//controller invoking business logic method of Model LoginBean
	if(ob.isValid()){%>
	<jsp:forward page="welcome.jsp">
		<jsp:param value="Core Java" name="book1"/>
		<jsp:param value="Learn Jsp in 1 day" name="book2"/>
	</jsp:forward>
<%	}else{	%>
		<h2 style="color:red;">Invalid Login</h2>
		<jsp:include page="login.html"/>
<%	}%>