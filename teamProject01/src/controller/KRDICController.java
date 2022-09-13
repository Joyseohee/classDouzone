package controller;

//게임 ai 추가 버전 + 점수추가

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;
import model.KRDICVO;

import java.sql.*;
import java.util.Scanner;

public class KRDICController { // controller

	// 연결, 삽입, 삭제, 수정, 검색,......
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static PreparedStatement pstmt = null;

	public static Connection getConn() {
		return conn;
	}

	public static void setConn(Connection conn) {
		KRDICController.conn = conn;
	}

	// connect
	public static void connect() {
		try {
			conn = ConnectionHelper.getConnection("oracle");
			stmt = conn.createStatement();
			conn.setAutoCommit(false); // 자동커밋 끄기
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// close
	public static void close() {
		try {
			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(pstmt);
			CloseHelper.close(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void game() throws SQLException { // 예외처리 위임
		KRDICVO vo = new KRDICVO();
		Scanner in = new Scanner(System.in);
		Statement st = conn.createStatement();
		while (true) {
			System.out.println("단어를 입력해주세요 :  0 입력시 종료");

			String word = in.next();
			if (word.charAt(0) == '0') {
				System.out.println("종료합니다.");
				return;
			} else {

				ResultSet r = st.executeQuery("SELECT * FROM " + vo.getClassName() + " where word= '" + word + "'");
				// 오답입니다.
				if (r.next() == false) {
					System.out.println("오답입니다.");
					return;
				} else {
					System.out.print("id \t word \t part\n");
					while (r.next()) {

						int id = r.getInt(1); // 인덱스 번호 넣은 것, or 필드명으로도 가능하다
						String word1 = r.getString(2);
						String part = r.getString(3);

						System.out.println(id + "\t" + word1 + "  \t" + part);
					}
				}

			}
		}

	}

	// 게임진행 함수용
	public static void game(String word) throws SQLException { // 예외처리 위임
		KRDICVO vo = new KRDICVO();
		Scanner in = new Scanner(System.in);
		Statement st = conn.createStatement();
		if (word.charAt(0) == '0') {
			System.out.println("종료합니다.");
			return;
		} else {

			ResultSet r = st.executeQuery("SELECT * FROM " + vo.getClassName() + " where word= '" + word + "'");
			// 오답입니다.
			if (r.next() == false) {
				System.out.println("오답입니다.");
				return;
			} else {
				System.out.print("id \t word \t part\n");
				while (r.next()) {
					int id = r.getInt(1); // 인덱스 번호 넣은 것, or 필드명으로도 가능하다
					String word1 = r.getString(2);
					String part = r.getString(3);
					System.out.println(id + "\t" + word1 + "  \t" + part);

				}
			}
		}

	}

	// 게임 ai 기초
	public static String gameAI(String word) throws SQLException { // 예외처리 위임
		KRDICVO vo = new KRDICVO();
		Statement st = conn.createStatement();

		char s = word.charAt(word.length() - 1);
		String word1 = "";
		ResultSet r = st.executeQuery("SELECT * FROM " + vo.getClassName() + " where word like '" + s + "%'");
		// 오답입니다.
		if (r.next() == false) {
			word1 = "{단어가 없습니다. 당신의 승리!!!}";
			return word1;
		} else {

			if (r.next()) {
				word1 = r.getString(2);
				return word1;
			}
			word1 = "[오류 입니다.]";
			return word1;
		}
	}

	// 게임 ai 연결 하나면 가능 같은 데베 공간을 공유하기 때문에 가능
	public static String progameAI(String word) throws SQLException { // 예외처리 위임
		KRDICVO vo = new KRDICVO();
		Statement st = conn.createStatement();

		char s = word.charAt(word.length() - 1);

		String word1 = "";
		ResultSet r = st.executeQuery(
				"select k.word from krdic k left outer join game1 g on k.word = g.gword where k.word like '" + s
						+ "_%'");
		// 오답입니다.
		if (r.next() == false) {
			word1 = "{단어가 없습니다. 당신의 승리!!!}";
			return word1;
		} else {

			if (r.next()) {
				word1 = r.getString(1);
				return word1;
			}
			word1 = "[오류 입니다.]";
			return word1;
		}
	}
	//랜덤함수로 ai에게 랜덤성 부여
	public static String progameAI2(String word) throws SQLException { // 예외처리 위임
		KRDICVO vo = new KRDICVO();
		Statement st = conn.createStatement();

		char s = word.charAt(word.length() - 1);
		int num = 0; // 받아오는 단어의 갯수
		String word1 = "";
		ResultSet r = st.executeQuery(
				"select k.word from krdic k left outer join game1 g on k.word = g.gword where k.word like '" + s
						+ "_%'");
		// 오답입니다.
		if (r.next() == false) {
			word1 = "{단어가 없습니다. 당신의 승리!!!}";
			return word1;
		} else {
			// 받아오는 단어의 갯수
			while (r.next()) {
				num += 1;
			}
			
			ResultSet r1 = st.executeQuery(
					"select k.word from krdic k left outer join game1 g on k.word = g.gword where k.word like '" + s
							+ "_%'");
			
			for (int i = 0; i <= (int) (Math.random() * num); i++) { //0부터 num까지중에서 랜덤으로 하나 골라서 진행
				if (r1.next())
					word1 = r1.getString(1);
			}
			return word1;
		}
	}
	
	

	// 유저의 점수를 가져오는 함수
	public static String getscore(String word) throws SQLException { // 예외처리 위임
		KRDICVO vo = new KRDICVO();
		Statement st = conn.createStatement();

		String word1 = "";
		ResultSet r = st.executeQuery("select score from guser where u_id = '" + word + "'");
		// 오답입니다.
		if (r.next() == false) {
			word1 = "null오류입니다";
			return word1;
		} else {
			word1 = r.getString(1);
			return word1;
		}
	}
	//점수 저장+ 점수에 따른 랭크 수정
	public static void setscore(String point,String id) throws SQLException { // 예외처리 위임
		KRDICVO vo = new KRDICVO();
		Statement st = conn.createStatement();

		ResultSet r = st.executeQuery("update guser set score="+ point+" where u_id = '"+ id +"'");
		//저장되었습니다
		System.out.println("저장되었습니다.");

	}

	// 게임진행 문자열 받으면 검색햇서 유무 알려줌
	public static boolean gamecheck(String word) throws SQLException { // 예외처리 위임
		KRDICVO vo = new KRDICVO();
		Scanner in = new Scanner(System.in);
		Statement st = conn.createStatement();
		if (word.charAt(0) == '0') {
			System.out.println("종료합니다.");
			return false;
		} else {

			ResultSet r = st.executeQuery("SELECT * FROM " + vo.getClassName() + " where word= '" + word + "'");
			// 오답입니다.
			if (r.next() == false) {
				System.out.println("오답입니다.");
				return false;
			} else {
				return true;
			}
		}
	}

	// menu
	public static void menu() throws SQLException { // 예외처리 위임
		KRDICVO vo = new KRDICVO();
		while (true) {
			System.out.println();

			ConnectionHelper.menu();//
			switch (sc.nextInt()) {
			case 0:
				System.out.println("Commit 하시겠습니까?(Y/N) ");
				System.out.println("안하시려면 Rollback 됩니다. ");
				if (sc.next().equalsIgnoreCase("Y")) {
					conn.commit(); // 예외발생
					selectAll(vo.getClassName());
				} else {
					conn.rollback();
					selectAll(vo.getClassName());
				}
				break;
			case 1:
				conn.commit();
				System.out.println("성공적으로 완료 되었습니다.");
				break;
			case 2:
				selectAll(vo.getClassName());
				break;
			case 3:
				selectAll2(vo.getClassName());
				break;
			case 4:
				selectByKRDICid(vo.getClassName());
				break;
			case 5:
				System.out.print("있는 단어 인지 단어 검색: ");
				selectByKRDICword(vo.getClassName());
				break;
			case 6:
				close();
				System.out.println("프로그램 종료합니다.!!");
				System.exit(0);
				break;

			default:
				System.out.println("없는 번호 선택 하셨습니다. 0~6, 9번 중에서 선택하세요.");
				break;
			} // end switch

		} // end while
	} // end menu

	// delete
	public static void selectByKRDICword(String className) throws SQLException {

		Scanner in = new Scanner(System.in);
		Statement st = conn.createStatement();
		String word = in.next();
		System.out.print("id \t word \t part\n");
		ResultSet r = st.executeQuery("SELECT * FROM " + className + " where word= '" + word + "'"); // ctrl + shift + x
																										// :
																										// 대문자로
		while (r.next()) {

			int id = r.getInt(1); // 인덱스 번호 넣은 것, or 필드명으로도 가능하다
			String word1 = r.getString(2);
			String part = r.getString(3);

			System.out.println(id + "\t" + word1 + "  \t" + part);

		}
	}

	// select ~ where
	private static void selectByKRDICid(String className) throws SQLException { //
		System.out.println("id로 검색 ");
		pstmt = conn.prepareStatement("select * from " + className + " where id = ? ");
		pstmt.setInt(1, sc.nextInt());
		rs = pstmt.executeQuery(); // 반환값 있는 경우

		ResultSetMetaData rsmd = rs.getMetaData();
		int count = rsmd.getColumnCount();

		while (rs.next()) {
			for (int i = 1; i <= count; i++) { // 각 타입별로 출력하기

				switch (rsmd.getColumnType(i)) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + "  ");
					break;
				case Types.FLOAT:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + "  ");
					break;
				case Types.DOUBLE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDouble(i) + "  ");
					break;
				case Types.CHAR:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + "  ");
					break;
				case Types.DATE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i) + "  ");
					break;
				default:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + "  ");
					break;
				} // switch end
			} // end for
			System.out.println();
		} // end while
	} // end selectByid

	// rollback
	public static void rollback() throws SQLException {
		conn.rollback();
		System.out.println("rollback success!!!");
	}

	// commit
	public static void commit() throws SQLException {
		conn.commit();
		System.out.println("commit success!!");
	}

	// select all
	public static void selectAll(String className) throws SQLException {

		rs = stmt.executeQuery("SELECT * FROM " + className); // 반환값 있는 경우

		ResultSetMetaData rsmd = rs.getMetaData();
		int count = rsmd.getColumnCount();

		while (rs.next()) {
			for (int i = 1; i <= count; i++) { // 각 타입별로 출력하기

				switch (rsmd.getColumnType(i)) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + "  ");
					break;
				case Types.FLOAT:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + "  ");
					break;
				case Types.DOUBLE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDouble(i) + "  ");
					break;
				case Types.CHAR:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + "  ");
					break;
				case Types.DATE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i) + "  ");
					break;
				default:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + "  ");
					break;
				} // switch end
			} // end for
			System.out.println();
		} // end while
	}

	// selectAll2
	public static void selectAll2(String className) throws SQLException { //
		Statement st = conn.createStatement();
		System.out.print("id \t word \t part\n");
		ResultSet r = st.executeQuery("SELECT * FROM " + className); // ctrl + shift + x : 대문자로

		while (r.next()) {
			int id = r.getInt(1); // 인덱스 번호 넣은 것, or 필드명으로도 가능하다
			String word = r.getString(2);
			String Part = r.getString(3);
			System.out.println(id + "\t" + word + "  \t" + Part);
		}
	}

}
