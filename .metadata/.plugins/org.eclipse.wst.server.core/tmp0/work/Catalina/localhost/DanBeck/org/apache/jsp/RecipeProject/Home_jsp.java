/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-29 07:37:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.RecipeProject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>공지사항</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/css.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"board_wrap\">\r\n");
      out.write("        <div class=\"board_title\">\r\n");
      out.write("            <strong>공지사항</strong>\r\n");
      out.write("            <p>공지사항을 빠르고 정확하게 안내해드립니다.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"board_list_wrap\">\r\n");
      out.write("            <div class=\"board_list\">\r\n");
      out.write("                <div class=\"top\">\r\n");
      out.write("                    <div class=\"num\">번호</div>\r\n");
      out.write("                    <div class=\"title\">제목</div>\r\n");
      out.write("                    <div class=\"writer\">글쓴이</div>\r\n");
      out.write("                    <div class=\"date\">작성일</div>\r\n");
      out.write("                    <div class=\"count\">조회</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"num\">5</div>\r\n");
      out.write("                    <div class=\"title\"><a href=\"view.html\">글 제목이 들어갑니다.</a></div>\r\n");
      out.write("                    <div class=\"writer\">김이름</div>\r\n");
      out.write("                    <div class=\"date\">2021.1.15</div>\r\n");
      out.write("                    <div class=\"count\">33</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"num\">4</div>\r\n");
      out.write("                    <div class=\"title\"><a href=\"view.html\">글 제목이 들어갑니다.</a></div>\r\n");
      out.write("                    <div class=\"writer\">김이름</div>\r\n");
      out.write("                    <div class=\"date\">2021.1.15</div>\r\n");
      out.write("                    <div class=\"count\">33</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"num\">3</div>\r\n");
      out.write("                    <div class=\"title\"><a href=\"view.html\">글 제목이 들어갑니다.</a></div>\r\n");
      out.write("                    <div class=\"writer\">김이름</div>\r\n");
      out.write("                    <div class=\"date\">2021.1.15</div>\r\n");
      out.write("                    <div class=\"count\">33</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"num\">2</div>\r\n");
      out.write("                    <div class=\"title\"><a href=\"view.html\">글 제목이 들어갑니다.</a></div>\r\n");
      out.write("                    <div class=\"writer\">김이름</div>\r\n");
      out.write("                    <div class=\"date\">2021.1.15</div>\r\n");
      out.write("                    <div class=\"count\">33</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"num\">1</div>\r\n");
      out.write("                    <div class=\"title\"><a href=\"view.html\">글 제목이 들어갑니다.</a></div>\r\n");
      out.write("                    <div class=\"writer\">김이름</div>\r\n");
      out.write("                    <div class=\"date\">2021.1.15</div>\r\n");
      out.write("                    <div class=\"count\">33</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"board_page\">\r\n");
      out.write("                <a href=\"#\" class=\"bt first\"><<</a>\r\n");
      out.write("                <a href=\"#\" class=\"bt prev\"><</a>\r\n");
      out.write("                <a href=\"#\" class=\"num on\">1</a>\r\n");
      out.write("                <a href=\"#\" class=\"num\">2</a>\r\n");
      out.write("                <a href=\"#\" class=\"num\">3</a>\r\n");
      out.write("                <a href=\"#\" class=\"num\">4</a>\r\n");
      out.write("                <a href=\"#\" class=\"num\">5</a>\r\n");
      out.write("                <a href=\"#\" class=\"bt next\">></a>\r\n");
      out.write("                <a href=\"#\" class=\"bt last\">>></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"bt_wrap\">\r\n");
      out.write("                <a href=\"write.html\" class=\"on\">등록</a>\r\n");
      out.write("                <!--<a href=\"#\">수정</a>-->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html> ");
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
