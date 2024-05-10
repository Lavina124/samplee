package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("     <link rel=\"Stylesheet\" href=\"mycss.css\">\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"data\">\n");
      out.write("          <form name=\"rform\" form action=\"regis1.jsp\" method=\"post\" onsubmit=\"show1()\">\n");
      out.write("        <center>\n");
      out.write("            <table cellpadding=\"10px\">\n");
      out.write("                <th><h1> Registration Page </h1></th>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td> enter ID <font id=\"unId\"></font></td>\n");
      out.write("                    <td> <input type=\"number\" placeholder=\"Enter ID\"name=\"ui\" ></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                <td> Enter Name <font id=\"unMsg\"></font></td>\n");
      out.write("                <td> <input type=\"text\" placeholder=\"Enter Name\"name=\"un\" onkeyup=\"show2(this)\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                <td> Enter mob no. <font id=\"upm\"></font></td>\n");
      out.write("                <td> <input type=\"number\"placeholder=\"Enter mob no\"name=\"up\" onkeyup=\"show2(this)\" > </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                <td> City<font id=\"uci\"></font></td>\n");
      out.write("                <td> <input type=\"text\"placeholder=\"city\"name=\"uc\" onkeyup=\"show2(this)\" > </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                <td> Gender <font id=\"ugMsg\"></font></td>\n");
      out.write("                <td> Male<input type=\"radio\" name=\"ug\" value=\"Male\" onchange=\"show2(this)\"> </td>&nbsp;&nbsp;&nbsp;&nbsp;<td> feMale<input type=\"radio\" name=\"ug\" value=\"FeMale\" onchange=\"show2(this)\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <tr>\n");
      out.write("                       <td> DOB <font id=\"udo\"></font></td>\n");
      out.write("                            <td><input type=\"date\" name=\"ud\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                <th colspan=\"3\"> <input type=\"submit\" value=\"Register\" class=\"B\"> </th>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                </table>\n");
      out.write("                  </form>\n");
      out.write("                </center>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
