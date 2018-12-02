package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<title>Voting Servlet</title>\n");
      out.write("\t<!-- Meta-Tags -->\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"keywords\" content=\"Hover Overlay Effects a Responsive Web Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible Web Template, Smartphone Compatible Web Template, Free Webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design\">\n");
      out.write("\t<script>\n");
      out.write("\t\taddEventListener(\"load\", function () {\n");
      out.write("\t\t\tsetTimeout(hideURLbar, 0);\n");
      out.write("\t\t}, false);\n");
      out.write("\n");
      out.write("\t\tfunction hideURLbar() {\n");
      out.write("\t\t\twindow.scrollTo(0, 1);\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("\t<!-- //Meta-Tags -->\n");
      out.write("\t<!-- Stylesheets -->\n");
      out.write("\t<link href=\"css/style_1.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\t<link href=\"css/fontawesome-all.min.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\t<!--// Stylesheets -->\n");
      out.write("\t<!-- online fonts -->\n");
      out.write("\t<link href=\"//fonts.googleapis.com/css?family=Ubuntu+Condensed\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write(".myButton {\n");
      out.write("\t<!-- -moz-box-shadow:inset 0px 1px 3px 0px #91b8b3;\n");
      out.write("\t-webkit-box-shadow:inset 0px 1px 3px 0px #91b8b3;-->\n");
      out.write("\tbox-shadow:inset 0px 1px 3px 0px #91b8b3;\n");
      out.write("\tbackground:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #768d87), color-stop(1, #191f1f));\n");
      out.write("\tbackground:-moz-linear-gradient(top, #768d87 5%, #191f1f 100%);\n");
      out.write("\tbackground:-webkit-linear-gradient(top, #768d87 5%, #191f1f 100%);\n");
      out.write("\tbackground:-o-linear-gradient(top, #768d87 5%, #191f1f 100%);\n");
      out.write("\tbackground:-ms-linear-gradient(top, #768d87 5%, #191f1f 100%);\n");
      out.write("\tbackground:linear-gradient(to bottom, #768d87 5%, #191f1f 100%);\n");
      out.write("\tfilter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#768d87', endColorstr='#191f1f',GradientType=0);\n");
      out.write("\tbackground-color:#768d87;\n");
      out.write("\t-moz-border-radius:5px;\n");
      out.write("\t-webkit-border-radius:5px;\n");
      out.write("\tborder-radius:5px;\n");
      out.write("\tborder:1px solid #0f1412;\n");
      out.write("\tdisplay:inline-block;\n");
      out.write("\tcursor:pointer;\n");
      out.write("\tcolor:#ffffff;\n");
      out.write("\tfont-family:'Ubuntu Condensed',sans-serif;\n");
      out.write("\tfont-size:100%;\n");
      out.write("\tpadding:11px 23px;\n");
      out.write("\ttext-decoration:none;\n");
      out.write("\ttext-shadow:0px -1px 0px #2b665e;\n");
      out.write("}\n");
      out.write(".myButton:hover {\n");
      out.write("\tbackground:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #191f1f), color-stop(1, #768d87));\n");
      out.write("\tbackground:-moz-linear-gradient(top, #191f1f 5%, #768d87 100%);\n");
      out.write("\tbackground:-webkit-linear-gradient(top, #191f1f 5%, #768d87 100%);\n");
      out.write("\tbackground:-o-linear-gradient(top, #191f1f 5%, #768d87 100%);\n");
      out.write("\tbackground:-ms-linear-gradient(top, #191f1f 5%, #768d87 100%);\n");
      out.write("\tbackground:linear-gradient(to bottom, #191f1f 5%, #768d87 100%);\n");
      out.write("\tfilter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#191f1f', endColorstr='#768d87',GradientType=0);\n");
      out.write("\tbackground-color:#191f1f;\n");
      out.write("}\n");
      out.write(".myButton:active {\n");
      out.write("\tposition:relative;\n");
      out.write("\ttop:1px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
 Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/mydb?useSSL=false","root","PJFLAB07020103");
            String sql_query="select fname,party,phone from cand";
              PreparedStatement pstmt=conn.prepareStatement(sql_query);
              
              ResultSet rs=pstmt.executeQuery();
              
      out.write("\n");
      out.write("\t<header>\n");
      out.write("\t\t<h1 class=\"text-center\">Candidate List</h1>\n");
      out.write("\t</header>\n");
      out.write("\t<!-- team -->\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("                    ");
while(rs.next())
              {
                    
      out.write("\n");
      out.write("              \n");
      out.write("\t\t\t<div class=\"col-4\">\n");
      out.write("\t\t\t\t<div class=\"team-member\">\n");
      out.write("\t\t\t\t\t<div class=\"team-img\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/h1.jpg\" alt=\"team member\" class=\"img-fluid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"team-hover\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"desk\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Contact Me:</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p>");
      out.print(rs.getString(2));
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"s-link\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fab fa-facebook-f\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fab fa-twitter\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fab fa-google-plus-g\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"team-title\">\n");
      out.write("\t\t\t\t\t\t<h5>");
      out.print(rs.getString(1));
      out.write("</h5>\n");
      out.write("\t\t\t\t\t\t<span>Affiliated With :  ");
      out.print(rs.getString(3));
      out.write("</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                                                        ");
}
      out.write("\n");
      out.write("<!--\t\t\t<div class=\"col-4\">\n");
      out.write("\t\t\t\t<div class=\"team-member\">\n");
      out.write("\t\t\t\t\t<div class=\"team-img\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/t2.jpg\" alt=\"team member\" class=\"img-fluid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"team-hover\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"desk\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4>vehicula eleme!</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p>estibulum ac diam sit amet quam vehicula elementum.</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"s-link\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fab fa-facebook-f\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fab fa-twitter\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fab fa-google-plus-g\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"team-title\">\n");
      out.write("\t\t\t\t\t\t<h5>Franklin Harbet</h5>\n");
      out.write("\t\t\t\t\t\t<span>HR Manager</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-4\">\n");
      out.write("\t\t\t\t<div class=\"team-member\">\n");
      out.write("\t\t\t\t\t<div class=\"team-img\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/t3.jpg\" alt=\"team member\" class=\"img-fluid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"team-hover\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"desk\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4>vehicula eleme!</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p>estibulum ac diam sit amet quam vehicula elementum.</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"s-link\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fab fa-facebook-f\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fab fa-twitter\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fab fa-google-plus-g\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"team-title\">\n");
      out.write("\t\t\t\t\t\t<h5>Linda Anderson</h5>\n");
      out.write("\t\t\t\t\t\t<span>Marketing Manager</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>-->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- //team -->\n");
      out.write("\t\t<!-- team -->\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <a href=\"Success.jsp\" class=\"myButton\">Proceed to Vote</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
