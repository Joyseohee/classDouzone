package test;
//game내 사용 단어 검색용 컨트롤러
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;

public class test4 {

	// 멤버 변수
	private static Scanner sc = new Scanner(System.in);
	private static Statement st;
	private static ResultSet rs;
	private static Connection conn;
	private static PreparedStatement pst;

	// 단어 db
	public final String ClassName = "GAME1";
	private static String GWORD;
	private static String sql;

	// db 연결
	public static void connect() {
		try {
			conn = ConnectionHelper.getConnection("oracle");
			st = conn.createStatement();
			conn.setAutoCommit(true);
		} catch (Exception var1) {
			System.out.println("연결유실");
		}
	}
//없으면 false 있으면 true
	public static boolean gamecheck(String s) throws SQLException {
		connect();
		Statement st = conn.createStatement();
		ResultSet r = st.executeQuery("SELECT * FROM GAME1 where GWORD = '" + s + "'");
		if (r.next() == true) {
			return true;
		} else { // 중복 있음
			return false;
		}
	}
	
	
	
	public static boolean gameB() throws SQLException {
		connect();
		GWORD = sc.next();
		Statement st = conn.createStatement();
		ResultSet r = st.executeQuery("SELECT * FROM GAME1 where GWORD = '" + GWORD + "'");

		if (r.next() == false) { // 중복 없음
			sql = "INSERT INTO GAME(GWORD) VALUES( ? )";
			pst = conn.prepareStatement(sql);
			pst.setString(1, GWORD);
			pst.executeUpdate();
			return true;
		} else { // 중복 있음
			return false;
		}
	}

	public static boolean game(String s) throws SQLException {
		connect();
		try {
			// 중복단어 없을 경우
			sql = "INSERT INTO GAME1(GWORD) VALUES( ? )";
			pst = conn.prepareStatement(sql);
			pst.setString(1, s);
			pst.executeUpdate();
			close();
			return true;
		} catch (Exception e) {
			close();
			return false;
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
		GWORD = sc.next();
		int count = 3;

		try {
			// 중복단어 없을 경우

			sql = "INSERT INTO GAME1(GWORD) VALUES( ? )";
			pst = conn.prepareStatement(sql);
			pst.setString(1, GWORD);
			pst.executeUpdate();

			System.out.println("게임을 계속합니다.");

		} catch (Exception e) {
			// 중복된 단어가 있을 경우
			System.out.println("단어가 중복됐습니다.");
//            count--;

//             game();  // 주석해제 시 무한 반복
//             if(count == 0) return;

		}

		close();
	}

	// 테이블 삭제
	// @drop 함수 : 테이블 완전 삭제
	public static void dropT() throws SQLException {
		connect();
		try {
			sql = "DROP TABLE GAME1";
			pst = conn.prepareStatement(sql);
			pst.executeUpdate(sql);
			System.out.println("테이블이 drop 되었습니다.");
		} catch (Exception e) {
			System.out.println("게임을 계속할 수 없습니다 ***** 테이블 drop 오류");
		}

		close();
	}

	// @truncate 함수 : 테이블 구조는 남겨두고 레코드만 삭제
	public static void truncateT() throws SQLException {
		connect();
		try {
			sql = "TRUNCATE TABLE GAME1";
			pst = conn.prepareStatement(sql);
			pst.executeUpdate(sql);
			System.out.println("테이블이 truncate 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("게임을 계속할 수 없습니다 ***** 테이블 truncate 오류");
		}

		close();
	}

	// 테이블 생성
	// create table
	public static void createT() throws SQLException {
		connect();
		try {
			sql = "CREATE TABLE \"GAME1\" (\n" + "    GWORD VARCHAR2(30)\n"
					+ "        CONSTRAINT \"GW_NULL1\" CHECK(\"GWORD\" IS NOT NULL)\n"
					+ "        CONSTRAINT \"RE_GWORD1\" CHECK (REGEXP_LIKE(GWORD, '^[가-힣]{2,6}'))\n" + ")";
			pst = conn.prepareStatement(sql);
			pst.executeUpdate(sql);
			System.out.println("테이블이 create 되었습니다.");
		} catch (Exception e) {
			System.out.println("게임을 계속할 수 없습니다 ***** 테이블 create 오류");
			e.printStackTrace();
		}

		close();
	}

	public static void main(String[] args) throws SQLException {
		connect();

		//// 하나씩 주석해제하면 테스트 가능
		//// ////////////////////////////////////////////////////////////////////////////////
//		System.out.println(game("사자"));
        truncateT();
//        dropT();
//        createT();
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		close();
	}

}
