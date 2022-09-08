package ex02.jdbc;

import java.sql.*;
import java.util.Scanner;

public class GiftSelect2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException { // 예외처리 위임
		// 1. Driver load ... exception
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 예외발생
		System.out.println("DRIVER LOAD SUCCESS!!");

		// 2. Connection & Open
		// driver:@ip:portNum:sid(or 전역데이트베이스명)
		String url = "jdbc:oracle:thin:@kosaDB_high?TNS_ADMIN=/Users/joy/Applications/Oracle/Wallet_kosaDB";
		String uid = "user07";
		String pwd = "xxxxxxAt22cc";

		Connection conn = DriverManager.getConnection(url, uid, pwd); // 예외발생
		System.out.println("CONNECTION SUCCESS!!");

		// 3. DML(select)
		System.out.println("출력할 상품의 gno을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int pick = sc.nextInt();

		Statement st = conn.createStatement();
		ResultSet r = st.executeQuery("SELECT * FROM GIFT ORDER BY GNO"); // ctrl + shift + x : 대문자로

		System.out.print("상품번호\t상품명\t\t최저가\t최고가\n");

		while (r.next()) {
			int gno = r.getInt(1); // 인덱스 번호 넣은 것, or 필드명으로도 가능하다
			if (gno == pick) {
				String gname = r.getString(2);
				int g_s = r.getInt(3);
				int g_e = r.getInt(4);

				System.out.println(gno + "    \t" + gname + "    \t" + g_s + "\t" + g_e);
				break;
			}
		}

		// 4. CLOSE
		r.close();
		st.close();
		conn.close();

	}

}
