package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public class AjouterRecettes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Recettes.com | AjouterRecettes</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"screen\">\n");
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
      out.write("            <li><a href=\"index.html\">About</a></li>\n");
      out.write("            <li><a href=\"menu.jsp\">Menu</a></li>\n");
      out.write("            <li><a href=\"catalogue.jsp\">Catalogue </a></li>\n");
      out.write("            <li><a class=\"active\" href=\"contact.jsp\">Contact</a></li>\n");
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
      out.write("        <h3 class=\"p1\">Ajouter Nouvelle Recettes</h3>\n");
      out.write("        <form name=f method=\"POST\" action=./okk ><table>\n");
      out.write("            <tr><td><label>Entree un identifiant: </label></td></tr>\n");
      out.write("            <tr><td><input type=text name=id_recettes size=20></td></tr>\n");
      out.write("            <tr><td><label>Entree un titre: </label></td></tr>\n");
      out.write("            <tr><td><input type=text name=titre size=20></td></tr>\n");
      out.write("            <td><input type=text name=photo ></td>\n");
      out.write("            <tr><td><label>Entree un description: </label></td></tr>\n");
      out.write("            <tr><td> <textarea type=\"text\" name=\"description\" ></textarea></td></tr>\n");
      out.write("            <tr><td><label>Date de publication: </label></td></tr>\n");
      out.write("            <tr><td><input type=date name=date_publication size=20></td></tr>\n");
      out.write("            <tr><td><input type=hidden name=date_modification size=20></td></tr>\n");
      out.write("            <tr><td><label>Entree un type: </label></tr>\n");
      out.write("            <tr><td><select name=type >\n");
      out.write("                        <option selected=\"\">Choisir un type</option>     \n");
      out.write("                        <option>dessert</option>\n");
      out.write("                        <option>plats</option>\n");
      out.write("                        <option>entree</option>\n");
      out.write("                    </select>\n");
      out.write("                                </td></tr>\n");
      out.write("            \n");
      out.write("            </tr><tr><td><input type=submit value=Enregistrer size=20>\n");
      out.write("                    <input type=reset value=Annuler size=20></td></tr>\n");
      out.write("            </table></form>\n");
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
