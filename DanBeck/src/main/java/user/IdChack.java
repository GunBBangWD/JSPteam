package user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonObject;

@WebServlet("/user/IdChack")
public class IdChack extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idchack = "아이디중복여부확인메시지";
		System.out.println("아이디체크 두포스트진입:  "+request.getParameter("id"));
		UsersDaoGun dao = new UsersDaoGun();
		
		
		JsonObject jsonObject = new JsonObject();
		if(dao.idDuplicateCheck(request.getParameter("id"))) {
			System.out.println("아이디중복없음");
			jsonObject.addProperty("idchack", "아이디중복없음");
		}else {
			System.out.println("아이디중복");
			jsonObject.addProperty("idchack", "아이디중복");
		}
		dao.close();
	    response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(jsonObject.toString());
	}

}


