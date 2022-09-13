package gameUI;

import java.sql.*;

public class DBConn {
    protected String sql = null;
    protected Connection conn = null;
    protected PreparedStatement pst = null;
    protected Statement st = null;
    protected ResultSet rs = null;

    public DBConn() {}
    public void getConn() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@project_high?TNS_ADMIN=/Users/joy/Applications/Oracle/wallet","hojin","Hgryu2002!@!^");
        }catch(Exception e) {
            System.out.println("DB연결 에러발생"+e.getMessage());
        }
    }
    public void close() {
        try {
            if(rs!=null)rs.close();
            if(pst!=null)pst.close();
            if(conn!=null)conn.close();
        }catch(Exception e) {
            System.out.println("DB종료가 실패하였습니다."+e.getMessage());
        }
    }
}
