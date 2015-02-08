package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import recette.entity.Recettes;
import recette.gestion.GestionRecettes;
import java.util.ArrayList;

public final class catalogue_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Recettes.com | Catalogue</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/prettyPhoto.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<script src=\"js/jquery-1.7.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-yui.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-replace.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/Dynalight_400.font.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/FF-cash.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.prettyPhoto.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/hover-image.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.easing.1.3.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.bxSlider.js\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function () {\n");
      out.write("    $('#slider-2').bxSlider({\n");
      out.write("        pager: true,\n");
      out.write("        controls: false,\n");
      out.write("        moveSlideQty: 1,\n");
      out.write("        displaySlideQty: 4\n");
      out.write("    });\n");
      out.write("    $(\"a[data-gal^='prettyPhoto']\").prettyPhoto({\n");
      out.write("        theme: 'facebook'\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<!--[if lt IE 9]><script type=\"text/javascript\" src=\"js/html5.js\"></script><![endif]-->\n");
      out.write("</head>\n");
      out.write("<body id=\"page3\">\n");
      out.write("<!--==============================header=================================-->\n");
      out.write("<header>\n");
      out.write("  <div class=\"row-top\">\n");
      out.write("    <div class=\"main\">\n");
      out.write("      <div class=\"wrapper\">\n");
      out.write("        <h1><a href=\"index.html\">Recettes<span>.com</span></a></h1>\n");
      out.write("        <nav>\n");
      out.write("          <ul class=\"menu\">\n");
      out.write("            <li><a href=\"index.html\">Accueil</a></li>\n");
      out.write("            <li><a href=\"menu.jsp\">Menu</a></li>\n");
      out.write("            <li><a class=\"active\" href=\"catalogue.jsp\">Catalogue </a></li>\n");
      out.write("            <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("            <li><a href=\"authentification.jsp\">Espace Administrateur </a></li>\n");
      out.write("           \n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"row-bot\">\n");
      out.write("    <div class=\"row-bot-bg\">\n");
      out.write("      <div class=\"main\">\n");
      out.write("        <h2>Nos Recettes <span>A votre disposition</span></h2>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</header>\n");
      out.write("<!--==============================content================================-->\n");
      out.write("<section id=\"content\">\n");
      out.write("   <article >\n");
      out.write("          \n");
      out.write("  <div class=\"main\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h3 class=\"prev-indent-bot\">Catalogue</h3>\n");
      out.write("      <div id=\"slider-2\">\n");
      out.write("        \n");
      out.write("            ");

                ArrayList<Recettes> L=GestionRecettes.getAllRecettes();
                for(int i=0;i<L.size();i++){
                    if(i % 5==0) out.print("<div>");
                 Recettes R=L.get(i);       
            
      out.write("\n");
      out.write("            \n");
      out.write("          <div class=\"p4\">\n");
      out.write("              \n");
      out.write("            <figure>\n");
      out.write("                <a class=\"lightbox-image\" href=\"images/");
      out.print(R.getPhoto());
      out.write("slider-img1.jpg\" data-gal=\"prettyPhoto[prettyPhoto]\">\n");
      out.write("                    <img src=\"images/");
      out.print(R.getPhoto());
      out.write("\" alt=\"\"></a></figure>\n");
      out.write("            <h5>");
      out.print(R.getTitre() );
      out.write("</h5>\n");
      out.write("            <p class=\"p1\">");
      out.print(R.getType() );
      out.write("</p>\n");
      out.write("            <p class=\"p2\"><strong class=\"color-2\">");
      out.print(R.getDate_publication() );
      out.write("</strong></p>\n");
      out.write("            <form method=\"POST\" action=\"Detail.jsp\">\n");
      out.write("            <input value=\"");
      out.print(R.getId_recettes() );
      out.write("\" type=\"hidden\" name=\"id_recettes\" />");
 }out.print("</div>"); 
      out.write("\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" class=\"button-1\" value=\"Voir Plus\" />\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("   </article>\n");
      out.write("</section>\n");
      out.write("<!--==============================footer=================================-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("  <div class=\"main\">\n");
      out.write("    <div class=\"aligncenter\"> <span>Copyright &copy;  All Rights Reserved</span>  Design by<br> <a target=\"_blank\" href=\"#\">Gammoudi Khawka && </a> <a target=\"_blank\" href=\"#\">Ghidhawi Dhekra</a></div>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write("<script type=\"text/javascript\">Cufon.now();</script>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
