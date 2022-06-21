<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<div style="border: 1px solid #ccc; padding: 5px; margin-bottom: 20px;">

	<a href="${contextPath}/welcome">Home</a> | &nbsp;

	<a href="${contextPath}/addNewEmployee">Add
		Employee</a> | <a href="${pageContext.request.contextPath}/getEmployees">Show
		Employees</a> | <u><h2 style="color: blue;">
			<a onclick="document.forms['logoutForm'].submit()">Logout</a>
		</h3></u>

	<form id="logoutForm" method="POST" action="${contextPath}/logout">
	</form>

</div>