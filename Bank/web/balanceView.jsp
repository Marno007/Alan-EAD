<%-- 
    Document   : balanceView
    Created on : 04-Oct-2018, 18:45:30
    Author     : Keith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Details</title>
    </head>
    <body>
        <h1>User Details</h1>

        <c:choose> 

            <c:when test = "${account == null}">
                <p> Unrecognised Account Number <a href="index">Go Back</a></p>
            </c:when>

            <c:otherwise> 
                <c:choose>
                    <c:when test = "${account.balance < 0 }">
                        <img src="assets/images/deadman.jpg">
                        <p>${account.lastName} We know where you live. Pay us the ${account.blanace} you owe us before it is too late!</p>
                    </c:when>

                    <c:when test = "${account.balance > 10000  }">
                        <img src ="assets/images/boat.jpg">
                        <p>It is an honor to serve you ${account.firstName}  ${account.lastName}</p>
                        <p> Since you are our most valued customer we wud like to offer a fraction of ur ${account.balance} on our boat.</p> 
                    </c:when>



                    <c:otherwise >
                        <img src ="assets/images/money.jpg">
                    <tr>
                        <td>Account ID: ${account.firstName}</td>
                        <td>First Name: ${account.lastName}</td>
                        <td>Last Name: ${account.accountNumber}</td>
                        <td>Balance: ${account.balance}</td>
                    </tr>
                </c:otherwise>

            </c:choose>
        </c:otherwise>      
    </c:choose>



</body>
</html>
