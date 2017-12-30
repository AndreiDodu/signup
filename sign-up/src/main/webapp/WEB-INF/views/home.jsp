<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Sign-up</h1>

	<form:form action="" method="post" modelAttribute="student"
		cssClass="insert">
		<table>
			<tr>
				<td><label>Username</label></td>
				<td><form:input path="userName" /></td>
			</tr>

			<tr>
				<td><label>Password</label></td>
				<td><form:input path="password" /></td>
			</tr>

			<tr>
				<td><label>First name</label></td>
				<td><form:input path="firstName" /></td>
			</tr>

			<tr>
				<td><label>Last name</label></td>
				<td><form:input path="lastName" /></td>
			</tr>

			<tr>
				<td><label>E-Mail</label></td>
				<td><form:input path="emailAddress" /></td>
			</tr>
		</table>
		<input type="submit" value="Salva" />
	</form:form>
</body>
</html>
