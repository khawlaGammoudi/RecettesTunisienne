package org.apache.jsp.js;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testnotif_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <head>\n");
      out.write("            <script src=\"jquery.min.js\"></script>\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("            <style>\n");
      out.write("                .badge{\n");
      out.write("    position:relative;\n");
      out.write("}\n");
      out.write("    .badge[data-badge]:after {\n");
      out.write("    content:attr(data-badge);\n");
      out.write("    position:absolute;\n");
      out.write("    top:-10px;\n");
      out.write("    right:-10px;\n");
      out.write("    font-size:.7em;\n");
      out.write("    background:green;\n");
      out.write("    color:white;\n");
      out.write("        width:18px;\n");
      out.write("    height:18px;\n");
      out.write("        text-align:center;\n");
      out.write("        line-height:18px;\n");
      out.write("        border-radius:50%;\n");
      out.write("    box-shadow:0 0 1px #333;\n");
      out.write("}\n");
      out.write(".submit{\n");
      out.write("    margin-top    : 20px;\n");
      out.write("        margin-right  : 10px;\n");
      out.write("        margin-bottom : 20px;\n");
      out.write("        margin-left   : 10px;\n");
      out.write("    font-size:100m;\n");
      out.write("    background:orange;\n");
      out.write("    color:green;\n");
      out.write("        width:150px;\n");
      out.write("    height:30px;\n");
      out.write("        text-align:center;          \n");
      out.write("}\n");
      out.write("            </style>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("        <form method=\"POST\">\n");
      out.write("            <a href=\"\" id=\"notification\"  class=\"badge\" data-badge=\"0\">Badge Notification Example</a>\n");
      out.write("            <input id=\"submit\" value=\"Push\" class=\"submit\" onclick=\"push();\"  type=\"button\"/>\n");
      out.write("            <input id=\"submit\" value=\"Pop\" class=\"submit\" onclick=\"pop();\"  type=\"button\"/>\n");
      out.write("        </form>\n");
      out.write("       </body>\n");
      out.write("    <script>\n");
      out.write("        function push(){\n");
      out.write("            var notification=$(\"#notification\").attr(\"data-badge\");\n");
      out.write("            var counter =parseInt(notification,10);\n");
      out.write("            if(counter>9){\n");
      out.write("                alert(\"Notification list is full!\");\n");
      out.write("                return;     \n");
      out.write("            }\n");
      out.write("            counter=counter+1;      \n");
      out.write("            $(\"#notification\").attr(\"data-badge\",counter);\n");
      out.write("        }\n");
      out.write("        function pop(){\n");
      out.write("            var notification=$(\"#notification\").attr(\"data-badge\");\n");
      out.write("            var counter=parseInt(notification,10);\n");
      out.write("            if(counter<1){\n");
      out.write("                alert(\"list is empty!\");\n");
      out.write("                return;     \n");
      out.write("            }\n");
      out.write("            counter=counter-1;\n");
      out.write("            $(\"#notification\").attr(\"data-badge\",counter);\n");
      out.write("        } \n");
      out.write("    </script>\n");
      out.write("     </html>");
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
