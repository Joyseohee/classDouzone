package quiz;

import java.util.Scanner;

// 문제1] info(){이름, 연락처, 주소 출력 함수}
// 문제2] abc(int x) {절대값 출력하는 함}
// 문제3] max() {두개 정수 입력받아서 큰 수 리턴하는 함}
// 문제4] add(x,y), sub(-), mul(*), div(/)
// sub(-) mul(*) 리턴타입
// /는 0으로 나누지 않게 예외처리

public class QuizEx01 {
	private static Scanner sc;

	public static void main(String[] args) {
		abs(-9);							// 문제2
		System.out.println(max(4, 4));		// 문제3
		info();								// 문제1
	}
	
	// quiz01
	public static void info() {
		sc = new Scanner(System.in);
		System.out.println("당신의 이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("당신의 연락처를 입력하세요");
		String num = sc.nextLine();
		System.out.println("당신의 주소를 입력하세요");
		String add = sc.nextLine();
		
		System.out.println("이름 : " + name + ", 전화번호 : " + num + ", 주소 : " + add);
	}
	
	// quiz02
	public static void abs(int x) {
		int y;
		if (x < 0) y = - x;
		else y = x;
		
		System.out.println(x + "의 절대값은 " + y + "입니다.");
	}
	
	// quiz03
	public static int max(int x, int y) {
		int z = 0;
		if(x < y) z = y;
		else if(x > y) z = x;
		
		return z;
	}
}
