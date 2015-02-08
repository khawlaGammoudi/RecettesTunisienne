<%-- 
    Document   : ModifierRecettes
    Created on : 17 janv. 2015, 15:03:30
    Author     : Ghidhawi Dhekra
--%>




<%@page import="java.util.ArrayList"%>
<%@page import="recette.entity.Recettes"%>
<%@page import="recette.gestion.GestionRecettes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Recettes.com | Modifier Recettes</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="screen">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script src="js/cufon-yui.js" type="text/javascript"></script>
<script src="js/cufon-replace.js" type="text/javascript"></script>
<script src="js/Dynalight_400.font.js" type="text/javascript"></script>
<script src="js/FF-cash.js" type="text/javascript"></script>
<!--[if lt IE 9]><script type="text/javascript" src="js/html5.js"></script><![endif]-->
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
            <li><a  href="Liste.jsp">Liste de Recettes</a></li>
            <li><a  href="AjoutRecettes.jsp">Ajouter une nouvelle Recettes </a></li>
            <li><a  class="active" href="#">Modifier une Recettes </a></li>
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
        <h3 class="p1">Modifier Recettes</h3>
        <fieldset>
             <%
                int id_recettes=Integer.parseInt(request.getParameter("id_recettes"));
                ArrayList<Recettes> liste=GestionRecettes.getRecettes(id_recettes);
                for(int i=0;i<liste.size();i++)
                {
                    Recettes d=liste.get(i);%>
            <legend><%=d.getTitre() %></legend>
       
        <table border="0" name="grand" > 
            <tr>
                <td>
                    <table border="1" name="t1" >
                        <tr>
                            <th>Titre</th>
                            <td><p><%=d.getTitre() %></p></td>
                        </tr>
                        <tr>
                            <th>type</th>
                            <td><p><%=d.getType() %></p></td>
                        </tr>
                        <tr>
                            <th>Description </th>
                            <td><p><%=d.getDescription() %></p></td>
                        </tr>
                        <tr>
                            <th>Date_publication</th>
                            <td><p><%=d.getDate_publication() %></p></td>
                        </tr>
                        <tr>
                            <th>Date_modification</th>
                            <td><input type="text" value="<%=d.getDate_modification() %>" name="date_modification" /></td>
                        </tr>
                                      
                    </table>
                       
                    
                </td>
                   <td>
                       <table border="1" name="t2">
                           <tr>
                               <td><img src="images/<%=d.getPhoto()%>" /></td>
                        </tr>
                       </table>
                   </td>
             </tr>

             <tr>
            <td> <form action="./modif"  method="POST">
                          <input type="hidden" value="<%=d.getId_recettes()%>" name="id_recettes"/>
                        <input class="button-2" type="submit" value="  Editer" />
                    </form>
            </td>
            
           
        </tr>
              </table>
                         <%   }
                        %>
        </fieldset>
      </article>
    </div>
  </div>
</section>
<!--==============================footer=================================-->
<footer>
  <div class="main">
    <div class="aligncenter"> <span>Copyright &copy;  All Rights Reserved</span>  Design by<br> <a target="_blank" href="#">Gammoudi Khawka && </a> <a target="_blank" href="#">Ghidhawi Dhekra</a></div>
  </div>
</footer>
<script type="text/javascript">Cufon.now();</script>
</html>
