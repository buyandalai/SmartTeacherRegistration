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

      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Teacher Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("        <form name=\"\" method=\"post\" action=\"/Smart/DisplayTeacher\">   \n");
      out.write("        <table width=\"718\" border=\"0\">\n");
      out.write("    <tr>\n");
      out.write("      <td colspan=\"3\"><div align=\"center\">\n");
      out.write("        <h2><strong>SMART TEACHER REGISTRATION  STEP 1 OF 3</strong></h2>\n");
      out.write("      </div></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td width=\"278\">&nbsp;</td>\n");
      out.write("      <td width=\"259\">&nbsp;</td>\n");
      out.write("      <td width=\"167\">&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td><div align=\"left\">\n");
      out.write("        <input name=\"fname\" type=\"text\" id=\"textfield\" placeholder=\"First Name\">\n");
      out.write("      </div></td>\n");
      out.write("      <td>\n");
      out.write("        <input type=\"text\" name=\"surname\" id=\"textfield2\" placeholder=\"Surname\">\n");
      out.write("      </td>\n");
      out.write("      <td>\n");
      out.write("        <input type=\"text\" name=\"otherName\" id=\"textfield3\" placeholder=\"Other Name\">\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td><div align=\"left\">Choose Your Username :</div></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td><div align=\"left\">\n");
      out.write("        <input type=\"text\" name=\"username\" id=\"textfield4\" placeholder=\"Username\">\n");
      out.write("      </div></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td><div align=\"left\">Create Password :</div></td>\n");
      out.write("      <td><div align=\"left\">Confirm Password :</div></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td><div align=\"left\">\n");
      out.write("        <input type=\"text\" name=\"password\" id=\"textfield5\" placeholder=\"Password\">\n");
      out.write("      </div></td>\n");
      out.write("      <td><div align=\"left\">\n");
      out.write("        <input type=\"text\" name=\"textfield6\" id=\"textfield6\" placeholder=\"re-enter Password\">\n");
      out.write("      </div></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td><div align=\"left\">Date Of Birth :</div></td>\n");
      out.write("      <td><div align=\"left\"></div></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td><div align=\"left\">\n");
      out.write("        <select name=\"mob\" id=\"select\">\n");
      out.write("          <option>Month</option>\n");
      out.write("          <option value=\"January\">January</option>\n");
      out.write("          <option value=\"February\">February</option>\n");
      out.write("          <option value=\"March\">March</option>\n");
      out.write("          <option value=\"April\">April</option>\n");
      out.write("          <option value=\"May\">May</option>\n");
      out.write("          <option value=\"June\">June</option>\n");
      out.write("        </select>\n");
      out.write("      </div></td>\n");
      out.write("      <td><div align=\"left\">\n");
      out.write("        <select name=\"yob\" id=\"select2\">\n");
      out.write("          <option>Year</option>\n");
      out.write("          <option value=\"2000\">2000</option>\n");
      out.write("          <option value=\"2001\">2001</option>\n");
      out.write("          <option value=\"2003\">2003</option>\n");
      out.write("          <option value=\"2004\">2004</option>\n");
      out.write("          <option value=\"2005\">2005</option>\n");
      out.write("          <option value=\"2006\">2006</option>\n");
      out.write("        </select>\n");
      out.write("      </div></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td><div align=\"left\">Gender :</div></td>\n");
      out.write("      <td><div align=\"left\"></div></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td><div align=\"left\">\n");
      out.write("        <select name=\"gender\" id=\"select3\">\n");
      out.write("          <option value=\"\"> Select Gender</option>\n");
      out.write("          <option value=\"Male\">Male</option>\n");
      out.write("          <option value=\"Female\">Female</option>\n");
      out.write("          \n");
      out.write("        </select>\n");
      out.write("      </div></td>\n");
      out.write("      <td><div align=\"left\"></div></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td><div align=\"left\">Mobile Number :</div></td>\n");
      out.write("      <td><div align=\"left\">Location :</div></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td><div align=\"left\">\n");
      out.write("        <input name=\"telNo\" type=\"text\" id=\"textfield8\" placeholder=\"+256\">\n");
      out.write("      </div></td>\n");
      out.write("      <td><div align=\"left\">\n");
      out.write("        <select name=\"location\" id=\"select4\">\n");
      out.write("          <option>-- Select --</option>\n");
      out.write("          <option value=\"Kampala\"> Kampala</option>\n");
      out.write("          <option value=\"Jinja\">Jinja</option>\n");
      out.write("          <option value=\"Mukono\">Mukono</option>\n");
      out.write("        </select>\n");
      out.write("      </div></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td><div align=\"left\">Your Current Email Address:\n");
      out.write("        <input type=\"text\" name=\"email\" id=\"textfield7\" placeholder=\"Email Address\">\n");
      out.write("      </div></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("   \n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td >\n");
      out.write("          <div align=\"center\">\n");
      out.write("        <label>\n");
      out.write("          \n");
      out.write("            <input type=\"submit\" name=\"Submit\" value=\"Submit\" />\n");
      out.write("          \n");
      out.write("        </label>\n");
      out.write("              </div>\n");
      out.write("      \n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </body>\n");
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
