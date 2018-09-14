package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("\r\n");
      out.write("    <title>Student registration </title>\r\n");
      out.write("      <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"footer.css\">\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write(".jumbotron {\r\n");
      out.write("\tmax-width: 500px;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body style=\"background-color:#d6d8db\">\r\n");
      out.write("   \r\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>                        \r\n");
      out.write("      </button>\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"homePage.jsp\">Welcome</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("   \r\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      <li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("       \r\n");
      out.write("  <div class=\"jumbotron\">\r\n");
      out.write("    <h1>Sign up</h1>\r\n");
      out.write("    <p>Fill the following details</p>\r\n");
      out.write("    \r\n");
      out.write("      <form class=\"form-group\" action=\"Register\" method=\"post\">\r\n");
      out.write(" \r\n");
      out.write("<div class=\"form-row\">\r\n");
      out.write("  <div class=\"form-group col-md-6\">\r\n");
      out.write("    <label for=\"name\">Name:</label>\r\n");
      out.write("  <input type=\"text\"  class=\"form-control\" name=\"name\"  required placeholder=\"Full name\"><br>\r\n");
      out.write("  </div>  \r\n");
      out.write(" <div class=\"form-group col-md-6\">\r\n");
      out.write("   <label for=\"id\">StudentID:</label>\r\n");
      out.write("  <input type=\"text\"  class=\"form-control\" name=\"sid\" required placeholder=\"ID starts with stu\"><br>    \r\n");
      out.write("     </div> </div>\r\n");
      out.write("      \r\n");
      out.write("        <label for=\"email\">Email:</label>\r\n");
      out.write("  <input type=\"email\"  class=\"form-control\" name=\"email\" required placeholder=\"Email\"><br>\r\n");
      out.write("   <label for=\"id\">Mobile No.:</label>\r\n");
      out.write("  <input type=\"text\"  class=\"form-control\" name=\"studentmobno\" required placeholder=\"MobileNo\"><br>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <label for=\"roll\">Father's Name:</label>\r\n");
      out.write("  <input type=\"text\"  class=\"form-control\" name=\"fathername\" required placeholder=\"Father's Name\"><br>\r\n");
      out.write("  \r\n");
      out.write("  <label for=\"roll\">Father's Mobile No.:</label>\r\n");
      out.write("  <input type=\"text\"  class=\"form-control\" name=\"fathermobno\" required placeholder=\"Father's Mobile No.\"><br>\r\n");
      out.write("  \r\n");
      out.write("  <label for=\"roll\">Mother's Name:</label>\r\n");
      out.write("  <input type=\"text\"  class=\"form-control\" name=\"mothername\" required placeholder=\"Mother's Name\"><br>\r\n");
      out.write("  \r\n");
      out.write("  <label for=\"roll\">Mother's Mobile No.:</label>\r\n");
      out.write("  <input type=\"text\"  class=\"form-control\" name=\"mothermobno\" required placeholder=\"Mother's Mobile No.\"><br>\r\n");
      out.write("  \r\n");
      out.write("   \r\n");
      out.write("  <label for=\"roll\">Roll No.:</label>\r\n");
      out.write("  <input type=\"text\"  class=\"form-control\" name=\"rollno\" required placeholder=\"Roll no.\"><br>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("  <label for=\"course\">Course:</label>\r\n");
      out.write("  <select class=\"form-control\" id=\"course\" name=\"course\">\r\n");
      out.write("      <option>B.tech</option>\r\n");
      out.write("      <option>B.Pharma</option>\r\n");
      out.write("      <option>MBA</option>\r\n");
      out.write("      </select><br>\r\n");
      out.write("       \r\n");
      out.write("          \r\n");
      out.write("         \r\n");
      out.write("   <label for=\"branch\">Branch:</label>\r\n");
      out.write("  <select class=\"form-control\" id=\"branch\" name=\"branch\">\r\n");
      out.write("      <option>CSE</option>\r\n");
      out.write("      <option>IT</option>\r\n");
      out.write("      <option>ME</option>\r\n");
      out.write("      <option>CS</option>\r\n");
      out.write("      <option>EC</option>\r\n");
      out.write("      <option>EE</option>\r\n");
      out.write("      </select>\r\n");
      out.write("  \r\n");
      out.write("  <label for=\"gender\">Gender:</label>\r\n");
      out.write("  <select class=\"form-control\" id=\"gender\" name=\"gender\">\r\n");
      out.write("      <option>Male</option>\r\n");
      out.write("      <option>Female</option>\r\n");
      out.write("      </select><br>\r\n");
      out.write("      \r\n");
      out.write("      <label for=\"year\">Year:</label>\r\n");
      out.write("  <select class=\"form-control\" id=\"year\" name=\"year\">\r\n");
      out.write("      <option>1st</option>\r\n");
      out.write("      <option>2nd</option>\r\n");
      out.write("      <option>3rd</option>\r\n");
      out.write("      <option>4th</option>\r\n");
      out.write("      </select><br>\r\n");
      out.write("    \r\n");
      out.write("      <label for=\"percent\">Percentage in previous semester:</label>\r\n");
      out.write("  <input type=\"text\"  class=\"form-control\" name=\"percent\" required placeholder=\"Percentage e.g. 85.2\"><br>\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary\" name=\"button1\">Submit</button>\r\n");
      out.write("          \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("<button type=\"reset\" class=\"btn btn-success\" name=\"button2\">reset</button>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("</form>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("      <br>\r\n");
      out.write("      <div class=\"content\">\r\n");
      out.write("</div>\r\n");
      out.write("<footer id=\"myFooter\">\r\n");
      out.write("       \r\n");
      out.write("        <div class=\"footer-copyright\">\r\n");
      out.write("            <p>&copy; 2k18 Ayush jha </p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
