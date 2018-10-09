<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
    <head><title>All Routes</title></head>
    <body>
        <h1>Routes Found: 15 </h1>
        <br><br>
        <table width='1000' border='1'>
            <tr>
                <th>City</th>
                <th>Airport</th>
                <th>Code</th>
                <th>Q1</th>
                <th>Q2</th>
                <th>Q3</th>
                <th>Q4</th>
                <th>Flag</th>
                <th>Actions</th>

            </tr>
            <tr>    
                <td>city</td>
                <td>airport</td>
                <td>code</td>
                <td>q1</td>
                <td>q2</td>
                <td>q3</td>
                <td>q4</td>
                <td><img src='resources/flags/JFK.png' width="40" height="40"></img></td>
                <td><form method = "post" action="edit.jsp">
                        <input type="submit" name="btn1" value="edit"/>
                    </form> </td> 
            </tr>
            <c:forEach items="${passengers}" var="passengers">
                <tr>
                    <td>${passengers.code}</td>
                    <td>${passengers.city}</td>
                    <td>${passengers.airport}</td>
                    <td>${passengers.q1}</td>
                    <td>${passengers.q2}</td>
                    <td>${passengers.q3}</td>
                    <td>${passengers.q4}</td>
                    <td><img src="resources/flags/ATL.png" width="80" height="47" alt="ATL"/></td>
                    <td><form method = "post" action="servletEditPassenger">
                        <input type="submit" name="btn1" value="edit"/>
                    </form> </td>

                </tr>
            </c:forEach>
        </table>




        <form method="post" action="servletPassengers">
            <br>
            <input type="submit" name="btn" id="allPassengersId" value="Search For All Routes" />
        </form>
    </body>
</html>
