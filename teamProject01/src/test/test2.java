package test;
//끝말비교 코드+ 사전에 있는 말인지

import controller.KRDICController;

import java.sql.SQLException;
import java.util.Scanner;

public class test2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		KRDICController.connect();  
		System.out.print("끝말있기 시작 첫단어는?: ");
		String a = sc.next();
		System.out.println("2번째 단어: ");
		String b = sc.next();

		if (a.charAt(a.length() - 1) == b.charAt(0)) {
			System.out.println("다음:" + b.charAt(b.length() - 1));
			game(b);
		} else
			System.out.println("오답");

	}

	public static void game(String a) throws SQLException {
		String b = sc.next();
		//서버에넣고 및에서 비교
		
		
		if (a.charAt(a.length() - 1) == b.charAt(0) && KRDICController.gamecheck(b)==true) {//뒷말 앞말비교 + 사전에 있는 말인지
			System.out.println(b.charAt(b.length() - 1)+": ");
			game(b);
		} else
			System.out.println("오답");

	}

}
