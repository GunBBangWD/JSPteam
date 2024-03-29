package user;

import DBpackage.DBConnectpool;
import recipe.dto.SessionDto;
import recipe.dto.UsersDto;

public class UsersDaoGun extends DBConnectpool {
	public UsersDaoGun() {
		super();
	}
	
	public String loginProcess(String user_id, String user_pw) {  //customer 가 모델객체입니다.(로그인정보 저장된상태)
		String result = "";
		String sql = "select * from users where user_id=? and user_pw=?";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1,user_id);
			psmt.setString(2, user_pw);
			rs=psmt.executeQuery();
			if(rs.next()) {
				result=user_id;
			}
		} catch (Exception e) {
			System.out.println("로그인 Check중 DB 에러");
			e.printStackTrace();
		}
		return result;
	}
	
	
	public SessionDto sessionLogin(String idx) {
		SessionDto dto = new SessionDto();
		String sql="select * from users where user_idx=?";
		try {
			psmt=con.prepareStatement(sql);
			psmt.setString(1, idx);
			rs=psmt.executeQuery();
			if(rs.next()) {
				dto.setUser_id(rs.getString("user_id"));
				dto.setUser_name(rs.getString("user_name"));
				dto.setUser_nickname(rs.getString("user_nickname"));
				dto.setUser_idx(rs.getString("user_idx"));
			}
		} catch (Exception e) {
			System.out.println("유저 정보 조회 중 DB 에러");
			e.printStackTrace();
		}
		return dto;
	}
	
	public int joinUser(UsersDto dto) {
		int res=0;
		String sql = "insert into users(user_id, user_pw, user_name, user_nickname, user_email, user_address, user_phone) values(?,?,?,?,?,?,?)";
		try {
			psmt=con.prepareStatement(sql);
			psmt.setString(1, dto.getUser_id());
			psmt.setString(2, dto.getUser_pw());
			psmt.setString(3, dto.getUser_name());
			psmt.setString(4, dto.getUser_nickname());
			psmt.setString(5, dto.getUser_email());
			psmt.setString(6, dto.getUser_address());
			psmt.setString(7, dto.getUser_phone());
			res = psmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("회원 가입중 오류");
			e.printStackTrace();
		}
		return res;
	}
	
	public boolean idDuplicateCheck(String user_id) {
		boolean res = true;
		String sql = "select user_id from users where user_id=?";
		try {
			psmt=con.prepareStatement(sql);
			psmt.setString(1, user_id);
			rs = psmt.executeQuery();
			if(rs.next()) {
				res=false;
				System.out.println("중복");
			}
		} catch (Exception e) {
			System.out.println("중복 체크중 DB 에러");
			e.printStackTrace();
		}		
		return res;
	}
	
	
	public boolean nickDuplicateCheck(String user_nickname) {
		boolean res = true;
		String sql = "select user_nickname from users where user_nickname=?";
		try {
			psmt=con.prepareStatement(sql);
			psmt.setString(1, user_nickname);
			rs = psmt.executeQuery();
			if(rs.next()) {
				res=false;
				System.out.println("중복");
			}
		} catch (Exception e) {
			System.out.println("중복 체크중 DB 에러");
			e.printStackTrace();
		}		
		return res;
	}
	
	
	public String idCheck(String user_name, String user_email) {
		String res = "정보와 일치하는 아이디 없음";
		String sql = "SELECT user_id FROM users WHERE user_name=? AND user_email=?";
		try {
			psmt=con.prepareStatement(sql);
			psmt.setString(1, user_name);
			psmt.setString(2, user_email);
			rs = psmt.executeQuery();
			if(rs.next()) {
				res=rs.getString("user_id");
				System.out.println("있음");
			}
		} catch (Exception e) {
			System.out.println("아이디찾기중 DB 에러");
			e.printStackTrace();
		}		
		return res;
	}
	
	public String pwCheck(String user_id, String user_name, String user_email) {
		String res = "정보와 일치하는 비밀번호 없음";
		String sql = "SELECT user_pw FROM users WHERE user_id=? AND user_name=? AND user_email=?";
		System.out.println(user_id);
		System.out.println(user_name);
		System.out.println(user_email);
		try {
			psmt=con.prepareStatement(sql);
			psmt.setString(1, user_id);
			psmt.setString(2, user_name);
			psmt.setString(3, user_email);
			rs = psmt.executeQuery();
			if(rs.next()) {
				res=rs.getString("user_pw");
				System.out.println("있음");
			}
		} catch (Exception e) {
			System.out.println("비번찾기 DB 에러");
			e.printStackTrace();
		}		
		return res;
	}
	
	
}
