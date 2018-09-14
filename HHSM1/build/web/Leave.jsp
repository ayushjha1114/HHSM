<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Leave</title>
  
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

      <li><a href="#">Contact us </a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
    <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Welcome: <%= session.getAttribute("sid") %>
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
          <br>
      <div class="container">
  <div class="jumbotron">
    
    <p>Fill the following details</p>
    
      <form class="form-group" action="LeaveController" method="post">
 
 <input type="hidden"  name="sid" value="<%=session.getAttribute("sid")%>">
 
  <label for="hostelname">Hostel_name:</label> 
                    <select class="form-control"  name="hostelname" >
                        <option >Select Hostel Name:</option>
                        <option>Malviya Bhawan</option>
                        <option>Patel Bhawan</option>
                        <option>LMR</option>
                        <option>Navyug</option>
                        <option>Sarojini Bhawan</option>
                        <option>Vivekanand Bhawan</option>
                        <option>MBA</option>
                        <option>E Block</option>
                        <option>D Block</option>

                    </select><br>
  
       
        <label for="email">About:</label>
  <input type="text"  class="form-control" name="about" required placeholder="About"><br>
  
  
   
 
     
      <label for="comment">Description</label>
      <textarea class="form-control" rows="5" id="comment" name="description"></textarea><br>
      
      
  
  
      
 
  
  <button type="submit" class="btn btn-primary" name="button1">Submit</button>
          
  
  
<button type="reset" class="btn btn-success" name="button2">reset</button>
      
      
</form>
    
  </div>
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


<!--create table leav(sid varchar(50) ,
about varchar(255) ,
description varchar(255) ); -->