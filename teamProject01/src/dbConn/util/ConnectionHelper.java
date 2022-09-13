package dbConn.util;
/*
    DB 연결 정보 반복적으로 코딩 해결
    다른 클래스에서 아래 코드 구현을 하지 않도록 설계
    
    Class.forName("oracle.jdbc.OracleDriver");
    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","kingsmile", "oracle"); 
    
    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@edudb_high?TNS_ADMIN=G:/내 드라이브/Wallet_edudb",
						"hojin", "Hgryu2002!@!^");
    
    이런식으로 사용
    ConnectionHelper.getConnection("mysql") or ("oracle"),....
    dsn ==> data source name      
 */

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
	
	public static Connection getConnection(String dsn, String userid, String pwd) {
		Connection conn = null;
		try {
			if( dsn.equals("mysql") ) {
				Class.forName("com.mysql.jdbc.Driver");
			    conn = DriverManager.getConnection("org.gjt.mm.mysql.Driver", userid, pwd); 
			    
			} else if( dsn.equals("oracle") ) {
				Class.forName("oracle.jdbc.OracleDriver");
			    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",userid, pwd); 
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
	
}








