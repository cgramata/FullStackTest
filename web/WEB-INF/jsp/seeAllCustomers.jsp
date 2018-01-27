<%-- 
    Document   : seeAllCustomers
    Created on : Jan 25, 2018, 11:48:31 PM
    Author     : syntel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>See All Customers</title>
    </head>
    <body>
        <h1>Page to view all customers in a table</h1>
        <c:forEach items="${listOfCustomers}" var="customer">
		${customer.name}
		<br />
	</c:forEach>
    </body>
</html>
