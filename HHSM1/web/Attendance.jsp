<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Attendance</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script
        src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="footer.css">
    </head>
    <body style="background-color:#d6d8db">

        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse"
                            data-target="#myNavbar">
                        <span class="icon-bar"></span> <span class="icon-bar"></span> <span
                            class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Welcome</a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Home</a></li>

                        <li><a href="ViewStudent.jsp">Registered Student </a></li>




                        <li><a href="#">Contact us </a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        
                        <li><a href="<%=request.getContextPath()%>/LogoutServlet">Logout</a></li>

                        <li><a>Welcome: <%=session.getAttribute("admin")%></a></li>

                    </ul>

                </div>
            </div>
        </nav>

        <div class="container">
            <h2>Basic Table</h2>


            <!-- table table-striped -->
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Room No.</th>
                        <th>Name</th>
                        <th>Attendance</th>
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

                        rs = stmt.executeQuery("select room,name from allotment where hostelname='" + a + "'");
                        while (rs.next()) {
                %>
                <tbody>
                    <tr>
                        <td><%=count%></td>
                        <td><%=rs.getInt("room")%></td>
                        <td><%=rs.getString("name")%></td>
                        <td>
                            <form method="post" action="AttendanceController">
                                <input type="hidden"  name="name" value="<%=rs.getString("name")%>">
                                <input type="hidden"  name="warden" value="<%=session.getAttribute("admin")%>">
                                <div class="radio">


                                    <label><input type="radio" name="radio<%=count%>" value="P<%=rs.getString("name")%>">Present</label>
                                </div>
                                &nbsp;
                                <div class="radio">
                                    <label><input type="radio" name="radio<%=count%>" value="A<%=rs.getString("name")%>">Absent</label>
                                </div>

                        </td>
                    </tr>

                </tbody>
                <%
                        count++;
                    }

                %>

            </table>
            <input type="hidden"  name="count" value="<%=count%>">
            <button type="submit" class="btn btn-primary"
                    style="margin-left: 50%;" name="button1">Submit</button>

        </form>

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

<!-- 
  create table malviyattend( name varchar(100) NOT NULL,
     room integer(3) PRIMARY KEY NOT NULL,
     hostelname varchar(100) ,
     attendance varchar(50) 
     ); 
   
   create table fblockattend( name varchar(100) NOT NULL,
     room integer(3) PRIMARY KEY NOT NULL,
     hostelname varchar(100),
     attendance varchar(50) 
     ); 
     create table bblockattend( name varchar(100) NOT NULL,
     room integer(3) PRIMARY KEY NOT NULL,
     hostelname varchar(100) ,
     attendance varchar(50) 
     ); 
     create table eblockattend( name varchar(100) NOT NULL,
     room integer(3) PRIMARY KEY NOT NULL,
     hostelname varchar(100) ,
     attendance varchar(50) 
     ); 
     create table dblockattend( name varchar(100) NOT NULL,
     room integer(3) PRIMARY KEY NOT NULL,
     hostelname varchar(100) ,
     attendance varchar(50) 
     ); 
     create table navyugattend( name varchar(100) NOT NULL,
     room integer(3) PRIMARY KEY NOT NULL,
     hostelname varchar(100) ,
     attendance varchar(50) 
     ); 
     create table sarojiniattend( name varchar(100) NOT NULL,
     room integer(3) PRIMARY KEY NOT NULL,
     hostelname varchar(100) ,
     attendance varchar(50) 
     ); 
      create table mbaattend( name varchar(100) NOT NULL,
     room integer(3) PRIMARY KEY NOT NULL,
     hostelname varchar(100) ,
     attendance varchar(50) 
     ); 
      create table lmrattend( name varchar(100) NOT NULL,
     room integer(3) PRIMARY KEY NOT NULL,
     hostelname varchar(100) ,
     attendance varchar(50) 
     ); 
     
-->

