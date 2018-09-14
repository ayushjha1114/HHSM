<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.ayush.dao.ViewStudent"%>
<%@page import="com.ayush.model.studmodel"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@page import="java.util.*"%>  
<!DOCTYPE html>
<html lang="en">
<head>
  <title>View Details</title>
  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="footer.css">
</head>
<body style="background-color:#d6d8db">

<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="homePage.jsp">Welcome</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
    <ul class="nav navbar-nav">
      <li class="active"><a href="homePage.jsp">Home</a></li>
      <li><a class="" href="Attendance.jsp">Attendance</a></li>

      <li><a href="ViewStudent.jsp">Registered Student </a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
        <li><a href="Notification.jsp">Notification</a></li>
    <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Welcome: <%= session.getAttribute("admin") %>
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="<%=request.getContextPath()%>/LogoutServlet">Logout</a></li>

        </ul>
        </li>
    </ul>
  </div>
    </div>
</nav>

          
          <%  

ResultSet rs = null;
                        String a = null;
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel", "root", "root");
                        Statement stmt = con.createStatement();

                        rs = stmt.executeQuery("select hostelname from adminregister where aid='" + session.getAttribute("admin") + "'");
                        while (rs.next()) {
                            a = rs.getString("hostelname");
                        }
                        
                        List<studmodel> list = ViewStudent.getAllRecords(a);  
request.setAttribute("list",list);  

%>  
          
     <div class="container">
            <h2>Basic Table</h2>

            <!-- table table-striped -->
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Sid</th>
                        <th>Student Mobile</th>
                         <th>Father Name</th>
                         <th>Father Mobile</th>
                         <th>Mother Name</th>
                         <th>Mother Mobile</th>
                         <th>Email</th>
                         <th>Course</th>
                         <th>Branch</th>
                         <th>Gender</th>
                         <th>Year</th>
                         <th>Percent</th>
                       
                    </tr>
                </thead>
                <%int count=1;%>
                 <tbody>
                     <c:forEach items="${list}" var="u">  
                    <tr>
                        <td><%=count%></td>
                        <td>${u.getSid()}</td>
                        <td>${u.getStudentmobno()}</td>
                        <td>${u.getFathername()}</td>
                        <td>${u.getFathermobno()}</td>
                        <td>${u.getMothername()}</td>
                        <td>${u.getMothermobno()}</td>
                        <td>${u.getEmail()}</td>
                        <td>${u.getCourse()}</td>
                        <td>${u.getBranch()}</td>
                        <td>${u.getGender()}</td>
                        <td>${u.getYear()}</td>
                        <td>${u.getPercent()}</td>
                        
                        
                    
                     </tr>
                  </c:forEach> 
                </tbody>
                 <%
                        count++;
                    

                %>
                 </table>
            

        

    </div>
          
          <div class="content">
</div>
  <footer id="myFooter">
       
        <div class="footer-copyright">
            <p>&copy; 2k18 Ayush jha </p>
        </div>
    </footer>

</body>
</html>