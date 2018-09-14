<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin Registration </title>
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
   
    <ul class="nav navbar-nav navbar-right">
      
          
          <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        
        </ul>
      </li>
    </ul>
  </div>
    </div>
</nav>      
      
<div class="container">
  <div class="jumbotron">
    <h1>Sign up</h1>
    <p>Fill the following details</p>
    
      <form class="form-group" action="AdminRegisterController" method="post">
 
<div class="form-row">
  <div class="form-group col-md-6">
    <label for="name">Name:</label>
  <input type="text"  class="form-control" name="name"  required placeholder="Full name"><br>
  </div>  
 <div class="form-group col-md-6">
  <label for="password">Password:</label>
     <input type="password"  class="form-control" name="password" required placeholder="Password"><br>    
     </div> </div>
       <label for="id">AdminID:</label>
  <input type="text"  class="form-control" name="aid" required placeholder="ID starts with adm"><br>
        <label for="email">Email:</label>
  <input type="email"  class="form-control" name="email" required placeholder="Email"><br>
  
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
  
  
 


  
  
  <label for="gender">Gender:</label>
  <select class="form-control" id="gender" name="gender">
      <option>Male</option>
      <option>Female</option>
      </select><br>
      
  
  
      
 
  
  <button type="submit" class="btn btn-primary" name="button1">Submit</button>
          
  
  
<button type="reset" class="btn btn-success" name="button2">reset</button>
      
      
</form>
    
  </div>
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