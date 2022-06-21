<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@page session="false"%>
<html>
<head>
<title>Show Employees</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	      
	<h3 style="color: blue;">Show All Employees</h3>
	<ul>
		<c:forEach var="listValue" items="${employees}">
			<li>${listValue}</li>
		</c:forEach>
	</ul>
</body>
</html>