package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class adminDash_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title> Admin Dashboard- Colombo Tech Camp</title>\n");
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
      out.write("    background: #222f3e !important;\n");
      out.write("}\n");
      out.write("#footer h5{\n");
      out.write("  padding-left: 10px;\n");
      out.write("    border-left: 3px solid #eeeeee;\n");
      out.write("    padding-bottom: 6px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    color:#ffffff;\n");
      out.write("}\n");
      out.write("#footer a {\n");
      out.write("    color: #ffffff;\n");
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
      out.write("#background-image:url(\"back1.jpg\")\n");
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
      out.write("input[type=text], select, textarea {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 3px 5px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  resize: vertical;\n");
      out.write("  align-self: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("  padding: 12px 12px 12px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("[type=\"date\"] {\n");
      out.write("  background:#fff url(https://cdn1.iconfinder.com/data/icons/cc_mono_icon_set/blacks/16x16/calendar_2.png)  97% 50% no-repeat ;\n");
      out.write("}\n");
      out.write("[type=\"date\"]::-webkit-inner-spin-button {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("[type=\"date\"]::-webkit-calendar-picker-indicator {\n");
      out.write("  opacity: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* custom styles */\n");
      out.write("\n");
      out.write("\n");
      out.write("input {\n");
      out.write("  border: 1px solid #c4c4c4;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  background-color: #fff;\n");
      out.write("  padding: 3px 5px;\n");
      out.write("  \n");
      out.write("  \n");
      out.write("}\n");
      out.write("    \n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- Header Start-->\n");
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
      out.write("<!-- Header -->\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("   <div class=\"container\"> <h1> Hi! Welcome to Admin Dashboard</h1>\n");
      out.write("\n");
      out.write("  <div class=\"card\">\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <h4 class=\"card-title\">Please be careful when do operations.</h4>\n");
      out.write("    <a href=\"logout.jsp\"> <button type=\"button\" class=\"btn btn-danger\" style=\"font-family:Poppins;font-size: 16px;\">Logout</button></a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("   </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\" >\n");
      out.write(" \n");
      out.write("  <div class=\"container\">\n");
      out.write("  \n");
      out.write("  <br>\n");
      out.write("  <!-- Nav tabs -->\n");
      out.write("  <ul class=\"nav nav-tabs\" role=\"tablist\">\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link active\" data-toggle=\"tab\" href=\"#home\">Members</a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" data-toggle=\"tab\" href=\"#booking\">Bookings</a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" data-toggle=\"tab\" href=\"#menu2\">Messages</a>\n");
      out.write("    </li>\n");
      out.write("  </ul>\n");
      out.write("\n");
      out.write("  <!-- Tab panes -->\n");
      out.write("  <div class=\"tab-content\">\n");
      out.write("    <div id=\"home\" class=\"container tab-pane active\"><br>\n");
      out.write("     <br>\n");
      out.write("      ");

        try{

        String n =(String)session.getAttribute("mail");
        //out.println(n);

                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spaces","root","");
                 Statement stmt = con.createStatement();

                ResultSet rs = stmt.executeQuery("select * from members");
          
          while(rs.next()){
      out.write("\n");
      out.write("          \n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                   \n");
      out.write("                    <label for=\"name\"><b>Name</b></label> <label for=\"name1\">");
 out.println(rs.getString("name")); 
      out.write("</label><br>\n");
      out.write("                    <label for=\"email\"><b>Email</b></label> <label for=\"email1\">");
 out.println(rs.getString("email")); 
      out.write("</label><br>\n");
      out.write("                    <label for=\"address\"><b>Address</b></label> <label for=\"address1\">");
 out.println(rs.getString("address")); 
      out.write("</label><br>\n");
      out.write("                    <label for=\"name\"><b>Oraganization</b></label> <label for=\"email1\">");
 out.println(rs.getString("organization")); 
      out.write("</label><br>\n");
      out.write("                    <form action=\"deleteMember\" method=\"post\">\n");
      out.write("                        <input type=\"text\" name=\"email\" value=\"");
 out.println(rs.getString("email")); 
      out.write("\" hidden>\n");
      out.write("                     <button type=\"submit\" class=\"btn btn-danger\" style=\"font-family:Poppins;font-size: 16px;\">Delete</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");

          }


        }catch(Exception e){}

          
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"booking\" class=\"container tab-pane fade\"><br>\n");
      out.write("        ");

        try{

        String n =(String)session.getAttribute("mail");
        //out.println(n);

                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spaces","root","");
                 Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery("select * from bookings");
                
              
          while(rs.next()){
               String email = rs.getString("email");
                Statement stmtM = con.createStatement();
                ResultSet rsM = stmtM.executeQuery("select * from members where email = '"+email+"'");
                rsM.next();

      out.write("\n");
      out.write("      <br>\n");
      out.write("        <div class=\"card\">\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                       <h4 class=\"card-title\" style=\"font-family:poppins;\"> <label for=\"memberid\"> ");
 out.println(rs.getString("id")); 
      out.write("</label><br> </h4> \n");
      out.write("                       <label for=\"name\"><b>Name</b></label> <label for=\"name1\">");
 out.println(rsM.getString("name")); 
      out.write("</label><br>\n");
      out.write("                      \n");
      out.write("                       <label for=\"email\"><b>Email</b></label> <label for=\"email1\">");
 out.println(rsM.getString("email")); 
      out.write("</label><br>\n");
      out.write("                       <label for=\"address\"><b>Address</b></label> <label for=\"address1\">");
 out.println(rsM.getString("address")); 
      out.write("</label><br>\n");
      out.write("                       <label for=\"name\"><b>Oraganization</b></label> <label for=\"email1\">");
 out.println(rsM.getString("organization")); 
      out.write("</label><br>\n");
      out.write("                       <label for=\"producttype\"><b>Product Type</b></label> <label for=\"producttype1\">>");
 out.println(rs.getString("type")); 
      out.write("</label><br>\n");
      out.write("                       <label for=\"date\"><b>Date</b></label> <label for=\"date1\">");
 out.println(rs.getString("date")); 
      out.write("</label><br>\n");
      out.write("                      <label for=\"service\"><b>Prepaid Services</b></label> <label for=\"service1\">Prepaid Service</label><br>\n");
      out.write("                      \n");
      out.write("                       <form action=\"cancell\" method=\"get\">\n");
      out.write("                            <input name=\"id\" type=\"text\" value=\"");
out.println( rs.getString("id")); 
      out.write("\" hidden>\n");
      out.write("                            <input name=\"role\" type=\"text\" value=\"");
out.println( (String)session.getAttribute("role")); 
      out.write("\" >\n");
      out.write("                             <input type=\"submit\" value=\"Delete\" class=\"btn btn-danger\" style=\"font-family:Poppins;font-size: 18px;\">\n");
      out.write("                   \n");
      out.write("                      </form>\n");
      out.write("               </div>\n");
      out.write("        </div>\n");
      out.write("             ");

          }


        }catch(Exception e){}

          
      out.write("\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"menu2\" class=\"container tab-pane fade\"><br>\n");
      out.write("      <br>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                        <h4 class=\"card-title\" style=\"font-family:poppins;\"> <label for=\"memberid\">01</label><br> </h4> \n");
      out.write("                        <label for=\"cname\"><b>Name</b></label> <label for=\"cname1\">Navod</label><br>\n");
      out.write("                        <label for=\"cemail\"><b>Email</b></label> <label for=\"cemail1\">navodbk@gmail.com</label><br>\n");
      out.write("                        <label for=\"cmessege\"><b>Messege</b></label> <label for=\"cmessege1\">Hi, can you please send some quotations </label><br>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-success\" style=\"font-family:Poppins;font-size: 16px;\">Send Reply</button> \n");
      out.write("                        <button type=\"button\" class=\"btn btn-danger\" style=\"font-family:Poppins;font-size: 16px;\">Delete</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("      <br>\n");
      out.write("      <div class=\"card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                        <h4 class=\"card-title\" style=\"font-family:poppins;\"> <label for=\"memberid\">02</label><br> </h4> \n");
      out.write("                        <label for=\"cname\"><b>Name</b></label> <label for=\"cname1\">Manuja</label><br>\n");
      out.write("                        <label for=\"cemail\"><b>Email</b></label> <label for=\"cemail1\">manuja@gmail.com</label><br>\n");
      out.write("                        <label for=\"cmessege\"><b>Messege</b></label> <label for=\"cmessege1\">Hello, Do you serve on poya days too?</label><br>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-success\" style=\"font-family:Poppins;font-size: 16px;\">Send Reply</button> \n");
      out.write("                        <button type=\"button\" class=\"btn btn-danger\" style=\"font-family:Poppins;font-size: 16px;\">Delete</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("              <br>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Header -->\n");
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
      out.write("          <img src=\"logoF.jpeg\" alt=\"logoW\" style=\"width:250px;\">\n");
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
      out.write("          <p class=\"h6\">© All right Reversed. </p>\n");
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
