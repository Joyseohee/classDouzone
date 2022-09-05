package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GiftInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {	// 예외처리 위임
		// 1. Driver load ... exception
		Class.forName("oracle.jdbc.driver.OracleDriver");	// 예외발생
		System.out.println("driver load success!!");
		
		// 2. Connection & Open
			// driver:@ip:portNum:sid(or 전역데이트베이스명)
		String url = "jdbc:oracle:thin:@kosaDB_high?TNS_ADMIN=/Users/joy/Applications/Oracle/Wallet_kosaDB";
		String uid = "user07";
		String pwd = "xxxxxxAt22cc";
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);	// 예외발생
		System.out.println("CONNECTION SUCCESS!!");
		
		// 3. DML(insert)
		Statement st = conn.createStatement();
		//insert into gift values(11, '종합과자', 1000, 20000);
		System.out.println("insert할 데이터를 입력하세요. *gno, gname, g_start, g_end 순으로 입력");
		
		Scanner sc = new Scanner(System.in);
//		String sql = "INSERT INTO GIFT VALUES(12, '스팸2', 3000, 5000)";
		String sql = "INSERT INTO GIFT VALUES(" + sc.nextInt() + ", '" + sc.next() + "', " + sc.nextInt() + ", " + sc.nextInt() + ")";
		System.out.println(sql);
		int result = st.executeUpdate(sql);
		System.out.println(result + " 개 데이터 추가 성공");
		
		// 4. CLOSE
		st.close();
		conn.close();

	}

}
