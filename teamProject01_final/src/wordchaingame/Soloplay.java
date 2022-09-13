package wordchaingame;

import controller.GAMEDICController;
import controller.KRDICController3;

import java.sql.SQLException;
import java.util.Scanner;

//게임 ai 확인용
public class Soloplay {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		KRDICController3.connect();
		GAMEDICController.setConn(KRDICController3.getConn());

		String a="1";
		GAMEDICController.game(a);
		game(a);

	}

	public static void game(String a) throws SQLException {
		if(a=="1") {
			System.out.println("게임을 시작 합니다. 단어를 입력하시오: ");
			String b = sc.next();
			game(b);
		}
		
		String b = sc.next();
		// 서버에넣고 밑에서 비교

		if ((a.charAt(a.length() - 1) == b.charAt(0)) && (KRDICController3.gamecheck(b) == true)
				&& (GAMEDICController.gamecheck(b) == false)) {// 뒷말 앞말비교 + 사전에 있는 말인지
			GAMEDICController.game(b);

			System.out.print(b.charAt(b.length() - 1) + ": ");
			String ai = KRDICController3.progameAI2(b);
			System.out.println(ai);
			GAMEDICController.game(ai);

			game(ai);
		} else {
			if (a.charAt(a.length() - 1) != b.charAt(0)) {
				System.out.println("끝말 오류 lose");
			} else if (KRDICController3.gamecheck(b) == false) {
				System.out.println("사전 오류 lose");
			} else if (GAMEDICController.gamecheck(b) == true) {
				System.out.println("중복 오류 lose");
			} else {
				System.out.println("오류 발생");
			}
			System.out.println("오답");
			GAMEDICController.truncateT();
			return ;
		}
	}

}
