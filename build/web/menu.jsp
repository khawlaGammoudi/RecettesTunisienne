<%@page import="java.util.ArrayList"%>
<%@page import="recette.entity.Recettes"%>
<%@page import="recette.gestion.GestionRecettes"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Recettes.com | Menu</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="screen">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script src="js/cufon-yui.js" type="text/javascript"></script>
<script src="js/cufon-replace.js" type="text/javascript"></script>
<script src="js/Dynalight_400.font.js" type="text/javascript"></script>
<script src="js/FF-cash.js" type="text/javascript"></script>
<script src="js/jquery.equalheights.js" type="text/javascript"></script>
<script src="js/jquery.bxSlider.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function () {
    $('#slider').bxSlider({
        pager: true,
        controls: false,
        moveSlideQty: 1,
        displaySlideQty: 3
    });
});
</script>
<!--[if lt IE 9]><script type="text/javascript" src="js/html5.js"></script><![endif]-->
</head>
<body id="page2">
<!--==============================header=================================-->
<header>
  <div class="row-top">
    <div class="main">
      <div class="wrapper">
        <h1><a href="index.html">Recettes<span>.com</span></a></h1>
        <nav>
          <ul class="menu">
            <li><a href="index.html">About</a></li>
            <li><a class="active" href="menu.jsp">Menu</a></li>
            <li><a href="catalogue.jsp">Catalogue </a></li>
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
  <div class="main">
    <div class="wrapper">
      <article class="col-1">
        <div class="indent-left">
          <div class="img-indent-bot">
            <h3 class="prev-indent-bot">Offre speciale</h3>
            <div class="wrapper img-indent-bot">
              <figure class="img-indent"><img src="images/page2-img1.jpg" alt=""></figure>
              
         <article class="col-2">
        <h3>Liste de Recette</h3>
        
             <%
                ArrayList<Recettes> L=GestionRecettes.getAllRecettes();
                for(int i=0;i<L.size();i++)
                {
                    Recettes d1=L.get(i);
             %>
              <ul class="price-list p2">
          <li><%=d1.getTitre() %></li>
           
       </ul>
        
        <%   }
            %> 
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
</body>
</html>
