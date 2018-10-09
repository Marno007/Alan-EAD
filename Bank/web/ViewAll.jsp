<%-- 
    Document   : ViewAll
    Created on : 03-Oct-2018, 13:52:30
    Author     : Keith
--%>

     <%@page contentType="text/html" pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> All Account Details </h1>
        <table>
            
            <tr>
                <td>Account ID</td>
                <td>First Name</td>
                <td>Last Name</td>
                <td>Sort Code</td>
                
                <td>Balance</td>
            </tr>
            <c:forEach items="${accounts}" var="account">
                <tr>
                    <td>${account.accountNumber}</td>
                    <td>${account.firstName}</td>
                    <td>${account.lastName}</td>
                    <td>${account.sortCode}</td>
            <c:choose>
                <c:when test = "${account.balance < 0 }">
                    <td bgcolor="#FF0000">${account.balance}</td>
                </c:when>
                <c:otherwise >
                    <td>${account.balance}</td>
                </c:otherwise>
            </c:choose>
                </tr>
            </c:forEach>

        </table>
    </body>
</html>
