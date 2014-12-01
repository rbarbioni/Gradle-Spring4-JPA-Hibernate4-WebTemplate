<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
	<h2>User Controller</h2>

	<form:form method="post" action="user/insert"  >

		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="user-instance.name" /></td>
			</tr>
			<tr>
				<td>E-Mail</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Password </td>
				<td><form:input path="password" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>
		</table>

	</form:form>

	<c:if test="${not empty users}">

		<ul>
			<c:forEach var="listValue" items="${users}">
				<li>${listValue.name}</li>
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>