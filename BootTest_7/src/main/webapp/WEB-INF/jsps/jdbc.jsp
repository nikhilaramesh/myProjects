<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body text=red>
<table border=3>
       <tr>
           <th>empNo</th>
           <th>eName</th>
           <th>salary</th>
       <th>Delete??</th>
       
       </tr>
       <c:forEach items="${empList}" var="emp">
       <tr>
           <td>${emp.empNo}</td>
           <td>${emp.eName}</td>
           <td>${emp.salary}</td>
  <td><a href="deleteemp/${emp.empNo}">DeleteRecord</a></td>      
         
          </td>
       </tr>
       </c:forEach>
 </table>
