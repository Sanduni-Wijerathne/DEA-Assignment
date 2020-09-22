<%-- 
    Document   : logout
    Created on : May 19, 2020, 12:28:12 PM
    Author     : kavee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>	
<%
session.invalidate();
response.sendRedirect("index.html");
%>
