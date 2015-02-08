<%-- 
    Document   : Dashboard
    Created on : 15 janv. 2015, 10:03:21
    Author     : Ghidhawi Dhekra
--%>

<%@page import="recette.gestion.GestionContact"%>
<%@page import="recette.entity.Contact"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Dashboard</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="screen">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script src="js/cufon-yui.js" type="text/javascript"></script>
<script src="js/cufon-replace.js" type="text/javascript"></script>
<script src="js/Dynalight_400.font.js" type="text/javascript"></script>
<script src="js/FF-cash.js" type="text/javascript"></script>
<script src="js/tms-0.3.js" type="text/javascript"></script>
<script src="js/tms_presets.js" type="text/javascript"></script>
<script src="js/jquery.easing.1.3.js" type="text/javascript"></script>
<script src="js/jquery.equalheights.js" type="text/javascript"></script>

<link href="css/jquery_notification.css" type="text/css" rel="stylesheet"/> 
<script src="jquery.js"></script>
<script type="text/javascript" src="js/jquery_notification_v.1.js"></script> 

</head>
<body id="page1">


<!--==============================header=================================-->
<header>
  <div class="row-top">
    <div class="main">
      <div class="wrapper">
        <h1><a href="dashboard.html">Recettes<span>.com</span></a></h1>
        <nav>
          <ul class="menu">
            <li><a href="index.html">Accueil</a></li>
            <li><a class="active" href="Dashboard.jsp">Dashboard</a></li>
            <li><a  href="Liste.jsp">Liste de Recettes</a></li>
            <li><a  href="AjoutRecettes.jsp">Ajouter une nouvelle Recettes </a></li>
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
        <div class="slider-wrapper">
          <div class="slider">
            <ul class="items">
              <li> <img src="images/slider-img1.jpg" alt="" /> </li>
              <li> <img src="images/slider-img2.jpg" alt="" /> </li>
              <li> <img src="images/slider-img3.jpg" alt="" /> </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
</header>
<!--==============================content================================-->
<section id="content">
  <div class="main">
    <div class="wrapper img-indent-bot">
        <article class="col-1"> <a href="liste_plats.jsp"><img class="img-border" src="images/banner-1.jpg" width="290px" height="149px" alt="" ></a> </article>
      <article class="col-1"> <a href="liste_desserts.jsp"><img class="img-border" src="images/banner-2.jpg" width="290px" height="149px" alt="" ></a> </article>
      <article class="col-2"> <a href="liste_entrees.jsp"><img class="img-border" src="images/banner-3.jpg" width="290px" height="149px" alt=""></a> </article>
    </div>
</section>
<!--==============================footer=================================-->
<footer>
  <div class="main">
      <div class="aligncenter"> <span>Copyright &copy; All Rights Reserved</span> Design by<br> <a target="_blank" href="#">Gammoudi Khawka && </a> <a target="_blank" href="#">Ghidhawi Dhekra</a></div>
  </div>
</footer>
<script type="text/javascript">Cufon.now();</script>
<script type="text/javascript">
$(window).load(function () {
    $('.slider')._TMS({
        duration: 1000,
        easing: 'easeOutQuint',
        preset: 'slideDown',
        slideshow: 7000,
        banners: false,
        pauseOnHover: true,
        pagination: true,
        pagNums: false
    });
});
</script>
</body>
</html>
