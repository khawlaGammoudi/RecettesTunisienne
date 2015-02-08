<%-- 
    Document   : Detail
    Created on : 16 janv. 2015, 22:58:47
    Author     : Ghidhawi Dhekra
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="recette.entity.Recettes"%>
<%@page import="recette.gestion.GestionRecettes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Recette.com | Details</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="screen">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script src="js/cufon-yui.js" type="text/javascript"></script>
<script src="js/cufon-replace.js" type="text/javascript"></script>
<script src="js/Dynalight_400.font.js" type="text/javascript"></script>
<script src="js/FF-cash.js" type="text/javascript"></script>
<script src="js/imprimer.js" type="text/javascript"></script>
<!--[if lt IE 9]><script type="text/javascript" src="js/html5.js"></script><![endif]-->
</head>
<body id="page5">
<!--==============================header=================================-->
<header>
  <div class="row-top">
    <div class="main">
      <div class="wrapper">
        <h1><a href="index.html">Recettes<span>.com</span></a></h1>
        <nav>
          <ul class="menu">
            <li><a href="index.html">Accueil</a></li>
            <li><a  href="Dashboard.jsp">Dashboard</a></li>
            <li><a class="active" href="Liste.jsp">Liste de Recettes</a></li>
            <li><a href="AjoutRecettes.jsp">Ajouter une nouvelle Recettes </a></li>
            <li><a  href="SupprimerRecettes.jsp">Supprimer Recettes</a></li>
           
          </ul>
        </nav>
      </div>
    </div>
  </div>
  <div class="row-bot">
    <div class="row-bot-bg">
      <div class="main">
        <h2>Nos Recettes <span>A votre disposition</span></h2>
        </div>
    </div>
  </div>
</header>
<!--==============================content================================-->
<section id="content">
  <div class="main">
    <div class="container">
        <%
                int id_recettes=Integer.parseInt(request.getParameter("id_recettes"));
                ArrayList<Recettes> liste=GestionRecettes.getRecettes(id_recettes);
                for(int i=0;i<liste.size();i++)
                {
                    Recettes d=liste.get(i);%>
            
      <h3><%=d.getTitre() %></h3>
      <ul class="list-1">
          <li><strong>Ingredient et methode de preparation:</strong></li>
          <p><span><%=d.getDescription()%></span></p> 
          <label><%=d.getDate_publication()%></label> 
      </ul>  
        <form action="ModifierRecettes.jsp"  method="POST">
                        <input type="hidden" value="<%=d.getId_recettes()%>" name="id_recettes"/><%}%>
                        <input class="button-2" type="submit" value="   Modifier" />
                        <input class="button-2" type="Button" value="  Imprimer"  onclick="imprimer_page()"/>
                      
        </form>
                    
                    
    </div>
  </div>
          
</section>
<!--==============================footer=================================-->
<footer>
  <div class="main">
    <div class="aligncenter"> <span>Copyright &copy;  All Rights Reserved</span>  Design by<br> <a target="_blank" href="#">Gammoudi Khawka && </a> <a target="_blank" href="#">Ghidhawi Dhekra</a> </div>
  </div>
</footer>
<script type="text/javascript">Cufon.now();</script>
</body>
</html>
