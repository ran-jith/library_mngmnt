package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>MyLib</title>\n");
      out.write("\n");
      out.write("<!--////////////////////////////////////////////////////////////////\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\" integrity=\"sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt\" crossorigin=\"anonymous\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\"/>\n");
      out.write("  <!-- jQuery library -->\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <!-- Latest compiled JavaScript -->\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <!--END BOOTSTRAP-->\n");
      out.write("\n");
      out.write("  <!--Custom CSS-->\n");
      out.write("<link href=\"styles/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!--////////////////////////////////////////////////////////////////-->\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div class=\"mainscreen\">\n");
      out.write("\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <a href=\"#\" class=\"logo\">Library</a>\n");
      out.write("        <div class=\"header-right\">\n");
      out.write("          <a class=\"active\" href=\"index.jsp\">Home</a>\n");
      out.write("          <a href=\"#contact\">Contact</a>\n");
      out.write("          <a href=\"login.jsp\">Admin</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div style=\"padding-left:20px\">\n");
      out.write("        <h1></h1></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"splitleft\">\n");
      out.write("          <h1 class=\"bkhead\"><font color=\"white\"><b>Manage Books</b></font></h1>\n");
      out.write("          <br><br>\n");
      out.write("          <a href=\"book/addbk.jsp\"><button class=\"btn btn-lg btn-danger\">Add Book</button></a><br><br>\n");
      out.write("          <a href=\"Display\"><button class=\"btn btn-lg btn-danger\">Delete Book</button></a><br><br>\n");
      out.write("          <a href=\"Delete\"><button class=\"btn btn-lg btn-danger\" name=\"iss\" value=\"1\">Issue Book</button></a><br><br>\n");
      out.write("          <a href=\"book/retbk.jsp\"><button class=\"btn btn-lg btn-danger\">Return Book</button></a><br>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  </div>\n");
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
