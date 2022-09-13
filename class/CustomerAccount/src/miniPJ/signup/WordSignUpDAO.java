package miniPJ.signup;

import miniPJ.db.DBConn;

import java.sql.SQLException;

public class WordSignUpDAO extends DBConn {

	public WordSignUpDAO() {}
	// 회원가입 db insert
	public int SignUpInsert(WordSignUpVO vo) {
		int result = 0;
		try{
			getConn();
			sql = "insert into GUSER(U_NAME,U_ID,U_PWD,BIRTH) VALUES ( ?, ?, ?, ? )";
			pst = conn.prepareStatement(sql);

			pst.setString(1, vo.getUser_name());
			pst.setString(2, vo.getUser_id());
			pst.setString(3, vo.getUser_pwd());
			pst.setString(4, vo.getUser_birth());

			result = pst.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			close();
		}

		return result;
	}

	// 회원가입 아이디 중복 확인
	public boolean selectID(String idSearch) throws SQLException {
		getConn();

		sql = "select * from GUSER where U_ID = ? ";
		pst = conn.prepareStatement(sql);
		pst.setString(1, idSearch);
		rs = pst.executeQuery();

		if (rs.next()) {    // 중복 있음
			close();
			return false;
		} else {    // 중복 없음
			close();
			return true;
		}

	}
	/*
	// 회원 아이디 비밀번호 검색, 회원 유무 확인
	public List<WordSignUpVO> getidCheck(String user_id){
		List<WordSignUpVO> lst = new ArrayList<WordSignUpVO>();		
		try {
			getConn();
			sql = "SELECT U_ID FROM LOGIN WHERE U_ID = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user_id);

			rs = pst.executeQuery();
			while(rs.next()) {
				WordSignUpVO vo = new WordSignUpVO();
				vo.setUser_id(rs.getString(1));
				lst.add(vo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return lst;
	}
	 */
}