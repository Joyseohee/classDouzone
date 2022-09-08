package ex1_1;

import java.util.ArrayList;
import java.util.List;

public class WordSignUpDAO extends DBConn{

	public WordSignUpDAO() {}
	public List<WordSignUpVO> LoginAllSelect(){
		List<WordSignUpVO> lst = new ArrayList<WordSignUpVO>();
		try {
			getConn();
			sql = "select user_id, user_pwd from ac_user";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				WordSignUpVO vo = new WordSignUpVO(rs.getString(0),rs.getString(1));
				lst.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return lst;
	}
	
	public int getLogin(String user_id,String user_pwd){
		List<WordSignUpVO> lst = new ArrayList<WordSignUpVO>();
		
		int state = 0;
		try {
			getConn();
			sql = "select user_id, user_pwd from ac_user where user_id = ? and user_pwd = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			pstmt.setString(2, user_pwd);
			
			rs = pstmt.executeQuery();
			if(rs.next()) state = 1;
			
		} catch(Exception e) {
			System.out.println("DB 아이디 비밀번호 확인에러"+e.getMessage());
		} finally {
			dbClose();
		}
		return state;
	}
	
}
