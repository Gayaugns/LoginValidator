<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<form:form method="POST" commandName="users" action="${url}">
		<table>
			<tr>
				<td>User Name :</td>
				<td><form:input path="userId" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Login"/></td>
			</tr>
		</table>
	</form:form>

</body>
</html>