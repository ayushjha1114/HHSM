<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Registered Student</title>
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
                        <li><a href="#">Notification</a></li>
                        <li><a href="<%=request.getContextPath()%>/LogoutServlet">Logout</a></li>

                        <li><a>Welcome: <%=session.getAttribute("admin")%></a></li>

                    </ul>

                </div>
            </div>
        </nav>
                        <br>
                        <br>
                        
        <div class="container">
            <h2>Students are successfully approved and password has been sent successfully to their emails.</h2>

          
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