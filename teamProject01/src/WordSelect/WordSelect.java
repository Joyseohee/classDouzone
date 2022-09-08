package WordSelect;

import db.CloseHelper;
import db.dbConnectSingletonHelper;

import java.sql.*;
import java.util.Scanner;

public class WordSelect {

    // 멤버 변수
    private static Scanner sc = new Scanner(System.in);
    private static Statement st;
    private static ResultSet rs;
    private static Connection conn;
    private static PreparedStatement pst;

    // 단어 db
    public final String ClassName = "GAME";
    private static String GWORD;
    private static String sql;

    // db 연결
    public static void connect() {
        try {
            conn = dbConnectSingletonHelper.getConnection("oracle", "joy", "xxxxxxAt22cc");
            st = conn.createStatement();
            conn.setAutoCommit(true);
        } catch (Exception var1) {
            System.out.println("연결유실");
        }
    }

    // db 연결 해제
    public static void close() {
        try {
            if (rs != null) {
                CloseHelper.close(rs);
                CloseHelper.close(st);
                CloseHelper.close(pst);
                CloseHelper.close(conn);
            }
        } catch (Exception var1) {
            var1.printStackTrace();
        }
    }

    // 게임 중 중복확인
    public static void game() throws SQLException {
        connect();
//        conn.commit();
        GWORD = sc.next();

        try {
            // 중복단어 없을 경우

            sql = "INSERT INTO GAME(GWORD) VALUES( ? )";
            pst = conn.prepareStatement(sql);
            pst.setString(1, GWORD);
            pst.executeUpdate();

            System.out.println("게임을 계속합니다.");

        } catch (Exception e) {
            // 중복된 단어가 있을 경우
            System.out.println("종료");
        }
//        conn.commit();
        close();
    }


    // 불린
    public static boolean gameB() throws SQLException {
        connect();
        GWORD = sc.next();
        Statement st = conn.createStatement();
        ResultSet r = st.executeQuery("SELECT * FROM GAME where GWORD = '" + GWORD + "'");

        if (r.next() == false) {    // 중복 없음
            sql = "INSERT INTO GAME(GWORD) VALUES( ? )";
            pst = conn.prepareStatement(sql);
            pst.setString(1, GWORD);
            pst.executeUpdate();
            return true;    // 중복 없음
        } else {    // 중복 있음
            return false;   // 중복 있음
        }
    }

    // 테이블 삭제
    // @drop 함수 : 테이블 완전 삭제
    public static void dropT() throws SQLException {
        conn.commit();
        connect();
        try {
            sql =  "DROP TABLE GAME";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate(sql);
            System.out.println("테이블이 drop 되었습니다.");
        } catch(Exception e) {
            System.out.println("게임을 계속할 수 없습니다 ***** 테이블 drop 오류");
        }
        conn.commit();
        close();
    }

    // @truncate 함수 : 테이블 구조는 남겨두고 레코드만 삭제
    public static void truncateT() throws SQLException {
        connect();
        conn.commit();
        try {
            sql = "TRUNCATE TABLE GAME";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate(sql);
            System.out.println("테이블이 truncate 되었습니다.");
        } catch(Exception e) {

            e.printStackTrace();
            System.out.println("게임을 계속할 수 없습니다 ***** 테이블 truncate 오류");
        }
        conn.commit();
        close();
    }


    // 테이블 생성
    // create table
    public static void createT() throws SQLException {
        connect();
        conn.commit();
        try {
            sql = "CREATE TABLE \"GAME\" (\n" +
                    "    GWORD VARCHAR2(30)\n" +
                    "        CONSTRAINT \"PK_GWORD\" PRIMARY KEY\n" +
                    "        CONSTRAINT \"RE_GWORD\" CHECK (REGEXP_LIKE(GWORD, '^[가-힣]{2,6}')))";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate(sql);
            System.out.println("테이블이 create 되었습니다.");
        } catch(Exception e) {
            System.out.println("게임을 계속할 수 없습니다 ***** 테이블 create 오류");
        }
        conn.commit();
        close();
    }

    public static void main(String[] args) throws SQLException {
//        createT();
        //// 하나씩 주석해제하면 테스트 가능 ////////////////////////////////////////////////////////////////////////////////
//        createT();
        System.out.println(gameB());
//        truncateT();
//        dropT();

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

}
