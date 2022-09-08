package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GiftInsert2 {

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
//		Scanner sc = new Scanner(System.in);
		String sql = "INSERT INTO GIFT VALUES( ?, ?, ?, ? )";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1,  20);
		pst.setString(2, "사탕");
		pst.setInt(3,  2000);
		pst.setInt(4,  2500);
//		pst.executeUpdate();	// 반환값이 없는 경우 - insert, update, delete
		
		int result = pst.executeUpdate();	// 반드시 해줘야 들어감(int에 담진 않아도 됨)
		System.out.println(result + " 개 데이터 추가 성공");
		
		// 4. CLOSE
		pst.close();
		conn.close();

	}

}
