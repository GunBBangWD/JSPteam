package user;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import recipe.utility.NaverSmtp;

@WebServlet("/user/EmailChack.do")
public class EmailChack extends HttpServlet{
String key=null;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("이메일 체크 두겟 진입");
		System.out.println(request.getParameter("email"));
		// TODO Auto-generated method stub
		Map<String, String> emailInfo = new HashMap();
		emailInfo.put("from", "hgh0425@naver.com");  // 보내는 사람
		emailInfo.put("to", request.getParameter("email"));      // 받는 사람
		emailInfo.put("subject", "인증을 위한 메일");  // 제목

		// 내용은 메일 포맷에 따라 다르게 처리
		String content = "랜덤문자";  // 내용
		String format = "text";    // 메일 포맷(text 혹은 html)
		if (format.equals("text")) {
		    // 텍스트 포맷일 때는 그대로 저장
		    emailInfo.put("content", content);
		    emailInfo.put("format", "text/plain;charset=UTF-8");
		}
		
		try {
		    NaverSmtp smtpServer = new NaverSmtp();  // 메일 전송 클래스 생성
		    smtpServer.emailSending(emailInfo);      // 전송
		    System.out.println("이메일 전송 성공");
		}
		catch (Exception e) {
			System.out.println("이메일 전송 실패");
		    e.printStackTrace();
		}

		key=content;
		System.out.println("-----------------------이메일전송끝--------------구분용-                  ------");
		
		request.getRequestDispatcher("../Storage/Join.jsp").forward(request, response);
		return;
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sendkey="메일인증안됨";
		System.out.println("이메일체크 두포스트진입 보낸 문자:  "+key);
		System.out.println("입력한 문자: "+request.getParameter("key"));
		if(key.equals(request.getParameter("key"))) {
			System.out.println("인증번호 동일");
			sendkey="메일인증성공";
		}
		JsonObject jsonObject = new JsonObject();
	    jsonObject.addProperty("keychack", sendkey);
	     
		// TODO Auto-generated method stub
//		request.setAttribute("keychack", "suck");
		
//		request.getRequestDispatcher("../Storage/Join.jsp").forward(request, response);
		
//		response.setContentType("text/plain");
//		response.setCharacterEncoding("UTF-8");
//		response.getWriter().write("전송할 데이터");
		
       
//	        JsonArray jsonArray = new JsonArray();
//        for (String s : list) {
//          jsonArray.add(new JsonPrimitive(s));
//          System.out.println(s);
//        }
//        jsonObject.add("suggestions", jsonArray);
        
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(jsonObject.toString());
		
//		request.setAttribute("result", "sunggong");
//		request.setAttribute("keychack", "suck");
//	    RequestDispatcher dispatcher = request.getRequestDispatcher("../Storage/Join.jsp");
//	    dispatcher.forward(request, response);
	    
	    return;
		
	}
	
	

}
