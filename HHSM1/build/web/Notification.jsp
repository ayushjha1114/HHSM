<%@page import="java.sql.*"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Notification</title>
  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="footer.css">
</head>
<body style="background-color:#d6d8db">

<nav class="navbar navbar-inverse">
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

      <li><a href="#">Contact us </a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
        
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
          <br>
          <div class="container">
            


            <!-- table table-striped -->
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Sid</th>
                        <th>About</th>
                        <th>Description</th>
                    </tr>
                </thead>

                <%
                    try {
                        int count = 1;
                        ResultSet rs = null;
                        String a = null;
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel", "root", "root");
                        Statement stmt = con.createStatement();

                        rs = stmt.executeQuery("select hostelname from adminregister where aid='" + session.getAttribute("admin") + "'");
                        while (rs.next()) {
                            a = rs.getString("hostelname");
                        }

                        rs = stmt.executeQuery("select sid,about,description from leav where hostelname='" + a + "'");
                        while (rs.next()) {
                %>
                <tbody>
                    <tr>
                        <td><%=count%></td>
                        <td><%=rs.getString("sid")%></td>
                        <td><%=rs.getString("about")%></td>
                        <td><%=rs.getString("description")%></td>
                    </tr>

                </tbody>
                <%
                        count++;
                    }

                %>

            </table>
           

    </div>
    <%
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    %>
         <div class="content">
</div> 
<footer id="myFooter">
       
        <div class="footer-copyright">
            <p>&copy; 2k18 Ayush jha </p>
        </div>
    </footer>
    

</body>
</html>