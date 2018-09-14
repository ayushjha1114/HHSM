package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Hostel Homepage</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("    <script type=\"text/javascript\" src=\"main.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body  style=\"background-color:#d6d8db\">\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>                        \n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"homePage.jsp\">Welcome</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"homePage.jsp\">Home</a></li>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("    </ul>\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      <li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("      <li><a href=\"Registration.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Register</a></li>\n");
      out.write("  \n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("          <br>\n");
      out.write(" \n");
      out.write("\n");
      out.write("<!--    \t<div class=\"container\">\n");
      out.write("\t\t<section>\n");
      out.write("\t\t\t<div class=\"page-header\" id=\"gallery\">\n");
      out.write("  \t\t\t\t<h2>Gallery</h2>\n");
      out.write("  \t\t\t</div>\n");
      out.write("\n");
      out.write("  \t\t\t<div class=\"carousel slide\" id=\"slider\" data-ride=\"carousel\">\n");
      out.write("  \t\t\t\t<ol class=\"carousel-indicators\">\n");
      out.write("  \t\t\t\t\t<li data-target=\"#slider\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("  \t\t\t\t\t<li data-target=\"#slider\" data-slide-to=\"1\"></li>\n");
      out.write("  \t\t\t\t\t<li data-target=\"#slider\" data-slide-to=\"2\"></li>\n");
      out.write("  \t\t\t\t\t\n");
      out.write("  \t\t\t\t</ol>\n");
      out.write("  \t\t\t\t<div class=\"carousel-inner\">\n");
      out.write("  \t\t\t\t\t<div class=\"item active\">\n");
      out.write("  \t\t\t\t\t\t<img  src=\"a.jpg\" alt=\"Text of the image\" class=\"aer\" style=\"height:380px\">\n");
      out.write("  \t\t\t\t\t\t\n");
      out.write("  \t\t\t\t\t</div>\n");
      out.write("  \t\t\t\t\t<div class=\"item\">\n");
      out.write("  \t\t\t\t\t\t<img src=\"bb.jpg\" alt=\"Text of the image\" class=\"aer\" style=\"height:380px\">\n");
      out.write("  \t\t\t\t\t\t\n");
      out.write("  \t\t\t\t\t</div>\n");
      out.write("  \t\t\t\t\t<div class=\"item\">\n");
      out.write("  \t\t\t\t\t\t<img  src=\"c.jpg\" alt=\"Text of the image\" class=\"aer\" style=\"height:380px\">\n");
      out.write("  \t\t\t\t\t\t\n");
      out.write("  \t\t\t\t\t</div>\n");
      out.write("  \t\t\t\t\t\n");
      out.write("\n");
      out.write("  \t\t\t\t</div> End Carousel inner \n");
      out.write("  \t\t\t\t<a href=\"#slider\" class=\"left carousel-control\" data-slide=\"prev\">\n");
      out.write("  \t\t\t\t\t<span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("  \t\t\t\t</a>\n");
      out.write("  \t\t\t\t<a href=\"#slider\" class=\"right carousel-control\" data-slide=\"next\">\n");
      out.write("  \t\t\t\t\t<span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("  \t\t\t\t</a>\n");
      out.write("  \t\t\t</div> End Carousel \n");
      out.write("\n");
      out.write("\t\t</section>\n");
      out.write("\t</div>-->\n");
      out.write("    \n");
      out.write("<div class=\"container\">\n");
      out.write("    <section>\n");
      out.write("    <div class=\"page-header\" id=\"gallery\">\n");
      out.write("  \t\t\t\t<h2>About</h2>\n");
      out.write("  \t\t\t</div>\n");
      out.write("\n");
      out.write("        <ul type=\"disc\" class=\"details\">\n");
      out.write("    <li>The Hostel service provides \"7\" hostels for his students 2 hostels for girls and 5 hostels for boys.</li>\n");
      out.write("    <li>24 hour generator facility to beat power cuts</li>\n");
      out.write("    <li>Hot water and cold water supply is available according to seasonal needs</li>\n");
      out.write("    <li>Common room facilities with Indoor games like table Tennis, Chess, Carom etc. and Television set with cable connection.</li>\n");
      out.write("    <li>Well equipped modern mess facility to provide nourishing and quality food to the resident boys and girls separately. [Only Vegetarian food is served in hostel mess]</li>\n");
      out.write("    <li>The hostel rooms are fully furnished with bed, study table, chairs and fans etc.</li>\n");
      out.write("    <li>The entire campus is quite safe and secure. Entry to the campus is controlled by security staff at security gate itself.</li>\n");
      out.write("</ul>\n");
      out.write("    </section>\n");
      out.write("    </div>\n");
      out.write("          \n");
      out.write("          <div class=\"container\">\n");
      out.write("    <section>\n");
      out.write("    <div class=\"page-header\" id=\"Contact Us\">\n");
      out.write("  \t\t\t\t<h2>Contact Us</h2>\n");
      out.write("  \t\t\t</div>\n");
      out.write(" <div class=\"col-md-8 col-xs-12 col-sm-6 col-lg-8\">\n");
      out.write("                         \n");
      out.write("                          <ul class=\"container details\">\n");
      out.write("                              <li><p><span class=\"glyphicon glyphicon-map-marker one\" style=\"width:50px;\"></span>5 Km Stone, (Opp. Jain Tube Co. Ltd.), Delhi-Meerut Road, Ghaziabad (U.P.) 201001</p></li>\n");
      out.write("                            <li><p><span class=\"glyphicon glyphicon-earphone one\" style=\"width:50px;\"></span>+91 8506802848</p></li>\n");
      out.write("                            <li><p><span class=\"glyphicon glyphicon-envelope one\" style=\"width:50px;\"></span>ayushjha1114@gmail.com</p></li>\n");
      out.write("                          </ul>\n");
      out.write("                      </div>\n");
      out.write("  \n");
      out.write("    </section>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("<canvas id=\"canvas\"></canvas>\n");
      out.write("\n");
      out.write("<div class=\"content\">\n");
      out.write("</div>\n");
      out.write("   <footer id=\"myFooter\">\n");
      out.write("       \n");
      out.write("        <div class=\"footer-copyright\">\n");
      out.write("            <p>&copy; 2k18 Ayush jha </p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
