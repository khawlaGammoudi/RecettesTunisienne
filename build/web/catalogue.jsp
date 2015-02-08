
<%@page import="recette.entity.Recettes"%>
<%@page import="recette.gestion.GestionRecettes"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Recettes.com | Catalogue</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/prettyPhoto.css" type="text/css" media="screen">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script src="js/cufon-yui.js" type="text/javascript"></script>
<script src="js/cufon-replace.js" type="text/javascript"></script>
<script src="js/Dynalight_400.font.js" type="text/javascript"></script>
<script src="js/FF-cash.js" type="text/javascript"></script>
<script src="js/jquery.prettyPhoto.js" type="text/javascript"></script>
<script src="js/hover-image.js" type="text/javascript"></script>
<script src="js/jquery.easing.1.3.js" type="text/javascript"></script>
<script src="js/jquery.bxSlider.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function () {
    $('#slider-2').bxSlider({
        pager: true,
        controls: false,
        moveSlideQty: 1,
        displaySlideQty: 4
    });
    $("a[data-gal^='prettyPhoto']").prettyPhoto({
        theme: 'facebook'
    });
});
</script>
<!--[if lt IE 9]><script type="text/javascript" src="js/html5.js"></script><![endif]-->
</head>
<body id="page3">
<!--==============================header=================================-->
<header>
  <div class="row-top">
    <div class="main">
      <div class="wrapper">
        <h1><a href="index.html">Recettes<span>.com</span></a></h1>
        <nav>
          <ul class="menu">
            <li><a href="index.html">Accueil</a></li>
            <li><a href="menu.jsp">Menu</a></li>
            <li><a class="active" href="catalogue.jsp">Catalogue </a></li>
            <li><a href="contact.jsp">Contact</a></li>
            <li><a href="authentification.jsp">Espace Administrateur </a></li>
           
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
   <article >
          
  <div class="main">
    <div class="container">
      <h3 class="prev-indent-bot">Catalogue</h3>
      <div id="slider-2">
        
            <%
                ArrayList<Recettes> L=GestionRecettes.getAllRecettes();
                for(int i=0;i<L.size();i++){
                    if(i % 5==0) out.print("<div>");
                 Recettes R=L.get(i);       
            %>
            
          <div class="p4">
              
            <figure>
                <a class="lightbox-image" href="images/<%=R.getPhoto()%>slider-img1.jpg" data-gal="prettyPhoto[prettyPhoto]">
                    <img src="images/<%=R.getPhoto()%>" alt=""></a></figure>
            <h5><%=R.getTitre() %></h5>
            <p class="p1"><%=R.getType() %></p>
            <p class="p2"><strong class="color-2"><%=R.getDate_publication() %></strong></p>
            <form method="POST" action="Detail.jsp">
            <input value="<%=R.getId_recettes() %>" type="hidden" name="id_recettes" /><% }out.print("</div>"); %>
            
            <input type="submit" class="button-1" value="Voir Plus" />
            </form>
        </div>
    </div>
            
  </div>
  </div>
   </article>
</section>
<!--==============================footer=================================-->




<footer>
  <div class="main">
    <div class="aligncenter"> <span>Copyright &copy;  All Rights Reserved</span>  Design by<br> <a target="_blank" href="#">Gammoudi Khawka && </a> <a target="_blank" href="#">Ghidhawi Dhekra</a></div>
  </div>
</footer>
<script type="text/javascript">Cufon.now();</script>
</html>

