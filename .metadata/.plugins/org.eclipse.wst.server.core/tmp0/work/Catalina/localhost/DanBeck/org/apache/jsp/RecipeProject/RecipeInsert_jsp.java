/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-22 06:48:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.RecipeProject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.servlet.*;

public final class RecipeInsert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1681121315264L));
    _jspx_dependants.put("jar:file:/C:/Users/hgh04/Documents/JSPteam/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/DanBeck/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("org.apache.commons.fileupload");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("org.apache.commons.fileupload.disk");
    _jspx_imports_packages.add("org.apache.commons.fileupload.servlet");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>삽입술</title>\r\n");
      out.write("<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("	<script src=\"../projectResources/javascript/Insert.js\"></script>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"styleSheet\" href=\"../projectResources/css/RecipeInsert.css\">\r\n");
      out.write("<script>\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../projectResources/Header.jsp", out, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("	<div class=\"insert_form\">\r\n");
      out.write("	<form action=\"../project/recipeWrite.do\" method=\"post\" onsubmit=\"return validateForm(this)\" enctype=\"multipart/form-data\">\r\n");
      out.write("	<input name=\"user_idx\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.user_idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("	<h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.user_idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("		<div class=\"insert_form_title\">\r\n");
      out.write("			<b>레시피 등록</b>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"insert_summary\">\r\n");
      out.write("			<div class=\"summary_title\">\r\n");
      out.write("				레시피 제목 <input type=\"text\" style=\"width: 610px;\"\r\n");
      out.write("					placeholder=\"예 ) 소고기 미역국 끓이기\" name=\"recipe_name\">\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"summary_describe\">\r\n");
      out.write("				요리 소개 <textarea name=\"recipe_desc\"\r\n");
      out.write("					style=\"height: 100px; width: 610px; resize: none;\"\r\n");
      out.write("					placeholder=\"이 레시피의 탄생배경을 적어주세요. 예) 남편의 생일을 맞아 소고기 미역국을 끓여봤어요. 어머니로부터 배운 미역국 레시피를 남편의 입맛에 맞게 고안했습니다.\"></textarea>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>\r\n");
      out.write("				<img id=\"mainPhotoHolder\" onclick=\"browseMainFile()\" src=\"../projectResources/img/camera.jpg\" style=\"width: 250px; height: 250px; cursor:pointer\">\r\n");
      out.write("				<input type=\"file\" name=\"mainPhotoUpload\" class=\"mainPhotoUpload\" id=\"mainPhotoUpload\" style=\"display: none;\">\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"summary_category\">\r\n");
      out.write("				<b>카테고리</b> <select name=\"select_category_1\" id=\"select_category_1\">\r\n");
      out.write("					<optgroup>\r\n");
      out.write("						<option>종류별</option>\r\n");
      out.write("						<option value=\"1\">밑반찬</option>\r\n");
      out.write("						<option value=\"2\">메인반찬</option>\r\n");
      out.write("						<option value=\"3\">국/탕</option>\r\n");
      out.write("						<option value=\"4\">찌개</option>\r\n");
      out.write("						<option value=\"5\">디저트</option>\r\n");
      out.write("						<option value=\"6\">면/만두</option>\r\n");
      out.write("						<option value=\"7\">밥/죽/떡</option>\r\n");
      out.write("						<option value=\"8\">퓨전</option>\r\n");
      out.write("						<option value=\"9\">김치/젓갈/장류</option>\r\n");
      out.write("						<option value=\"10\">양념/소스/잼</option>\r\n");
      out.write("						<option value=\"11\">양식</option>\r\n");
      out.write("						<option value=\"12\">샐러드</option>\r\n");
      out.write("						<option value=\"13\">스프</option>\r\n");
      out.write("						<option value=\"14\">빵/과자</option>\r\n");
      out.write("						<option value=\"15\">차/음료/술</option>\r\n");
      out.write("						<option value=\"16\">기타</option>\r\n");
      out.write("					</optgroup>\r\n");
      out.write("				</select> <select name=\"select_category_2\" id=\"select_category_2\">\r\n");
      out.write("					<optgroup>\r\n");
      out.write("						<option>상황별</option>\r\n");
      out.write("						<option value=\"1\">일상</option>\r\n");
      out.write("						<option value=\"2\">초스피드</option>\r\n");
      out.write("						<option value=\"3\">손님접대</option>\r\n");
      out.write("						<option value=\"4\">술안주</option>\r\n");
      out.write("						<option value=\"5\">다이어트</option>\r\n");
      out.write("						<option value=\"6\">도시락</option>\r\n");
      out.write("						<option value=\"7\">영양식</option>\r\n");
      out.write("						<option value=\"8\">간식</option>\r\n");
      out.write("						<option value=\"9\">야식</option>\r\n");
      out.write("						<option value=\"10\">푸드스타일링</option>\r\n");
      out.write("						<option value=\"11\">해장</option>\r\n");
      out.write("						<option value=\"12\">명절</option>\r\n");
      out.write("						<option value=\"13\">이유식</option>\r\n");
      out.write("						<option value=\"14\">기타</option>\r\n");
      out.write("					</optgroup>\r\n");
      out.write("				</select> <select name=\"select_category_3\" id=\"select_category_3\">\r\n");
      out.write("					<optgroup>\r\n");
      out.write("						<option>방법별</option>\r\n");
      out.write("						<option value=\"1\">볶음</option>\r\n");
      out.write("						<option value=\"2\">끓이기</option>\r\n");
      out.write("						<option value=\"3\">부침</option>\r\n");
      out.write("						<option value=\"4\">조림</option>\r\n");
      out.write("						<option value=\"5\">무침</option>\r\n");
      out.write("						<option value=\"6\">비빔</option>\r\n");
      out.write("						<option value=\"7\">찜</option>\r\n");
      out.write("						<option value=\"8\">절임</option>\r\n");
      out.write("						<option value=\"9\">튀김</option>\r\n");
      out.write("						<option value=\"10\">삶기</option>\r\n");
      out.write("						<option value=\"11\">굽기</option>\r\n");
      out.write("						<option value=\"12\">데치기</option>\r\n");
      out.write("						<option value=\"13\">회</option>\r\n");
      out.write("						<option value=\"14\">기타</option>\r\n");
      out.write("					</optgroup>\r\n");
      out.write("				</select> <select name=\"select_category_4\" id=\"select_category_4\">\r\n");
      out.write("					<optgroup label=\"재료별\">\r\n");
      out.write("						<option>재료별</option>\r\n");
      out.write("						<option value=\"1\">소고기</option>\r\n");
      out.write("						<option value=\"2\">돼지고기류</option>\r\n");
      out.write("						<option value=\"3\">닭류</option>\r\n");
      out.write("						<option value=\"4\">육류</option>\r\n");
      out.write("						<option value=\"5\">채소류</option>\r\n");
      out.write("						<option value=\"6\">해물류</option>\r\n");
      out.write("						<option value=\"7\">달걀/유제품</option>\r\n");
      out.write("						<option value=\"8\">가공식품류</option>\r\n");
      out.write("						<option value=\"9\">쌀</option>\r\n");
      out.write("						<option value=\"10\">밀가루</option>\r\n");
      out.write("						<option value=\"11\">건어물류</option>\r\n");
      out.write("						<option value=\"12\">버섯류</option>\r\n");
      out.write("						<option value=\"13\">과일류</option>\r\n");
      out.write("						<option value=\"14\">콩/견과류</option>\r\n");
      out.write("						<option value=\"15\">곡류</option>\r\n");
      out.write("						<option value=\"16\">기타</option>\r\n");
      out.write("					</optgroup>\r\n");
      out.write("				</select>\r\n");
      out.write("			</div>\r\n");
      out.write("			<br>\r\n");
      out.write("			<div class=\"summary_recipe_info\">\r\n");
      out.write("				<p>\r\n");
      out.write("					<b>요리정보</b>\r\n");
      out.write("				</p>\r\n");
      out.write("				요리양 <select name=\"recipe_amount\" id=\"select_info_1\">\r\n");
      out.write("					<optgroup label=\"몇인분기준\">\r\n");
      out.write("						<option value=\"1인분\" selected=\"selected\">1인분</option>\r\n");
      out.write("						<option value=\"2인분\">2인분</option>\r\n");
      out.write("						<option value=\"3인분\">3인분</option>\r\n");
      out.write("						<option value=\"4인분\">4인분</option>\r\n");
      out.write("						<option value=\"5인분\">5인분</option>\r\n");
      out.write("						<option value=\"6인분\">6인분 이상</option>\r\n");
      out.write("					</optgroup>\r\n");
      out.write("				</select> 요리시간 <select name=\"recipe_cooking_time\" id=\"select_info_2\">\r\n");
      out.write("					<optgroup label=\"시간\">\r\n");
      out.write("						<option>시간</option>\r\n");
      out.write("						<option value=\"5분 이내\" selected=\"selected\">5분 이내</option>\r\n");
      out.write("						<option value=\"10분 이내\">10분 이내</option>\r\n");
      out.write("						<option value=\"15분 이내\">15분 이내</option>\r\n");
      out.write("						<option value=\"20분 이내\">20분 이내</option>\r\n");
      out.write("						<option value=\"30분 이내\">30분 이내</option>\r\n");
      out.write("						<option value=\"60분 이내\">60분 이내</option>\r\n");
      out.write("						<option value=\"90분 이내\">90분 이내</option>\r\n");
      out.write("						<option value=\"2시간 이내\">2시간 이내</option>\r\n");
      out.write("						<option value=\"2시간 이상\">2시간 이상</option>\r\n");
      out.write("					</optgroup>\r\n");
      out.write("				</select> 요리난이도 <select name=\"recipe_difficulty\" id=\"select_info_3\">\r\n");
      out.write("					<optgroup label=\"난이도\">\r\n");
      out.write("						<option>난이도</option>\r\n");
      out.write("						<option value=\"아무나\" selected=\"selected\">아무나</option>\r\n");
      out.write("						<option value=\"초급\">초급</option>\r\n");
      out.write("						<option value=\"중급\">중급</option>\r\n");
      out.write("						<option value=\"고급\">고급</option>\r\n");
      out.write("						<option value=\"신의 경지\">신의 경지</option>\r\n");
      out.write("\r\n");
      out.write("					</optgroup>\r\n");
      out.write("				</select>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<br>\r\n");
      out.write("		<br>\r\n");
      out.write("		<br>\r\n");
      out.write("		<div class=\"insert_ingredients\">\r\n");
      out.write("			<span style=\"width: 100%;\">재료가 남거나 부족하지 않도록 정확한 계량정보를 적어주세요.</span>\r\n");
      out.write("			<div class=\"ingredient_group_div\">\r\n");
      out.write("				<li style=\"list-style-type: none;\">\r\n");
      out.write("					<!-- <p>\r\n");
      out.write("						<input type=\"text\" name=\"ingredient_group_title_1\" value=\"재료\"\r\n");
      out.write("							style=\"font-weight: bold; font-size: 18px; width: 210px;\"/>\r\n");
      out.write("					</p> -->\r\n");
      out.write("					<ul id=\"ingredient_group_list\">\r\n");
      out.write("						<li class=\"ingreTextList\" id=\"ingredient_text_list1\">\r\n");
      out.write("							<input name=\"ingredient_name[]\" type=\"text\" class=\"ingreInput\" placeholder=\"예)돼지고기\"></input> \r\n");
      out.write("							<input name=\"ingredient_amount[]\" type=\"text\" class=\"ingreInput\"  placeholder=\"예)300g\"></input>\r\n");
      out.write("							<img id=\"ingredient_text_list1_delBtn\" class=\"ingreDelBtn\" src=\"../projectResources/img/x-mark.png\">\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"ingreTextList\" id=\"ingredient_text_list2\">\r\n");
      out.write("							<input name=\"ingredient_name[]\" type=\"text\" class=\"ingreInput\" placeholder=\"예)양배추\"></input> \r\n");
      out.write("							<input name=\"ingredient_amount[]\" type=\"text\" class=\"ingreInput\" placeholder=\"예)1/2개\"></input>\r\n");
      out.write("							<img id=\"ingredient_text_list2_delBtn\" class=\"ingreDelBtn\" src=\"../projectResources/img/x-mark.png\">\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"ingreTextList\" id=\"ingredient_text_list3\"> \r\n");
      out.write("							<input name=\"ingredient_name[]\" type=\"text\" class=\"ingreInput\" placeholder=\"예)참기름\"></input> \r\n");
      out.write("							<input name=\"ingredient_amount[]\" type=\"text\" class=\"ingreInput\" placeholder=\"예)1T\"></input>\r\n");
      out.write("							<img id=\"ingredient_text_list3_delBtn\" class=\"ingreDelBtn\" src=\"../projectResources/img/x-mark.png\">\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"ingreTextList\" id=\"ingredient_text_list4\"> \r\n");
      out.write("							<input name=\"ingredient_name[]\" type=\"text\" class=\"ingreInput\" placeholder=\"예)소금\"></input> \r\n");
      out.write("							<input name=\"ingredient_amount[]\" type=\"text\" class=\"ingreInput\" placeholder=\"예)1/4T\"></input>\r\n");
      out.write("							<img id=\"ingredient_text_list4_delBtn\" class=\"ingreDelBtn\" src=\"../projectResources/img/x-mark.png\">\r\n");
      out.write("						</li>\r\n");
      out.write("					</ul>\r\n");
      out.write("					<div style=\"padding-left:12%\">\r\n");
      out.write("					<button type=\"button\" id=\"addIngredientGroup\" class=\"btn btn-outline-success\">추가</button>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"add_ingredient_group\">\r\n");
      out.write("			<span>※ 양념, 양념장, 소스, 드레싱, 토핑, 시럽, 육수 밑간 등으로 구분해서 작성해주세요.</span><br>\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("		<br><br>\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"recipe_step_form\">\r\n");
      out.write("			<div class=\"recipe_step_title\">\r\n");
      out.write("				<p class=\"cont_tit3\" style=\"font-weight: bold\">\r\n");
      out.write("					요리순서\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"recipe_step_guide\">\r\n");
      out.write("				<span class=\"guide mag_b_15\"><b>요리의 맛이 좌우될 수 있는 중요한 부분은 빠짐없이 적어주세요.</b><br>\r\n");
      out.write("					예) 10분간 익혀주세요 ▷ 10분간 약한불로 익혀주세요.<br>\r\n");
      out.write("					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;마늘편은 익혀주세요 ▷ 마늘편을 충분히 익혀주셔야 매운 맛이 사라집니다.<br>\r\n");
      out.write("					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;꿀을 조금 넣어주세요 ▷ 꿀이 없는 경우, 설탕 1스푼으로 대체 가능합니다.\r\n");
      out.write("	  			</span>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"recipe_step_detail\">\r\n");
      out.write("				<br>\r\n");
      out.write("				<div class=\"row step_row\">\r\n");
      out.write("					<div class=\"step_div\" id=\"step_div1\">\r\n");
      out.write("						<p class=\"step_p\">🔻</p>\r\n");
      out.write("						<div id=\"step_div_text1\">\r\n");
      out.write("							<textarea name=\"step_text[]\" class=\"form-control step_cont\" placeholder=\"예) 소고기는 기름기를 떼어내고 적당한 크기로 썰어주세요.\"></textarea>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div id=\"step_div_photo1\">\r\n");
      out.write("							<img name=\"step_img_photo[]\" id=\"step_img_photo1\" class=\"stepDivPhoto\" src=\"../projectResources/img/imageAdd.png\">\r\n");
      out.write("							\r\n");
      out.write("  							<input type=\"file\" name=\"fileUpload\" class=\"fileUpload\" id=\"fileUpload1\" style=\"display: none;\" multiple=\"multiple\">\r\n");
      out.write("  						</div>\r\n");
      out.write("  										\r\n");
      out.write("  						<img id=\"step_div_text1_delBtn\" class=\"stepDelBtn\" src=\"../projectResources/img/file-x.svg\">\r\n");
      out.write("  						<br>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div style=\"padding-left: 15%\">\r\n");
      out.write("					<button type=\"button\" class=\"btn btn-outline-primary\" id=\"addStepDetailGroup\" style=\"border: 1px solid grey\">순서 추가</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<br>			\r\n");
      out.write("			<br>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- <div class=\"recipe_step_donePhotos\">\r\n");
      out.write("				<p style=\"font-weight: bold; font-size: 15px\">요리 완성 사진</p>\r\n");
      out.write("				<img src=\"../projectResources/img/imageAdd.png\" id=\"stepPhotoHolder_1\" onclick=\"uploadFile()\" src=\"\" width=\"120\" height=\"120\" style=\"cursor:pointer\">\r\n");
      out.write("				\r\n");
      out.write("			</div> -->\r\n");
      out.write("		<div class=\"recipe_tips\">\r\n");
      out.write("			<p>요리팁</p>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<button type=\"submit\">저장</button>\r\n");
      out.write("		<button type=\"reset\">초기화</button>\r\n");
      out.write("		<button type=\"button\" onclick=\"\">취소</button>\r\n");
      out.write("	</form>\r\n");
      out.write("	</div> \r\n");
      out.write("	\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /RecipeProject/RecipeInsert.jsp(24,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user==null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("		<script type=\"text/javascript\">\r\n");
          out.write("			alert('글쓰기는 로그인을 해야합니다.');\r\n");
          out.write("			location.href='../project/loginCheck.do'; \r\n");
          out.write("		</script>\r\n");
          out.write("	");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
