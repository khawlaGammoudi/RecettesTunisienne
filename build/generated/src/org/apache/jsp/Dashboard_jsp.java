package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import recette.gestion.GestionContact;
import recette.entity.Contact;
import java.util.ArrayList;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Recettes</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<script src=\"js/jquery-1.7.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-yui.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-replace.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/Dynalight_400.font.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/FF-cash.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/tms-0.3.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/tms_presets.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.easing.1.3.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.equalheights.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<link href=\"css/jquery_notification.css\" type=\"text/css\" rel=\"stylesheet\"/> \n");
      out.write("<script src=\"jquery.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery_notification_v.1.js\"></script> \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body id=\"page1\">\n");
      out.write("\n");

                int id_contact=Integer.parseInt(request.getParameter("id_contact"));
                ArrayList<Contact> liste=GestionContact.getMessages(id_contact);
                for(int i=0;i<liste.size();i++)
                {
                    Contact d=liste.get(i);
                    

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function(){\n");
      out.write("showNotification({\n");
      out.write("message: \"Notification message ");
      out.print(d.getSujet());
      out.write("\",\n");
      out.write("type: \"success\",\n");
      out.write("autoClose: true,\n");
      out.write("duration: 5\n");
      out.write("});\n");
      out.write("});\n");
      out.write("</script>\n");
 } 
      out.write("\n");
      out.write("<!--==============================header=================================-->\n");
      out.write("<header>\n");
      out.write("  <div class=\"row-top\">\n");
      out.write("    <div class=\"main\">\n");
      out.write("      <div class=\"wrapper\">\n");
      out.write("        <h1><a href=\"dashboard.html\">Recettes<span>.com</span></a></h1>\n");
      out.write("        <nav>\n");
      out.write("          <ul class=\"menu\">\n");
      out.write("            <li><a href=\"index.html\">Accueil</a></li>\n");
      out.write("            <li><a class=\"active\" href=\"Dashboard.jsp\">Dashboard</a></li>\n");
      out.write("            <li><a  href=\"Liste.jsp\">Liste de Recettes</a></li>\n");
      out.write("            <li><a  href=\"AjoutRecettes.jsp\">Ajouter une nouvelle Recettes </a></li>\n");
      out.write("            <li><a  href=\"SupprimerRecettes.jsp\">Supprimer Recettes</a></li>\n");
      out.write("             \n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"row-bot\">\n");
      out.write("    <div class=\"row-bot-bg\">\n");
      out.write("      <div class=\"main\">\n");
      out.write("        <h2>Nos Recettes <span>A votre disposition</span></h2>\n");
      out.write("        <div class=\"slider-wrapper\">\n");
      out.write("          <div class=\"slider\">\n");
      out.write("            <ul class=\"items\">\n");
      out.write("              <li> <img src=\"images/slider-img1.jpg\" alt=\"\" /> </li>\n");
      out.write("              <li> <img src=\"images/slider-img2.jpg\" alt=\"\" /> </li>\n");
      out.write("              <li> <img src=\"images/slider-img3.jpg\" alt=\"\" /> </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</header>\n");
      out.write("<!--==============================content================================-->\n");
      out.write("<section id=\"content\">\n");
      out.write("  <div class=\"main\">\n");
      out.write("    <div class=\"wrapper img-indent-bot\">\n");
      out.write("        <article class=\"col-1\"> <a href=\"liste_plats.jsp\"><img class=\"img-border\" src=\"images/banner-1.jpg\" width=\"290px\" height=\"149px\" alt=\"\" ></a> </article>\n");
      out.write("      <article class=\"col-1\"> <a href=\"liste_desserts.jsp\"><img class=\"img-border\" src=\"images/banner-2.jpg\" width=\"290px\" height=\"149px\" alt=\"\" ></a> </article>\n");
      out.write("      <article class=\"col-2\"> <a href=\"liste_entrees.jsp\"><img class=\"img-border\" src=\"images/banner-3.jpg\" width=\"290px\" height=\"149px\" alt=\"\"></a> </article>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<!--==============================footer=================================-->\n");
      out.write("<footer>\n");
      out.write("  <div class=\"main\">\n");
      out.write("      <div class=\"aligncenter\"> <span>Copyright &copy; All Rights Reserved</span> Design by<br> <a target=\"_blank\" href=\"#\">Gammoudi Khawka && </a> <a target=\"_blank\" href=\"#\">Ghidhawi Dhekra</a></div>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write("<script type=\"text/javascript\">Cufon.now();</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(window).load(function () {\n");
      out.write("    $('.slider')._TMS({\n");
      out.write("        duration: 1000,\n");
      out.write("        easing: 'easeOutQuint',\n");
      out.write("        preset: 'slideDown',\n");
      out.write("        slideshow: 7000,\n");
      out.write("        banners: false,\n");
      out.write("        pauseOnHover: true,\n");
      out.write("        pagination: true,\n");
      out.write("        pagNums: false\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("</script>\n");
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
