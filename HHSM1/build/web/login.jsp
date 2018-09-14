<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login Page</title>
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
      <li><a href="Registration.jsp"><span class="glyphicon glyphicon-user"></span> Register</a></li>
    </ul>
  </div>
    </div>
</nav>
    <br>
  <br>
	<div class="container">
		<div class="jumbotron  ">
			<!-- col-sm-4 -->


			<h1>Log in</h1>
			<p>Enter your Id and password</p>

			<form class="form-group" action="<%=request.getContextPath()%>/StudLogin" method="post">

				<label for="username">ID:</label> <input type="text"
					class="form-control" required name="id" placeholder="Id">
				<label for="pass">Password:</label> <input type="password"
					class="form-control" required name="password" placeholder="Password">
			<span style="color:red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></span><br>
				<button type="submit" class="btn btn-success" name="button1">Log
					in</button>
				<button type="reset" class="btn btn-default" name="button2">Reset</button>

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