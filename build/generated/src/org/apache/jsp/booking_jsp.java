package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class booking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Bookings- Colombo Tech Camp</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("  <link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"apple-touch-icon.png\">\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"favicon-32x32.png\">\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"favicon-16x16.png\">\n");
      out.write("<link rel=\"manifest\" href=\"/site.webmanifest\">\n");
      out.write("<link rel=\"icon\" href=\"favicon-16x16.png\" type=\"image/gif\" sizes=\"16x16\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("    #footer {\n");
      out.write("    background:   #000c66;\n");
      out.write("}\n");
      out.write("#footer h5{\n");
      out.write("  padding-left: 10px;\n");
      out.write("    border-left: 3px solid #eeeeee;\n");
      out.write("    padding-bottom: 6px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    color:#ffffff;\n");
      out.write("}\n");
      out.write("#footer a {\n");
      out.write("    color:  #000c66;\n");
      out.write("    text-decoration: none !important;\n");
      out.write("    background-color: transparent;\n");
      out.write("    -webkit-text-decoration-skip: objects;\n");
      out.write("}\n");
      out.write("#footer ul.social li{\n");
      out.write("  padding: 3px 0;\n");
      out.write("}\n");
      out.write("#footer ul.social li a i {\n");
      out.write("    margin-right: 5px;\n");
      out.write("  font-size:25px;\n");
      out.write("  -webkit-transition: .5s all ease;\n");
      out.write("  -moz-transition: .5s all ease;\n");
      out.write("  transition: .5s all ease;\n");
      out.write("}\n");
      out.write("#footer ul.social li:hover a i {\n");
      out.write("  font-size:30px;\n");
      out.write("  margin-top:-10px;\n");
      out.write("}\n");
      out.write("#footer ul.social li a,\n");
      out.write("#footer ul.quick-links li a{\n");
      out.write("  color:#ffffff;\n");
      out.write("}\n");
      out.write("#footer ul.social li a:hover{\n");
      out.write("  color:#eeeeee;\n");
      out.write("}\n");
      out.write("#footer ul.quick-links li{\n");
      out.write("  padding: 3px 0;\n");
      out.write("  -webkit-transition: .5s all ease;\n");
      out.write("  -moz-transition: .5s all ease;\n");
      out.write("  transition: .5s all ease;\n");
      out.write("}\n");
      out.write("#footer ul.quick-links li:hover{\n");
      out.write("  padding: 3px 0;\n");
      out.write("  margin-left:5px;\n");
      out.write("  font-weight:700;\n");
      out.write("}\n");
      out.write("#footer ul.quick-links li a i{\n");
      out.write("  margin-right: 5px;\n");
      out.write("}\n");
      out.write("#footer ul.quick-links li:hover a i {\n");
      out.write("    font-weight: 700;\n");
      out.write("}\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("@media (max-width:767px){\n");
      out.write("  #footer h5 {\n");
      out.write("    padding-left: 0;\n");
      out.write("    border-left: transparent;\n");
      out.write("    padding-bottom: 0px;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("section {\n");
      out.write("    padding: 60px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form {\n");
      out.write("  font-family: poppins;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Full-width input fields */\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 10px;\n");
      out.write("  margin: 5px 0 22px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: none;\n");
      out.write("  background:white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text]:focus, input[type=password]:focus {\n");
      out.write("  background-color: #ecf0f1;\n");
      out.write("  outline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add a blue text color to links */\n");
      out.write("a {\n");
      out.write("  color: dodgerblue;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Set a style for the submit button */\n");
      out.write(".registerbtn {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("  padding: 16px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  width: 100%;\n");
      out.write("  opacity: 0.9;\n");
      out.write("  border-radius:4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".registerbtn:hover {\n");
      out.write("  opacity: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    \n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- Header Start-->\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-sm  navbar-light bg-light\">\n");
      out.write("  <!-- Brand/logo -->\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("    <img src=\"logoF.jpeg\" alt=\"logo\" style=\"width:150px;\">\n");
      out.write("  </a>\n");
      out.write("  \n");
      out.write("  <!-- Links -->\n");
      out.write("  <ul class=\"navbar-nav ml-auto\">\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"services.html\">Services</a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"workspaces.html\">Workspaces</a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"event.html\">Events</a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item dropdown\">\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("       Membership\n");
      out.write("      </a>\n");
      out.write("      <div class=\"dropdown-menu\">\n");
      out.write("        <a class=\"dropdown-item\" href=\"signin.html\">Login</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"register.html\">New Member</a>\n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("     <li class=\"nav-item dropdown\">\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("        More\n");
      out.write("      </a>\n");
      out.write("      <div class=\"dropdown-menu\">\n");
      out.write("        <a class=\"dropdown-item\" href=\"aboutus.html\">Who We Are</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"partners.html\">Our Partners</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"contactus.html\">Contact</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"privacy.html\">Privacy Policy</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"blog.html\">Blog</a>\n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"#\"></a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"#\"></a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"#\"></a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"#\"></a>\n");
      out.write("    </li><li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"#\"></a>\n");
      out.write("    </li>\n");
      out.write("  </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Header -->\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("\n");
      out.write("          <img style=\"height: 300px;width:200\" src=\"book.jpg\">\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("         \n");
      out.write("            <br>\n");
      out.write("            <h1> Hi! ");

        try{

        String n =(String)session.getAttribute("mail");
        //out.println(n);

                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spaces","root","");
                 Statement stmt = con.createStatement();

                ResultSet rs = stmt.executeQuery("select name from members where email = '"+n+"'");

          rs.next();
          String name = rs.getString("name");

          out.println(name);



        }catch(Exception e){}

        
      out.write(" It's time to get into comfort</h1> \n");
      out.write("        <br>\n");
      out.write("        <a href=\"logout.jsp\" ><button class=\"btn btn-danger\">Logout</button></a>\n");
      out.write("        <br><br>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("              <div class=\"card-columns\">\n");
      out.write("\n");
      out.write("              <div class=\"card bg-light\"  style=\"width:800px\">\n");
      out.write("              <div class=\"card-body text-left\">\n");
      out.write("              <h4 class=\"card-title\" style=\"font-family:poppins;\">Create New Booking</h4>\n");
      out.write("              <p class=\"card-text\" style=\"font-size:18px; font-family:poppins;\">Book your favourite hot desk, lounge pass, office or event venue.</p>\n");
      out.write("              \n");
      out.write("              <a href=\"bookingoffice.jsp\"> <button type=\"button\" class=\"btn btn-info\" style=\"font-family:Poppins;font-size: 20px;\" >Book Now</button></a>\n");
      out.write("             </div></div></div>    <br>\n");
      out.write("              <div class=\"card-columns\">\n");
      out.write("\n");
      out.write("              <div class=\"card bg-light\"  style=\"width:800px\">\n");
      out.write("               <div class=\"card-body text-left\">\n");
      out.write("              <h4 class=\"card-title\" style=\"font-family:poppins;\">My Bookings</h4>\n");
      out.write("               <p class=\"card-text\" style=\"font-size:18px; font-family:poppins;\">View the bookings that you have done already</p>\n");
      out.write("             \n");
      out.write("               <a href=\"bookingview.jsp\" <button type=\"button\" class=\"btn btn-info\" style=\"font-family:Poppins;font-size: 20px;\">View Now</button></a>\n");
      out.write("              </div></div></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Header -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("  <section id=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row \">\n");
      out.write("        <div class=\"col-xs-12 col-sm-4 col-md-4\">\n");
      out.write("          <h5>Colombo Tech Camp Inc,</h5>\n");
      out.write("          <p style=\"font-size:16px; font-family:poppins;color: white\">179,<br> Galle Road,<br> Colombo 03,<br> SriLanka<br>\n");
      out.write("+ 94 77 854 2535<br>\n");
      out.write("hello@colombotechcamp.lk</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"col-xs-12 col-sm-4 col-md-4\">\n");
      out.write("          <h5>Support</h5>\n");
      out.write("          <ul class=\"list-unstyled quick-links\">\n");
      out.write("            <li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>Home</a></li>\n");
      out.write("            <li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>About</a></li>\n");
      out.write("            <li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>FAQ</a></li>\n");
      out.write("            <li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>Get Started</a></li>\n");
      out.write("            <li><a href=\"https://wwwe.sunlimetech.com\" title=\"Design and developed by\"><i class=\"fa fa-angle-double-right\"></i>Imprint</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("           \n");
      out.write("        <div class=\"col-xs-12 col-sm-4 col-md-4\">\n");
      out.write("          <img src=\"logoF.jpeg\" alt=\"logo\" style=\"width:250px;\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-5\">\n");
      out.write("          <ul class=\"list-unstyled list-inline social text-center\">\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"https://www.fiverr.com/share/qb8D02\" target=\"_blank\"><i class=\"fa fa-envelope\"></i></a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("      </div>  \n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-2 text-center text-white\">\n");
      out.write("          <p>Colombo Tech Camp Inc,</u> is a member of Teddy Inc.</p>\n");
      out.write("          <p class=\"h6\">© All right Reversed.<a class=\"text-green ml-2\"</p>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("      </div>  \n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- ./Footer -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
