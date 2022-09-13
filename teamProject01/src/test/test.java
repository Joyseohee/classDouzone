package test;
//끝말비교 코드
import java.util.Scanner;

public class test {
	static Scanner sc = new Scanner(System.in);
	static int Point = 0;

	public static void main(String[] args) {
		Point += 10;
		System.out.print("끝말있기 시작 첫단어는?: ");
		String a = sc.next();
		System.out.println("2번째 단어: ");
		String b = sc.next();

		if (a.charAt(a.length() - 1) == b.charAt(0)) {
			System.out.println("다음:" + b.charAt(b.length() - 1));
			System.out.println(Point);
			game(b);

		} else
			System.out.println("오답");

	}

	public static void game(String a) {
		Point += 10;
		System.out.println(Point);
		String b = sc.next();
		if (a.charAt(a.length() - 1) == b.charAt(0)) {
			System.out.println(b.charAt(b.length() - 1) + ": ");
			game(b);
		} else {
			System.out.println("오답");
			
			b = Integer.toString(Point);
			System.out.println(b);
		
		}
	}

}
