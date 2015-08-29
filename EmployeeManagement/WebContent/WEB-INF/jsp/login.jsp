<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Spring 3 MVC Series - Contact Manager</title>
</head>
<body>
<h2>Contact Manager</h2>
<form:form method="post" action="loginCheck.html">
<table>
	<tr>
		<td><form:label path="firstname">First Name</form:label></td>
		<td><form:input path="firstname" /></td> 
	</tr>
	<tr>
		<td><form:label path="password">Password</form:label></td>
		<td><form:input path="password" /></td>
	</tr>
		<tr>
		<td colspan="2">
			<input type="submit" value="login"/>
		</td>
	</tr>
</table>	
	
</form:form>
</body>
</html>