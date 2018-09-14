<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Dashboard</title>
  
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
      
       
     
      <li><a href="Leave.jsp">Leave</a></li>
      
      
     
      <li><a href="AllotmentForm.jsp">Allotment </a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
    <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Welcome: <%= session.getAttribute("sid") %>
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
            <li><a href="changepassword.jsp">Change Password</a></li>
          <li><a href="<%=request.getContextPath()%>/LogoutServlet">Logout</a></li>

        </ul>
        </li>
    </ul>
  </div>
    </div>
</nav>
  <br>
          <br>
          
          <br>
          <div class="container">
    <section>
    <div class="page-header" id="gallery">
  				<h2>About</h2>
  			</div>

        <ul type="disc">
    <li>The RKGIT provides "7" hostels for his students 2 hostels for girls and 5 hostels for boys.</li>
    <li>There are single seater rooms, double seater rooms as well as triple seater rooms available for students.</li>
    <li>24 hour generator facility to beat power cuts</li>
    <li>Hot water and cold water supply is available according to seasonal needs</li>
    <li>Common room facilities with Indoor games like table Tennis, Chess, Carom etc. and Television set with cable connection.</li>
    <li>Well equipped modern mess facility to provide nourishing and quality food to the resident boys and girls separately. [Only Vegetarian food is served in hostel mess]</li>
    <li>The hostel rooms are fully furnished with bed, study table, chairs and fans etc.</li>
    <li>The entire campus is quite safe and secure. Entry to the campus is controlled by security staff at security gate itself.</li>
</ul>
    </section>
    </div>
          <br>
          
          
          <div class="content">
</div>
   <footer id="myFooter">
       
        <div class="footer-copyright">
            <p>&copy; 2k18 Ayush jha </p>
        </div>
    </footer>

</body>
</html>