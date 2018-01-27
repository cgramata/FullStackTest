<%-- 
    Document   : newCustomer
    Created on : Jan 25, 2018, 11:49:03 PM
    Author     : syntel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inserting New Customer</title>
    </head>
    <body>
        <form:form method="POST" commandName="newCustomer">
            <table>
                <tr>
                    <td>Customer ID: </td>
                    <td><form:input path="customerId" /></td>
                </tr>
                <tr>
                    <td>Discount Code: </td>
                    <td><form:input path="discountCode" /></td>
                </tr>
                <tr>
                    <td>Zip:  </td>
                    <td><form:input path="zip" /></td>
                </tr>
                <tr>
                    <td>Name:  </td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td>Address Line 1: </td>
                    <td><form:input path="addressLine1" /></td>
                </tr>
                <tr>
                    <td>Address Line 2:  </td>
                    <td><form:input path="addressLine2" /></td>
                </tr>
                <tr>
                    <td>City:  </td>
                    <td><form:input path="city" /></td>
                </tr>
                <tr>
                    <td>State:  </td>
                    <td><form:input path="state" /></td>
                </tr>
                <tr>
                    <td>Phone:  </td>
                    <td><form:input path="phone" /></td>
                </tr>
                <tr>
                    <td>Fax:  </td>
                    <td><form:input path="fax" /></td>
                </tr>
                <tr>
                    <td>Email:  </td>
                    <td><form:input path="email" /></td>
                </tr>
                <tr>
                    <td>Credit Limit:  </td>
                    <td><form:input path="creditLimit" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit"></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
