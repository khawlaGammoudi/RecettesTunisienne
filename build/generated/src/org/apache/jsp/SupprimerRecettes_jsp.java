package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import recette.entity.Recettes;
import recette.gestion.GestionRecettes;

public final class SupprimerRecettes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Recettes.com | Supprimer Recettes</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/csstable.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<script src=\"js/jquery-1.7.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-yui.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-replace.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/Dynalight_400.font.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/FF-cash.js\" type=\"text/javascript\"></script>\n");
      out.write("<!--[if lt IE 9]><script type=\"text/javascript\" src=\"js/html5.js\"></script><![endif]-->\n");
      out.write("</head>\n");
      out.write("<body id=\"page6\">\n");
      out.write("<!--==============================header=================================-->\n");
      out.write("<header>\n");
      out.write("  <div class=\"row-top\">\n");
      out.write("    <div class=\"main\">\n");
      out.write("      <div class=\"wrapper\">\n");
      out.write("        <h1><a href=\"index.html\">Recettes<span>.com</span></a></h1>\n");
      out.write("        <nav>\n");
      out.write("          <ul class=\"menu\">\n");
      out.write("            <li><a href=\"index.html\">Home</a></li>\n");
      out.write("            <li><a href=\"liste.jsp\">Liste de Recettes</a></li>\n");
      out.write("            <li><a href=\"AjoutRecettes.jsp\">Ajouter une nouvelle Recettes </a></li>\n");
      out.write("            <li><a href=\"ModifierRecettes.jsp\">Modifier une Recettes </a></li>\n");
      out.write("            <li><a class=\"active\" href=\"SupprimerRecettes.jsp\">Supprimer Recettes</a></li>\n");
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
      out.write("      <article class=\"col-2\">\n");
      out.write("        <h3 class=\"p1\">Supprimer  Recettes</h3>\n");
      out.write("        <table class=\"bordered zebra\">\n");
      out.write("            <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Titre</th>\n");
      out.write("                <th>Type</th>\n");
      out.write("                <th>Action</th>\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("            ");

                ArrayList<Recettes> liste=GestionRecettes.getAllRecettes();
                for(int i=0;i<liste.size();i++)
                {
                    Recettes d=liste.get(i);
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                <td>");
      out.print(d.getTitre());
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(d.getType());
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <form action=\"./suppression\"  method=\"POST\">\n");
      out.write("                        <input type=\"hidden\" value=\"");
      out.print(d.getId_recettes());
      out.write("\" name=\"id_recettes\"/>\n");
      out.write("                        <input class=\"button-2\" type=\"submit\" value=\"Supprimer\" />\n");
      out.write("                    </form>\n");
      out.write("                \n");
      out.write("                    <form action=\"ModifierRecettes.jsp\"  method=\"POST\">\n");
      out.write("                        <input type=\"hidden\" value=\"");
      out.print(d.getId_recettes());
      out.write("\" name=\"id_recettes\"/>\n");
      out.write("                        <input class=\"button-2\" type=\"submit\" value=\"   Modifier\" />\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
   }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("      </article>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("<!--==============================footer=================================-->\n");
      out.write("<footer>\n");
      out.write("  <div class=\"main\">\n");
      out.write("    <div class=\"aligncenter\"> <span>Copyright &copy;  All Rights Reserved</span> Design by Khawla Gammoudi && Dhekra Ghidhawi</div>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write("<script type=\"text/javascript\">Cufon.now();</script>\n");
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
