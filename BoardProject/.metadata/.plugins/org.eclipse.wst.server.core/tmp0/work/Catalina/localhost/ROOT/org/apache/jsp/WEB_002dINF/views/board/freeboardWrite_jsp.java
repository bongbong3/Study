/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.50
 * Generated at: 2018-07-14 11:35:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class freeboardWrite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("<title>Free Board</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<link href=\"../resources/css/mainboard.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("\t\r\n");
      out.write("\t// 뒤로 가기 버튼 클릭\r\n");
      out.write("\t$('#btnBack').click(function() {\r\n");
      out.write("\t\tdocument.location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/callFreeboard.html\";\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t// 글 저장 버튼 클릭\r\n");
      out.write("\t$('#btnWriteBoard').click(function() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar formData = $('#fromFreebooardWrite').serialize();\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/freeboardWriteAction.do\"\r\n");
      out.write("\t\t\t, type : \"POST\"\r\n");
      out.write("\t\t\t, contentType : \"application/x-www-form-urlencoded; charset=UTF-8\"\r\n");
      out.write("\t\t\t, context : this\r\n");
      out.write("\t\t\t, data : formData\r\n");
      out.write("\t\t\t, dataType : \"json\"\r\n");
      out.write("\t\t\t, beforeSend : function() {\r\n");
      out.write("\t\t\t\t$('.wrap-loading').removeClass('display-none');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t, success : function(data) {\r\n");
      out.write("\t\t\t\tconsole.dir(data);\r\n");
      out.write("\t\t\t\talert('저장되었습니다.');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t, complete : function() {\r\n");
      out.write("\t\t\t\t$('.wrap-loading').addClass('display-none');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t, error : function() {\r\n");
      out.write("\t\t\t\t$('.wrap-loading').addClass('display-none');\r\n");
      out.write("\t\t\t\talert('오류가 발생했습니다.');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-full\">\t\r\n");
      out.write("\t<div class=\"mail-box\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../left.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<aside class=\"lg-side\">\r\n");
      out.write("\t\t\t<div class=\"inbox-head\">\r\n");
      out.write("\t\t\t\t<h3>Postodo</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"inbox-body\" style=\"padding-top: 90px;\">\r\n");
      out.write("           \r\n");
      out.write("\t\t\t\t<form id=\"fromFreebooardWrite\" class=\"form-horizontal\" role=\"form\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"userId\" name=\"createId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"name\" class=\"col-sm-2 control-label\">제목</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"freeboardTitle\" name=\"freeboardTitle\" placeholder=\"제목을 입력하세요.\" maxlength=\"100\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"message\" class=\"col-sm-2 control-label\">내용</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t<textarea class=\"form-control\" rows=\"4\" id=\"freeboardContent\" name=\"freeboardContent\" maxlength=\"100\" placeholder=\"내용을 입력하세요.\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"mail-option\">\r\n");
      out.write("\t\t\t\t\t<button id=\"btnBack\" name=\"btnBack\" class=\"btn btn-info btn-bg pull-right\" style=\"margin-left: 10px;\">뒤로</button>\r\n");
      out.write("\t\t\t\t\t<button id=\"btnWriteBoard\" name=\"btnWriteBoard\" class=\"btn btn-info btn-bg pull-right\">글쓰기</button>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("                   \r\n");
      out.write("\t        </div>\r\n");
      out.write("\t    </aside>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- </div>\t -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
