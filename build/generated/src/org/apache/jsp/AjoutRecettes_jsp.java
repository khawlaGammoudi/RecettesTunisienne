package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AjoutRecettes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Recettes.com | Ajouter Recettes</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<script src=\"js/jquery-1.7.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-yui.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-replace.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/Dynalight_400.font.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/FF-cash.js\" type=\"text/javascript\"></script></head>\n");
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
      out.write("            <li><a  href=\"Liste.jsp\">Liste de Recettes</a></li>\n");
      out.write("            <li><a class=\"active\" href=\"AjoutRecettes.jsp\">Ajouter une nouvelle Recettes </a></li>\n");
      out.write("            <li><a href=\"ModifierRecettes.jsp\">Modifier une Recettes </a></li>\n");
      out.write("            <li><a  href=\"SupprimerRecettes.jsp\">Supprimer Recettes</a></li>\n");
      out.write("            \n");
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
      out.write("        <h3 class=\"p1\">Ajouter Nouvelle Recettes</h3>\n");
      out.write("       <form id=\"contact-form\" action=\"./okk\" method=\"post\" >\n");
      out.write("          <fieldset>\n");
      out.write("            \n");
      out.write("              <label><span class=\"text-form\">Entree un identifiant:</span>\n");
      out.write("              <input  type=\"text\" name=\"id_recettes\" />\n");
      out.write("            </label>\n");
      out.write("              \n");
      out.write("            <label><span class=\"text-form\">Entree un titre:</span>\n");
      out.write("              <input  type=\"text\" name=\"titre\" />\n");
      out.write("            </label>\n");
      out.write("              \n");
      out.write("            <label><span class=\"text-form\">Entree la date de publication:</span>\n");
      out.write("              <input  type=\"date\" name=\"date_publication\" />\n");
      out.write("              <input  type=\"hidden\" name=\"date_modification\" />\n");
      out.write("            </label>\n");
      out.write("              \n");
      out.write("              <label><span class=\"text-form\">Choisir le type de recette:</span>\n");
      out.write("               <select name=type >\n");
      out.write("                        <option selected=\"\">Choisir un type</option>     \n");
      out.write("                        <option>dessert</option>\n");
      out.write("                        <option>plats</option>\n");
      out.write("                        <option>entree</option>\n");
      out.write("               </select>\n");
      out.write("                  </label>\n");
      out.write("              <label><span class=\"text-form\">nom_image.(JPG, PNG ou GIF | max. 15 Ko) :</span>\n");
      out.write("              <input type=\"text\" name=\"photo\" />\n");
      out.write("              ");
      out.write("\n");
      out.write("            </label>\n");
      out.write("           \n");
      out.write("              <div class=\"wrapper\">\n");
      out.write("              <div class=\"text-form\">Entrer Description:</div>\n");
      out.write("              <div class=\"extra-wrap\">\n");
      out.write("                <textarea name=\"description\"></textarea>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("                 <input type=\"submit\"  class=\"button-2\" value=\"Ajouter\"> \n");
      out.write("               <input type=\"reset\" class=\"button-2\" value=\"Annuler\"  name=\"\">\n");
      out.write("             \n");
      out.write("          </fieldset>\n");
      out.write("                        \n");
      out.write("        </form>\n");
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
