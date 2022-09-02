package ex02.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class MainEntry {

	public static Scanner sc = new Scanner(System.in);
	public static GiftSelect sel = new GiftSelect();
	public static GiftSelect2 sel2 = new GiftSelect2();
	public static GiftInsert ins = new GiftInsert();
	public static GiftUpdate upd = new GiftUpdate();
	public static GiftDelete del = new GiftDelete();
	public static String[] args;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		sql();
		System.out.println("계속하시겠습니까? y/n");
		char ans3 = sc.next().charAt(0);
		while (ans3 == 'y')
			sql();

	}

	public static void selectAll() throws ClassNotFoundException, SQLException {
		sel.main(args);
	}

	public static void selectByGno() throws ClassNotFoundException, SQLException {
		sel2.main(args);
	}

	private static void sql() throws ClassNotFoundException, SQLException {

		System.out.println("실행하실 명령을 입력해주세요***********");
		System.out.println("1. select 2. insert 3. update 4. delete");

		int ans = sc.nextInt();

		switch (ans) {
		case 1:
			System.out.println("전체를 출력하시겠습니까? y/n");
			char ans2 = sc.next().charAt(0);
			if (ans2 == 'y')
				selectAll();
			else
				selectByGno();
			break;
		case 2:
			ins.main(args);
			break;
		case 3:
			upd.main(args);
			break;
		case 4:
			del.main(args);
			break;
		}

	}

}
