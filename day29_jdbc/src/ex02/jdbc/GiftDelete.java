package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GiftDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// gno로 삭제하기 - delete
		// 1. Driver load ... exception
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 예외발생
		System.out.println("driver load success!!");

		// 2. Connection & Open
		String url = "jdbc:oracle:thin:@kosaDB_high?TNS_ADMIN=C:/Oracle/Wallet_kosaDB"; // oracle db port number = 1521
		String uid = "user07";
		String pwd = "xxxxxxAt22cc";

		Connection conn = DriverManager.getConnection(url, uid, pwd); // 예외발생
		System.out.println("CONNECTION SUCCESS!!");

		// 3. DML(delete)
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 선물의 번호를 입력해주세요");
		int pick = sc.nextInt();
		
		String sql = "DELETE gift WHERE GNO = " + pick;
		PreparedStatement pst = conn.prepareStatement(sql);

		int result = pst.executeUpdate(); // 반드시 해줘야 들어감(int에 담진 않아도 됨)
		System.out.println(result + " 개 데이터 삭제 성공");

		// 4. CLOSE
		pst.close();
		conn.close();

	}

}
