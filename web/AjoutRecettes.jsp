<%-- 
    Document   : AjoutRecettes
    Created on : 16 janv. 2015, 16:45:35
    Author     : Ghidhawi Dhekra
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Recettes.com | Ajouter Recettes</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="screen">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script src="js/cufon-yui.js" type="text/javascript"></script>
<script src="js/cufon-replace.js" type="text/javascript"></script>
<script src="js/Dynalight_400.font.js" type="text/javascript"></script>
<script src="js/FF-cash.js" type="text/javascript"></script></head>
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
            <li><a  href="Liste.jsp">Liste de Recettes</a></li>
            <li><a class="active" href="AjoutRecettes.jsp">Ajouter une nouvelle Recettes </a></li>
            <li><a href="ModifierRecettes.jsp">Modifier une Recettes </a></li>
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
        <h3 class="p1">Ajouter Nouvelle Recettes</h3>
       <form id="contact-form" action="./okk" method="post" >
          <fieldset>
            
              <label><span class="text-form">Entree un identifiant:</span>
              <input  type="text" name="id_recettes" />
            </label>
              
            <label><span class="text-form">Entree un titre:</span>
              <input  type="text" name="titre" />
            </label>
              
            <label><span class="text-form">Entree la date de publication:</span>
              <input  type="date" name="date_publication" />
              <input  type="hidden" name="date_modification" />
            </label>
              
              <label><span class="text-form">Choisir le type de recette:</span>
               <select name=type >
                        <option selected="">Choisir un type</option>     
                        <option>dessert</option>
                        <option>plats</option>
                        <option>entree</option>
               </select>
                  </label>
              <label><span class="text-form">nom_image.(JPG, PNG ou GIF | max. 15 Ko) :</span>
              <input type="text" name="photo" />
              <%--<input type="file" name="photo" />--%>
            </label>
           
              <div class="wrapper">
              <div class="text-form">Entrer Description:</div>
              <div class="extra-wrap">
                <textarea name="description"></textarea>
              </div>
            </div>
              
                 <input type="submit"  class="button-2" value="Ajouter"> 
               <input type="reset" class="button-2" value="Annuler"  name="">
             
          </fieldset>
                        
        </form>
      </article>
    </div>
  </div>
</section>
<!--==============================footer=================================-->
<footer>
  <div class="main">
    <div class="aligncenter"> <span>Copyright &copy;  All Rights Reserved</span>Design by<br> <a target="_blank" href="#">Gammoudi Khawka && </a> <a target="_blank" href="#">Ghidhawi Dhekra</a></div>
  </div>
</footer>
<script type="text/javascript">Cufon.now();</script>
</html>
