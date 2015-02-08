<%-- 
    Document   : Liste
    Created on : 17 janv. 2015, 18:11:57
    Author     : Ghidhawi Dhekra
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="recette.entity.Recettes"%>
<%@page import="recette.gestion.GestionRecettes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Recettes.com | Lister Recettes</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/csstable.css" type="text/css" media="screen">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script src="js/cufon-yui.js" type="text/javascript"></script>
<script src="js/cufon-replace.js" type="text/javascript"></script>
<script src="js/Dynalight_400.font.js" type="text/javascript"></script>
<script src="js/FF-cash.js" type="text/javascript"></script>
</head>
<body id="page6">
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
    <div class="wrapper">
      
      <article class="col-2">
          <h3 class="p1">Liste des Recettes</h3>
                                 
          <table class="bordered zebra">
            <thead>
            <tr>
                <th>Titre</th>
                <th>Type</th>
                <th>Action</th>
                
            </tr>
            </thead>
             <%
                ArrayList<Recettes> liste=GestionRecettes.getAllRecettes();
                for(int i=0;i<liste.size();i++)
                {
                    Recettes d=liste.get(i);%>
              
       
              <tr>
                <td><%=d.getTitre()%> </td>
                <td><%=d.getType()%></td>
                <td>
                    
                    <form action="Detail.jsp"  method="POST">
                        <input type="hidden" value="<%=d.getId_recettes()%>" name="id_recettes"/>
                        <input class="button-2" type="submit" value="Details" />
                    </form>
                        
                </td>
               <%   }
            %>
              </tr>
            
        </table>
       
      </article>
    </div>
  </div>
</section>
<!--==============================footer=================================-->
<footer>
  <div class="main">
    <div class="aligncenter"> <span>Copyright &copy;  All Rights Reserved</span> Design by<br> <a target="_blank" href="#">Gammoudi Khawka && </a> <a target="_blank" href="#">Ghidhawi Dhekra</a></div>
  </div>
</footer>
<script type="text/javascript">Cufon.now();</script>
</html>
