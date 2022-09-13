package test;
//끝말+사전+ 그게임에사용된단어인지

import controller.KRDICController;

import java.sql.SQLException;
import java.util.Scanner;

public class test3 {
	
	static Scanner sc = new Scanner(System.in);
	static test4 t4=new test4();
	
	
	public static void main(String[] args) throws SQLException {
		KRDICController.connect();  
		t4.connect();
		
		System.out.print("끝말있기 시작 첫단어는?: ");
		
		String a = sc.next();
		t4.game(a);
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
	
		
		if (a.charAt(a.length() - 1) == b.charAt(0) && KRDICController.gamecheck(b)==true && t4.gamecheck(b)==false) {//뒷말 앞말비교 + 사전에 있는 말인지
			t4.game(b);
			System.out.println(b.charAt(b.length() - 1)+": ");
			game(b);
		} else {
			System.out.println("오답");
			t4.truncateT();
		}
	}

}
