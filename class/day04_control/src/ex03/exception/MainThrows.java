package ex03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainThrows {
	public static void main(String[] args) throws Exception, ArithmeticException, InputMismatchException { // 예외 위임(Exception으로 퉁칠 수 있음)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개와 연산자를 입력해주세요.");
		int x = sc.nextInt(), y = sc.nextInt();
		int result = 0;
		result = x / y;		// 예외 발생
		
		System.out.println("\n" + x + " / "+ y + " = " + result);
	}
}
