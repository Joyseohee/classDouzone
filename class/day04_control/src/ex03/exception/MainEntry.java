/*

package ex03.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x, y = ");
		int x, y , result = 0;
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		if(y == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;										// 비정상 종료를 막고 제어권 넘김 
		}
		
		result = x / y;
		System.out.println("\n\nresult = " + result);
		
	}
}
//*/

/*

package ex03.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x, y = ");
		int x, y, result = 0;
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		try {
			result = x / y; 						// 문제 발생 소지가 있는 코드
			System.out.println("\n\nresult = " + result);
		} catch (Exception e) { 					// Exception은 클래스, e는 변수
//			System.out.println(e.getMessage());
//			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();					// 
			
		} 											// try end
	}
}
//*/


//*

package ex03.exception;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x, y = ");
		int x, y, result = 0;
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		try {												// try문은 1개
			result = x / y; // 문제 발생 소지가 있는 코드
			System.out.println("result = " + result);
		} catch (ArithmeticException e) {					// catch문은 여러개
			System.out.println("ArithmeticException ");
		} catch (MissingFormatArgumentException e) {		// err1: 산술 문제
			System.out.println("MissingFormatArgumentException ");
		} catch (Exception e) {
			System.out.println("Exception ");
		} finally {
			System.out.println("무조건 실행됨");
		}
	}
}
//*/











