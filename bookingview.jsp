<%-- 
    Document   : bookingview
    Created on : May 18, 2020, 2:08:50 PM
    Author     : kavee
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.sql.DriverManager"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>My Bookings- Colombo Tech Camp</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

  <link rel="apple-touch-icon" sizes="180x180" href="apple-touch-icon.png">
<link rel="icon" type="image/png" sizes="32x32" href="favicon-32x32.png">
<link rel="icon" type="image/png" sizes="16x16" href="favicon-16x16.png">
<link rel="manifest" href="/site.webmanifest">
<link rel="icon" href="favicon-16x16.png" type="image/gif" sizes="16x16">



  <style type="text/css">
    #footer {
    background: #222f3e !important;
}
#footer h5{
  padding-left: 10px;
    border-left: 3px solid #eeeeee;
    padding-bottom: 6px;
    margin-bottom: 20px;
    color:#ffffff;
}
#footer a {
    color: #ffffff;
    text-decoration: none !important;
    background-color: transparent;
    -webkit-text-decoration-skip: objects;
}
#footer ul.social li{
  padding: 3px 0;
}
#footer ul.social li a i {
    margin-right: 5px;
  font-size:25px;
  -webkit-transition: .5s all ease;
  -moz-transition: .5s all ease;
  transition: .5s all ease;
}
#footer ul.social li:hover a i {
  font-size:30px;
  margin-top:-10px;
}
#footer ul.social li a,
#footer ul.quick-links li a{
  color:#ffffff;
}
#footer ul.social li a:hover{
  color:#eeeeee;
}
#footer ul.quick-links li{
  padding: 3px 0;
  -webkit-transition: .5s all ease;
  -moz-transition: .5s all ease;
  transition: .5s all ease;
}
#footer ul.quick-links li:hover{
  padding: 3px 0;
  margin-left:5px;
  font-weight:700;
}
#footer ul.quick-links li a i{
  margin-right: 5px;
}
#footer ul.quick-links li:hover a i {
    font-weight: 700;
}

#background-image:url("back1.jpg")

@media (max-width:767px){
  #footer h5 {
    padding-left: 0;
    border-left: transparent;
    padding-bottom: 0px;
    margin-bottom: 10px;
}
}
section {
    padding: 60px 0;
}

form {
  font-family: poppins;

}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 10px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background:white;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ecf0f1;
  outline: none;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
  border-radius:4px;
}

.registerbtn:hover {
  opacity: 1;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 3px 5px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
  align-self: right;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}


[type="date"] {
  background:#fff url(https://cdn1.iconfinder.com/data/icons/cc_mono_icon_set/blacks/16x16/calendar_2.png)  97% 50% no-repeat ;
}
[type="date"]::-webkit-inner-spin-button {
  display: none;
}
[type="date"]::-webkit-calendar-picker-indicator {
  opacity: 0;
}

/* custom styles */


input {
  border: 1px solid #c4c4c4;
  border-radius: 4px;
  background-color: #fff;
  padding: 3px 5px;
  
  
}
    
  </style>
</head>
<body>
<!-- Header Start-->

<nav class="navbar navbar-expand-sm  navbar-light bg-light">
  <!-- Brand/logo -->
  <a class="navbar-brand" href="index.html">
    <img src="logoF.jpeg" alt="logo" style="width:150px;">
  </a>
  
  <!-- Links -->
  <ul class="navbar-nav ml-auto">
    <li class="nav-item">
      <a class="nav-link" href="services.html">Services</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="workspaces.html">Workspaces</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="event.html">Events</a>
    </li>
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
       Membership
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="signin.html">Login</a>
        <a class="dropdown-item" href="register.html">New Member</a>
       
      </div>
    </li>
     <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        More
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="aboutus.html">Who We Are</a>
        <a class="dropdown-item" href="partners.html">Our Partners</a>
        <a class="dropdown-item" href="contactus.html">Contact</a>
          <a class="dropdown-item" href="privacy.html">Privacy Policy</a>
        <a class="dropdown-item" href="blog.html">Blog</a>
      </div>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"></a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"></a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"></a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"></a>
    </li><li class="nav-item">
      <a class="nav-link" href="#"></a>
    </li>
  </ul>
</nav>


