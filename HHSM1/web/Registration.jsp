<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>

    <title>Student registration </title>
      <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
  <link rel="stylesheet" type="text/css" href="footer.css">
    <style type="text/css">
.jumbotron {
	max-width: 500px;
	margin: 0 auto;
}
</style>
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
  </div>
    </div>
</nav>

     
<div class="container">
       
  <div class="jumbotron">
    <h1>Sign up</h1>
    <p>Fill the following details</p>
    
      <form class="form-group" action="Register" method="post">
 
<div class="form-row">
  <div class="form-group col-md-6">
    <label for="name">Name:</label>
  <input type="text"  class="form-control" name="name"  required placeholder="Full name"><br>
  </div>  
 <div class="form-group col-md-6">
   <label for="id">StudentID:</label>
  <input type="text"  class="form-control" name="sid" required placeholder="ID starts with stu"><br>    
     </div> </div>
      
        <label for="email">Email:</label>
  <input type="email"  class="form-control" name="email" required placeholder="Email"><br>
   <label for="id">Mobile No.:</label>
  <input type="text"  class="form-control" name="studentmobno" required placeholder="MobileNo"><br>
  
  
  <label for="roll">Father's Name:</label>
  <input type="text"  class="form-control" name="fathername" required placeholder="Father's Name"><br>
  
  <label for="roll">Father's Mobile No.:</label>
  <input type="text"  class="form-control" name="fathermobno" required placeholder="Father's Mobile No."><br>
  
  <label for="roll">Mother's Name:</label>
  <input type="text"  class="form-control" name="mothername" required placeholder="Mother's Name"><br>
  
  <label for="roll">Mother's Mobile No.:</label>
  <input type="text"  class="form-control" name="mothermobno" required placeholder="Mother's Mobile No."><br>
  
   
  <label for="roll">Roll No.:</label>
  <input type="text"  class="form-control" name="rollno" required placeholder="Roll no."><br>
 

  <label for="course">Course:</label>
  <select class="form-control" id="course" name="course">
      <option>B.tech</option>
      <option>B.Pharma</option>
      <option>MBA</option>
      </select><br>
       
          
         
   <label for="branch">Branch:</label>
  <select class="form-control" id="branch" name="branch">
      <option>CSE</option>
      <option>IT</option>
      <option>ME</option>
      <option>CS</option>
      <option>EC</option>
      <option>EE</option>
      </select>
  
  <label for="gender">Gender:</label>
  <select class="form-control" id="gender" name="gender">
      <option>Male</option>
      <option>Female</option>
      </select><br>
      
      <label for="year">Year:</label>
  <select class="form-control" id="year" name="year">
      <option>1st</option>
      <option>2nd</option>
      <option>3rd</option>
      <option>4th</option>
      </select><br>
    
      <label for="percent">Percentage in previous semester:</label>
  <input type="text"  class="form-control" name="percent" required placeholder="Percentage e.g. 85.2"><br>
  
 
  
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