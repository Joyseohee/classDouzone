package dbConn.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
	// 함수(접근자 :  public, static )
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		try {
			if( dsn.equals("mysql") ) {
				Class.forName("com.mysql.jdbc.Driver");
			    conn = DriverManager.getConnection("org.gjt.mm.mysql.Driver","kingsmile", "mysql"); 
			    
			} else if( dsn.equals("oracle") ) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@project_high?TNS_ADMIN=/Users/joy/Applications/Oracle/wallet",
						"HOJIN", "Hgryu2002!@!^");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;	
		}
	}

	/* 삭제
	public static Connection getConnection(String dsn, String userid, String pwd) {
		Connection conn = null;
		try {
			if( dsn.equals("mysql") ) {
				Class.forName("com.mysql.jdbc.Driver");
			    conn = DriverManager.getConnection("org.gjt.mm.mysql.Driver", userid, pwd); 
			    
			} else if( dsn.equals("oracle") ) {
				Class.forName("oracle.jdbc.OracleDriver");
			    conn = DriverManager.getConnection("jdbc:oracle:thin:@project_high?TNS_ADMIN=/Users/joy/Applications/Oracle/wallet",userid, pwd);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;	
		}
	}
	
	public static void menu() {
		System.out.println("\n-=-=-=-=-= JDBC Query =-=-=-=-=-");
		System.out.println("\t 0. rollback ");
		System.out.println("\t 1. commit ");
		System.out.println("\t 2. 전체 보기1 ");
		System.out.println("\t 3. 전체 보기2 ");
		System.out.println("\t 4. id로 검색 ");
		System.out.println("\t 5. word로 검색 ");
		System.out.println("\t 6. 프로그램 종료 ");
		System.out.println(">> 원하는 메뉴 선택 하세요.  ");
	}
	*/
}








