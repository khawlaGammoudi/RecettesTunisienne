package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import recette.entity.Recettes;
import recette.gestion.GestionRecettes;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Recettes.com | Menu</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<script src=\"js/jquery-1.7.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-yui.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-replace.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/Dynalight_400.font.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/FF-cash.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.equalheights.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.bxSlider.js\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function () {\n");
      out.write("    $('#slider').bxSlider({\n");
      out.write("        pager: true,\n");
      out.write("        controls: false,\n");
      out.write("        moveSlideQty: 1,\n");
      out.write("        displaySlideQty: 3\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<!--[if lt IE 9]><script type=\"text/javascript\" src=\"js/html5.js\"></script><![endif]-->\n");
      out.write("</head>\n");
      out.write("<body id=\"page2\">\n");
      out.write("<!--==============================header=================================-->\n");
      out.write("<header>\n");
      out.write("  <div class=\"row-top\">\n");
      out.write("    <div class=\"main\">\n");
      out.write("      <div class=\"wrapper\">\n");
      out.write("        <h1><a href=\"index.html\">Recettes<span>.com</span></a></h1>\n");
      out.write("        <nav>\n");
      out.write("          <ul class=\"menu\">\n");
      out.write("            <li><a href=\"index.html\">About</a></li>\n");
      out.write("            <li><a class=\"active\" href=\"menu.jsp\">Menu</a></li>\n");
      out.write("            <li><a href=\"catalogue.jsp\">Catalogue </a></li>\n");
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
      out.write("  <div class=\"main\">\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("      \n");
      out.write("        <div class=\"indent-left\">\n");
      out.write("          <div class=\"img-indent-bot\">\n");
      out.write("            <h3 class=\"prev-indent-bot\">Offre speciale</h3>\n");
      out.write("            <div class=\"wrapper img-indent-bot\">\n");
      out.write("              <figure class=\"img-indent\"><img src=\"images/page2-img1.jpg\" alt=\"\"></figure>\n");
      out.write("              <div class=\"extra-wrap\">\n");
      out.write("                  ");

                ArrayList<Recettes> liste=GestionRecettes.getAllRecettes();
                for(int i=0;i<liste.size();i++)
                {
                    Recettes d=liste.get(i); 
      out.write("\n");
      out.write("     \n");
      out.write("       \n");
      out.write("                <h5>");
      out.print( d.getTitre());
      out.write("  </h5>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"button-1\" href=\"#\">Voir Plus</a> </div>\n");
      out.write("          <h3 class=\"p1\">Menus idéales</h3>\n");
      out.write("          <div id=\"slider\">\n");
      out.write("            <div>\n");
      out.write("              <div class=\"p2\">\n");
      out.write("                 \n");
      out.write("                  \n");
      out.write("                <figure><a href=\"#\"><img src=\"images/page2-img2.jpg\" alt=\"\"></a></figure>\n");
      out.write("                <h5>");
      out.print(d.getTitre());
      out.write("</h5>\n");
      out.write("                <div>");
      out.print(d.getType());
      out.write("</div>\n");
      out.write("                <div>");
      out.print(d.getDate_publication() );
      out.write("</div>\n");
      out.write("              ");
   }
            
      out.write(" \n");
      out.write("                   \n");
      out.write("              </div>\n");
      out.write("                  </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("         <article class=\"col-2\">\n");
      out.write("        <h3>Liste de Recette</h3>\n");
      out.write("        \n");
      out.write("             ");

                ArrayList<Recettes> L=GestionRecettes.getAllRecettes();
                for(int i=0;i<L.size();i++)
                {
                    Recettes d1=L.get(i);
             
      out.write("\n");
      out.write("              <ul class=\"price-list p2\">\n");
      out.write("          <li>");
      out.print(d1.getTitre() );
      out.write("</li>\n");
      out.write("           ");
   }
            
      out.write(" \n");
      out.write("       </ul>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         </article>\n");
      out.write("          \n");
      out.write("    </div>\n");
      out.write("       \n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("           \n");
      out.write("<!--==============================footer=================================-->\n");
      out.write("<footer>\n");
      out.write("  <div class=\"main\">\n");
      out.write("    <div class=\"aligncenter\"> <span>Copyright &copy;  All Rights Reserved</span>  Design by<br> <a target=\"_blank\" href=\"#\">Gammoudi Khawka && </a> <a target=\"_blank\" href=\"#\">Ghidhawi Dhekra</a></div>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write("<script type=\"text/javascript\">Cufon.now();</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
