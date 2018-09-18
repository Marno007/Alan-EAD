package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import business.User;
import data.UserIO;

public final class display_005femail_005fentry_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Email Address App</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        ");

        
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String emailAddress = request.getParameter("emailAddress");
        
        ServletContext sc = this.getServletContext();
        
        String path = sc.getRealPath("/WEB-INF/EmailList.txt");
        
        User user = new User(firstName, lastName, emailAddress);
        
        UserIO.add(user, path);
        
        
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        <h1> Thanks for joining our email list </h1>\r\n");
      out.write("        \r\n");
      out.write("        <p> Here is the information you entered: </p>\r\n");
      out.write("\r\n");
      out.write("        <table cellspacing=\"5\" cellpadding=\"5\" border=\"1\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"right\"> First name: </td>\r\n");
      out.write("                <td>");
      out.print( user.getFirstName());
      out.write(" </td>\r\n");
      out.write("            </tr>         \r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"right\"> Last name: </td>\r\n");
      out.write("                <td>");
      out.print( user.getLastName());
      out.write(" </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"right\"> Email address: </td>\r\n");
      out.write("                <td>");
      out.print( user.getEmailAddress() );
      out.write(" </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("        <p>To enter another email address, click on the Back <br>\r\n");
      out.write("           button in your browser or the Return button shown <br>\r\n");
      out.write("           below. </p>\r\n");
      out.write("            \r\n");
      out.write("        <form action=\"join_email_list.html\" method=\"post\">\r\n");
      out.write("            <input type=\"submit\" value=\"Return\">\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</html>\r\n");
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
