package db;

import model.SignInVO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnectSingletonHelper {
    // 하나의 프로세스에서 공통으로 사용할 수 있는 공용자원 (static)
    private static Connection  conn;
    private dbConnectSingletonHelper() {  }

    public static Connection getConnection(String dsn) {
        //Connection conn = null;
        if( conn != null ) {
            return conn;
        }

        try {
            if( dsn.equals("mysql") ) {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("org.gjt.mm.mysql.Driver","kingsmile", "mysql");

            } else if( dsn.equals("oracle") ) {
                Class.forName("oracle.jdbc.OracleDriver");
                conn = DriverManager.getConnection("jdbc:oracle:thin:@project_high?TNS_ADMIN=/Users/joy/Applications/Oracle/wallet","joy", "xxxxxxAt22cc");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return conn;
        }
    }

    public static void close() throws SQLException {
        if ( conn != null ) {
            if( !conn.isClosed() ) {
                conn.close();
            }
        }
    }

    public static void menu() {
        System.out.println("\n-=-=-=-=-= 끝말잇기 회원가입 =-=-=-=-=-");
        System.out.println("\t 1. 회원가입 ");
        System.out.println("\t 2. 회원 정보 수정 ");
        System.out.println("\t 3. 회원 탈퇴 ");
        System.out.println("\t 4. 로그인 ");
        System.out.println("\t 9. 나가기 ");
        System.out.println("\t >> 원하는 메뉴 선택 하세요.  ");
    }
}











