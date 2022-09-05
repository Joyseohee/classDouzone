import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTestSelect {

	public static void main(String args[]) throws SQLException {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		// 드라이버 로드, 오픈, 연결
		conn = DBConnection.getConnection();

		// 사용 : dml 명령어
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery("SELECT * FROM dept");

			while (rset.next()) {
				System.out.print(rset.getInt(1) + "\t");
				System.out.print(rset.getString(2) + "\t");
				System.out.println(rset.getString(3));
			}
		}

		finally {
			if (rset != null)
				rset.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	}

}