/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.50
 * Generated at: 2018-07-14 13:37:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class left_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<aside class=\"sm-side\">\r\n");
      out.write("\t<div class=\"user-head\">\r\n");
      out.write("\t\t<a class=\"inbox-avatar\" href=\"javascript:;\">\r\n");
      out.write("\t\t\t<img  width=\"64\" height=\"60\" src=\"../resources/image/profile/jth.png\">\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<div class=\"user-name\">\r\n");
      out.write("\t\t\t<h5><a href=\"#\">AACII</a></h5>\r\n");
      out.write("\t\t\t<span class=\"label label-default\">kfx2064@naver.com</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("          </div>\r\n");
      out.write("\t<div class=\"inbox-body\">\r\n");
      out.write("\t\t<a href=\"#myModal\" data-toggle=\"modal\"  title=\"Compose\"    class=\"btn btn-compose\">\r\n");
      out.write("\t\t\tLogout\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<!-- Modal -->\r\n");
      out.write("\t\t<div aria-hidden=\"true\" aria-labelledby=\"myModalLabel\" role=\"dialog\" tabindex=\"-1\" id=\"myModal\" class=\"modal fade\" style=\"display: none;\">\r\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t<button aria-hidden=\"true\" data-dismiss=\"modal\" class=\"close\" type=\"button\">×</button>\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"modal-title\">Compose</h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t<form role=\"form\" class=\"form-horizontal\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-lg-2 control-label\">To</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-lg-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"\" id=\"inputEmail1\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                   </div>\r\n");
      out.write("                                   <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-lg-2 control-label\">Cc / Bcc</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-lg-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"\" id=\"cc\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                   </div>\r\n");
      out.write("                                   <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-lg-2 control-label\">Subject</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-lg-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"\" id=\"inputPassword1\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                   </div>\r\n");
      out.write("                                   <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-lg-2 control-label\">Message</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-lg-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea rows=\"10\" cols=\"30\" class=\"form-control\" id=\"\" name=\"\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                   </div>\r\n");
      out.write("\r\n");
      out.write("                                   <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-lg-offset-2 col-lg-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"btn green fileinput-button\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-plus fa fa-white\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>Attachment</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"file\" name=\"files[]\" multiple=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-send\" type=\"submit\">Send</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div><!-- /.modal-content -->\r\n");
      out.write("\t\t\t</div><!-- /.modal-dialog -->\r\n");
      out.write("\t\t</div><!-- /.modal -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<ul class=\"nav nav-pills nav-stacked labels-info inbox-divider middle-navigation\" style=\"height:500px;\">\r\n");
      out.write("\t\t\t<li> <h4>메뉴</h4> </li>\r\n");
      out.write("\t\t\t<li> <a href=\"#\"> <i class=\" fa fa-sign-blank text-danger\"></i> 자유게시판 </a> </li>\r\n");
      out.write("\t\t</ul>             \r\n");
      out.write("</aside>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
