package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Recettes.com | Contact</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<script src=\"js/jquery-1.7.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-yui.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-replace.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/Dynalight_400.font.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/FF-cash.js\" type=\"text/javascript\"></script>\n");
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
      out.write("            <li><a href=\"index.html\">Accueil</a></li>\n");
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
      out.write("      <article class=\"col-1\">\n");
      out.write("        <div class=\"indent-left\">\n");
      out.write("          <h3 class=\"p1\">Our Contacts</h3>\n");
      out.write("          <figure class=\"indent-bot\">\n");
      out.write("            <iframe width=\"240\" height=\"180\" src=\"https://www.google.fr/maps/place/%C3%89cole+Sup%C3%A9rieure+des+Sciences+Appliqu%C3%A9es+et+de+Technologie+Priv%C3%A9e+de+Gab%C3%A8s,+UTECH+:+Universit%C3%A9+Technologique+Priv%C3%A9e+de+Gab%C3%A8s,+Gab%C3%A8s+6011,+Tunisia/@33.8746947,10.1099753,17z/data=!3m1!4b1!4m2!3m1!1s0x12556fb3eadce287:0x451b862aee9d8ce1\"></iframe>\n");
      out.write("          </figure>\n");
      out.write("          <dl>\n");
      out.write("            <dt class=\"p1\">Ecole Supperieur des sciences et de technologie Gabes</dt>\n");
      out.write("            <dd><span>GSM:</span> +216 20 000 000</dd>\n");
      out.write("            <dd><span>Telephone:</span> +216 75 000 000</dd>\n");
      out.write("            <dd><span>Fax:</span> +216 75 000 000</dd>\n");
      out.write("            <dd><span>Email:</span><a class=\"color-2\" href=\"#\">contact@Recettes.com</a></dd>\n");
      out.write("          </dl>\n");
      out.write("        </div>\n");
      out.write("      </article>\n");
      out.write("      <article class=\"col-2\">\n");
      out.write("        <h3 class=\"p1\">Contact</h3>\n");
      out.write("        <form id=\"contact-form\" action=\"./Contact\" method=\"post\" >\n");
      out.write("          <fieldset>\n");
      out.write("            <label><span class=\"text-form\">Email:</span>\n");
      out.write("              <input name=\"email\" type=\"text\" />\n");
      out.write("            </label>\n");
      out.write("              <label><span class=\"text-form\">Sujet:</span>\n");
      out.write("              <input name=\"sujet\" type=\"text\" />\n");
      out.write("            </label>\n");
      out.write("            \n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("              <div class=\"text-form\">Message:</div>\n");
      out.write("              <div class=\"extra-wrap\">\n");
      out.write("                <textarea name=\"message\"></textarea>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("                \n");
      out.write("                <div class=\"buttons\"> \n");
      out.write("                        <input type=\"submit\" class=\"button-2\" value=\"Envoyer\"> \n");
      out.write("                        <input type=\"reset\" class=\"button-2\" value=\"Annuler\"  name=\"\">\n");
      out.write("                        </div>\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </fieldset>\n");
      out.write("        </form>\n");
      out.write("      </article>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("<!--==============================footer=================================-->\n");
      out.write("<footer>\n");
      out.write("  <div class=\"main\">\n");
      out.write("    <div class=\"aligncenter\"> <span>Copyright &copy;  All Rights Reserved</span>  Design by<br> <a target=\"_blank\" href=\"#\">Gammoudi Khawka && </a> <a target=\"_blank\" href=\"#\">Ghidhawi Dhekra</a></div>\n");
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
