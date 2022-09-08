package ex1_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// ConnectionHelper 클래스의 문제 -> 매번 드라이브 로드.. connection 생성..
// 만들어서 재사용 하자 ~~  
// 공유자원으로 쓰자 ~~ singleton

public class ConnectionSingletonHelper {
//private으로 숨긴다 ..
	private static Connection conn;

	private ConnectionSingletonHelper() {
	}

	public static Connection getConnection(String dsn) {
		if (conn != null) {
			return conn;
		}
		try {
			if (dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@kosaDB_high?TNS_ADMIN=C:/Oracle/Wallet_kosaDB",
						"user05", "xxxxxxAt22cc");

			} else if (dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@kosaDB_high?TNS_ADMIN=C:/Oracle/Wallet_kosaDB",
						"user05", "xxxxxxAt22cc");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}

	public static void close()throws SQLException {
		if(conn != null) {
			if(!conn.isClosed()) {
				conn.close();
			}
		}
	}
}
