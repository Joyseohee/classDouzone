package ex04.Switch;

import java.util.Scanner;

public class MainSwitch {
	public static Scanner sc;		// 전역변수 처리하면 누수 없어짐
	
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요 (s, d, b, j) = ");
		sc = new Scanner(System.in);
		char city = sc.next().charAt(0);
		
		switch (city) {
		case 's':
			System.out.print("서울");
			break;
		case 'd':
			System.out.print("대구");
			break;
		case 'b':
			System.out.print("부산");
			break;
		case 'j':
			System.out.print("제주");
			break;
		default:
			System.out.println("문자를 잘못 입력하셨습니다.  s, d, b, j 중에서만 입력하세요");
			System.exit(0);	// 강제 종료
		}
		
		System.out.println("을/를 선택하셨습니다.");
	}
}
