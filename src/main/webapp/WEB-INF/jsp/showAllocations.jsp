<!DOCTYPE HTML>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Welcome</title>
   </head>
   <body>
   <table>
    <tr>
        <th>Employee Name</th>
        <th>Project Name</th>
        <th>Role Title</th>
    </tr>
    <c:forEach items="${allocationList}" var="allocations">
        <tr>
            <td>${allocations.employeeId}</td>
            <td>${allocations.projectId}</td>
            <td>${allocations.roleId}</td>
        </tr>
    </c:forEach>
</table>	
	<p><input type="button" id="homeButton" name="homeButton" value="Home"> 
   </body>
</html>