package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.*;

public class MainEntry {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Driver load ... exception
//		Class.forName("oracle.jdbc.driver.OracleDriver");  //중간에 .driver은 생략 가능
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver load success!!");
		
		// 2. Connection & Open
			// driver:@ip:portNum:sid(or 전역데이트베이스명)
		String url = "jdbc:oracle:thin:@kosadb_high?TNS_ADMIN=/Users/joy/Applications/Oracle/Wallet_kosaDB";	// oracle db port number = 1521
		String uid = "user07";
		String pwd = "xxxxxxAt22cc";
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@kosadb_high?TNS_ADMIN=/Users/joy/Applications/Oracle/Wallet_kosaDB", "user07", "xxxxxxAt22cc");
		System.out.println("connection success!!");
		
		// 3. DML(DDL도 가능하지만 잘 쓰지 않음)
		
		
		// 4. CLOSE
		
	}
	//  SQL, Tag는 자바에서 문자열 취급한다.
}
