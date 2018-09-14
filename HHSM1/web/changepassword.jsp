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
    <ul class="nav navbar-nav">
      <li class="active"><a href="homePage.jsp">Home</a></li>
      
       
     
      <li><a href="Leave.jsp">Leave</a></li>
      
      
     
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
       <div class="container">
		<div class="jumbotron  ">
			<!-- col-sm-4 -->


			
			<p>Change your password</p>

			<form class="form-group" action="<%=request.getContextPath()%>/ChangepassStud" method="post">
                            <input type="hidden" name="sid">
				<label for="username">Old Password:</label> <input type="password"
					class="form-control" required name="password" placeholder="Old Password">
                                <label for="username">New Password:</label> <input type="text"
					class="form-control" required name="newpassword" placeholder="New Password">
				<label for="pass">Retype Password:</label> <input type="password"
					class="form-control" required name="retypepassword" placeholder="RetypePassword">
			
				<button type="submit" class="btn btn-success" name="button1">Change</button>
				<button type="reset" class="btn btn-default" name="button2">Reset</button>

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