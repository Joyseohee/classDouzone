package gameUI;

public class WordLoginDAO extends DBConn {

	public WordLoginDAO() {}
	public int getLogin(String user_id,String user_pwd){
		WordLoginVO Loginvo = new WordLoginVO();
		int state = 0;
		try {
			getConn();
			sql = "select * from GUSER where U_ID = '" + user_id + "' and U_PWD = '" + user_pwd + "'";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) state = 1;
		} catch(Exception e) {
			System.out.println("DB 아이디 비밀번호 확인에러 " + e.getMessage());
		} finally {
			close();
		}
		return state;
	}
	
}
