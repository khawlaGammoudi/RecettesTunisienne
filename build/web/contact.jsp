<%-- 
    Document   : contact
    Created on : 16 janv. 2015, 23:36:50
    Author     : Ghidhawi Dhekra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Recettes.com | Contact</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="screen">
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
            <li><a href="menu.jsp">Menu</a></li>
            <li><a href="catalogue.jsp">Catalogue </a></li>
            <li><a class="active" href="contact.jsp">Contact</a></li>
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
          <h3 class="p1">Our Contacts</h3>
          <figure class="indent-bot">
            <iframe width="240" height="180" src="https://www.google.fr/maps/place/%C3%89cole+Sup%C3%A9rieure+des+Sciences+Appliqu%C3%A9es+et+de+Technologie+Priv%C3%A9e+de+Gab%C3%A8s,+UTECH+:+Universit%C3%A9+Technologique+Priv%C3%A9e+de+Gab%C3%A8s,+Gab%C3%A8s+6011,+Tunisia/@33.8746947,10.1099753,17z/data=!3m1!4b1!4m2!3m1!1s0x12556fb3eadce287:0x451b862aee9d8ce1"></iframe>
          </figure>
          <dl>
            <dt class="p1">Ecole Supperieur des sciences et de technologie Gabes</dt>
            <dd><span>GSM:</span> +216 20 000 000</dd>
            <dd><span>Telephone:</span> +216 75 000 000</dd>
            <dd><span>Fax:</span> +216 75 000 000</dd>
            <dd><span>Email:</span><a class="color-2" href="#">contact@Recettes.com</a></dd>
          </dl>
        </div>
      </article>
      <article class="col-2">
        <h3 class="p1">Contact</h3>
        <form id="contact-form" action="./Contact" method="post" >
          <fieldset>
            <label><span class="text-form">Email:</span>
              <input name="email" type="text" />
            </label>
              <label><span class="text-form">Sujet:</span>
              <input name="sujet" type="text" />
            </label>
            
            <div class="wrapper">
              <div class="text-form">Message:</div>
              <div class="extra-wrap">
                <textarea name="message"></textarea>
                <div class="clear"></div>
                
                <div class="buttons"> 
                        <input type="submit" class="button-2" value="Envoyer"> 
                        <input type="reset" class="button-2" value="Annuler"  name="">
                        </div>
                
              </div>
            </div>
          </fieldset>
        </form>
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