<!-- Header -->
   
              <%
        try{

        String n =(String)session.getAttribute("mail");
        //out.println(n);

                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spaces","root","");
                 Statement stmt = con.createStatement();

                ResultSet rs = stmt.executeQuery("select * from bookings where email = '"+n+"'");
          %>
            <br>
            <h1 align="center"> My Bookings</h1>
            <br>
            <%
          while(rs.next()){%>
              <div class="container-fluid" style="font-family: poppins">

  <div class="row">
    <div class="col-sm-4">

          <img style="height: 200px;width:200" src="images/createb.png">

    </div>
    <div class="col-sm-8">
         
              <div class="card-columns">

              <div class="card bg-light"  style="width:800px">
              <div class="card-body text-left">
              


              <div class="row" style="padding-left: 10px;">
              <div class="col-25">
               <label for="ptype"><b>Product Type</b></label>
              </div>
               <div class="col-75"  align-items: right>
                   <label for="ptype1"><% out.println(rs.getString("type")); %></label>
                </div>
              </div>
              
               <div class="row" style="padding-left: 10px;">
              <div class="col-25">
               <label for="ptype"><b>Pre Ordered Services</b></label>
              </div>
               <div class="col-75">
                    

                   <%String coffee= rs.getString("coffee"); %>
                   <%String child= rs.getString("child"); %>
                   <%String vehicle= rs.getString("vehicle"); %>
                   
                   <c:set var="cf" value="<%=coffee%>"/>
                   <c:if test="${(cf == 'true')}">
                     <label for="coffee1"> <i class="fa fa-coffee " aria-hidden="true"></i> Coffee</label> 
                   </c:if>
                   
                   <c:set var="vh" value="<%=vehicle%>"/>
                   <c:if test="${(vh == 'true')}">
                     <label for="vehicle1"> <i class="fa fa-car " aria-hidden="true"></i>Car Parking</label>
                   </c:if>
                   
                     <c:set var="ch" value="<%=child%>"/>
                   <c:if test="${(ch == 'true')}">
                     <label for="vehicle1"> <i class="fa fa-child " aria-hidden="true"></i> Child Care</label><br>
                   </c:if>
                 
                </div>
              </div>

               <div class="row" style="padding-left: 10px;">
              <div class="col-25">
               <label for="pdate"><b>Date Booked</b></label>
              </div>
               <div class="col-75">
                   <label for="date2"><% out.println( rs.getString("date")); %></label>
                </div>
                
                
              </div>
                <form action="cancell" method="post">
                  <input name="id" type="text" value="<%out.println( rs.getString("id")); %>" hidden>
                   <input type="submit" value="Cancel" class="btn btn-info" style="font-family:Poppins;font-size: 18px;">
                   
              </form>
              


              
             </div></div></div>    <br>
              
               

    </div>
  </div>

</div>



    </div>
  </div>

</div>

    </div>
  </div>

</div>

<%
          }


        }catch(Exception e){}

          %>
              

         

<!-- Header -->







<!-- Footer -->
  <section id="footer">
    <div class="container">
      <div class="row ">
        <div class="col-xs-12 col-sm-4 col-md-4">
          <h5>Colombo Tech Camp Inc,</h5>
          <p style="font-size:16px; font-family:poppins;color: white">179,<br> Galle Road,<br> Colombo 03,<br> SriLanka<br>
+ 94 77 854 2535<br>
hello@colombotechcamp.lk</p>
        </div>
        
        <div class="col-xs-12 col-sm-4 col-md-4">
          <h5>Support</h5>
          <ul class="list-unstyled quick-links">
            <li><a href="https://www.fiverr.com/share/qb8D02"><i class="fa fa-angle-double-right"></i>Home</a></li>
            <li><a href="https://www.fiverr.com/share/qb8D02"><i class="fa fa-angle-double-right"></i>About</a></li>
            <li><a href="https://www.fiverr.com/share/qb8D02"><i class="fa fa-angle-double-right"></i>FAQ</a></li>
            <li><a href="https://www.fiverr.com/share/qb8D02"><i class="fa fa-angle-double-right"></i>Get Started</a></li>
            <li><a href="https://wwwe.sunlimetech.com" title="Design and developed by"><i class="fa fa-angle-double-right"></i>Imprint</a></li>
          </ul>
        </div>
           
        <div class="col-xs-12 col-sm-4 col-md-4">
          <img src="logoF.jpeg" alt="logoW" style="width:250px;">
        </div>

      </div>
      <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-5">
          <ul class="list-unstyled list-inline social text-center">
            <li class="list-inline-item"><a href="https://www.fiverr.com/share/qb8D02"><i class="fa fa-facebook"></i></a></li>
            <li class="list-inline-item"><a href="https://www.fiverr.com/share/qb8D02"><i class="fa fa-twitter"></i></a></li>
            <li class="list-inline-item"><a href="https://www.fiverr.com/share/qb8D02"><i class="fa fa-instagram"></i></a></li>
            <li class="list-inline-item"><a href="https://www.fiverr.com/share/qb8D02"><i class="fa fa-google-plus"></i></a></li>
            <li class="list-inline-item"><a href="https://www.fiverr.com/share/qb8D02" target="_blank"><i class="fa fa-envelope"></i></a></li>
          </ul>
        </div>
        <hr>
      </div>  
      <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-2 text-center text-white">
          <p>Colombo Tech Camp Inc,</u> is a member of Teddy Inc.</p>
          <p class="h6">© All right Reversed. </p>
        </div>
        <hr>
      </div>  
    </div>
  </section>
  <!-- ./Footer -->

</body>
</html>