<%-- 
    Document   : test
    Created on : 17 janv. 2015, 13:40:21
    Author     : Ghidhawi Dhekra
--%>

<%@page import="recette.entity.utilisateur"%>
<%@page import="recette.gestion.GestionUser"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String login=request.getParameter("login");
             String password=request.getParameter("password");
             utilisateur U=new utilisateur(login,password);
             if (GestionUser.existe(new utilisateur(login,password))){
                 String Type=GestionUser.getType(U);
                 if(Type.equals("admin"))response.sendRedirect("Dashboard.jsp");
                 else response.sendRedirect("index.html");
             }
             else
             {
                 response.sendRedirect("index.html");
             }
            %>
    </body>
</html>
