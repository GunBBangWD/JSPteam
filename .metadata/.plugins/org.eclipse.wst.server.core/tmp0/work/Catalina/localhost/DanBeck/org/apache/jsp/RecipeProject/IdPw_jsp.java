/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-24 00:57:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.RecipeProject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IdPw_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>아이디 찾기</title>\r\n");
      out.write("	<link href=\"https://fonts.googleapis.com/earlyaccess/notosanskr.css\" rel=\"stylesheet\">\r\n");
      out.write("	<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("	<style>\r\n");
      out.write("        .login-form {\r\n");
      out.write("            max-width: 400px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            padding: 2rem;\r\n");
      out.write("            border: 1px solid #e3e3e3;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            background-color: #ffffff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .text-field {\r\n");
      out.write("            margin-bottom: 1.5rem;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .submit-btn {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            margin-bottom: 1.5rem;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"login-form\">\r\n");
      out.write("        <form id=\"find-password-form\">\r\n");
      out.write("            <div class=\"mb-3\">\r\n");
      out.write("                <input id=\"pw_id\" type=\"text\" name=\"id\" class=\"form-control text-field\" placeholder=\"아이디\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb-3\">\r\n");
      out.write("                <input id=\"pw_name\" type=\"text\" name=\"name\" class=\"form-control text-field\" placeholder=\"이름\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb-3\">\r\n");
      out.write("                <input id=\"pw_email\" type=\"text\" name=\"email\" class=\"form-control text-field\" placeholder=\"이메일\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb-3\">\r\n");
      out.write("                <input type=\"submit\" value=\"비밀번호 찾기\" class=\"btn btn-primary submit-btn\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <form id=\"find-id-form\">\r\n");
      out.write("        	<div class=\"mb-3\">\r\n");
      out.write("                <input id=\"id_id\" type=\"hidden\" name=\"id\" class=\"form-control text-field\" value=\"아이디찾기\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb-3\">\r\n");
      out.write("                <input id=\"id_name\" type=\"text\" name=\"name\" class=\"form-control text-field\" placeholder=\"이름\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb-3\">\r\n");
      out.write("                <input id=\"id_email\" type=\"text\" name=\"email\" class=\"form-control text-field\" placeholder=\"이메일\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb-3\">\r\n");
      out.write("                <input type=\"submit\" value=\"아이디 찾기\" class=\"btn btn-primary submit-btn\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("        $('#find-password-form').on('submit', function(e) {\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type: 'post',\r\n");
      out.write("                url: '../user/IdPwChack',\r\n");
      out.write("                data : {                       // 매개변수로 전달할 데이터\r\n");
      out.write("                    id : $('#pw_id').val(),                  // 값보내는 예시\r\n");
      out.write("                    name : $('#pw_name').val(),\r\n");
      out.write("                    email : $('#pw_email').val()\r\n");
      out.write("                },\r\n");
      out.write("                dataType : \"json\",\r\n");
      out.write("                success: function(response) {\r\n");
      out.write("                    alert(\"비밀번호 : \"response.message);\r\n");
      out.write("                    window.location.href = \"../project/loginCheck.do\";\r\n");
      out.write("                },\r\n");
      out.write("                error: function(jqXHR, textStatus, errorThrown) {\r\n");
      out.write("                    alert('에러가 발생했습니다. 다시 시도해주세요.');\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $('#find-id-form').on('submit', function(e) {\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type: 'POST',\r\n");
      out.write("                url: '../user/IdPwChack',\r\n");
      out.write("                data : {                       // 매개변수로 전달할 데이터\r\n");
      out.write("                	id : $('#id_id').val(),                     // 값보내는 예시\r\n");
      out.write("                    name : $('#id_name').val(),\r\n");
      out.write("                    email : $('#id_email').val()\r\n");
      out.write("                },\r\n");
      out.write("                dataType : \"json\",\r\n");
      out.write("                success: function(response) {\r\n");
      out.write("                    alert(\"아이디 : \"response.message);\r\n");
      out.write("                },\r\n");
      out.write("                    error: function(jqXHR, textStatus, errorThrown) {\r\n");
      out.write("                        alert('에러가 발생했습니다. 다시 시도해주세요.');\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\r\n");
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