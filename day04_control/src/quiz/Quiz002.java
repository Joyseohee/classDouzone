
/* 문제2] 사칙연산 프로그램 작성(예외처리)
 * 숫자 2개 입력 받고, 연산자(+, -, *, /) 1개 입력 받아서
 * 
 * 3
 * 5
 * +
 * 
 * result> 3 + 5 = 8
 */


package quiz;

import java.util.Scanner;

public class Quiz002 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	/*
		// @ String으로 받는 방법
		System.out.println("x, y = ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = 0;
		
		System.out.println("op(+, -, *, /) = ");
		String op = sc.next();
		
		if(op.equals("+")) result = x + y;
		else if(op.equals("-")) result = x - y;
		else if(op.equals("*")) result = x * y;
		else if(op.equals("/")) result = x / y;
		else System.out.println("숫자 2개와 사칙연산자를 순서대로 입력해주세요.");	// 예외 처리
			
		System.out.println("\n" + x + op + y + " = " + result);
				
		//*/
		
		/*
		// @ char로 받는 방법1 : 바로 출력
		// 입력 받기

		int a = sc.nextInt(), b = sc.nextInt();
		char op = sc.next().charAt(0);
		int result = 0;
		
		// 연산자에 따른 출력
		if(op == '+') System.out.println(a + " + " + b + " = " + (a + b));
		else if(op == '-') System.out.println(a + " - " + b + " = " + (a - b));
		else if(op == '*') System.out.println(a + " * " + b + " = " + (a * b));
		else if(op == '/') System.out.println(a + " / " + b + " = " + (float)(a / b));
		else System.out.println("숫자 2개와 사칙연산자를 순서대로 입력해주세요.");	// 예외 처리
		
		//*/
		
		//*
		// @ char로 받는 방법2 : result 받아서 출력
		
		try {
			System.out.println("숫자 2개와 연산자를 입력해주세요.");
			int x = sc.nextInt(), y = sc.nextInt();
			char op = sc.next().charAt(0);
			int result = 0;

			// 연산자에 따른 출력
			if (op == '+')
				result = x + y;
			else if (op == '-')
				result = x - y;
			else if (op == '*')
				result = x * y;
			else if (op == '/')
				result = x / y;

			System.out.println("\n" + x + op + y + " = " + result);
			// */
		} catch (ArithmeticException e) { // catch문은 여러개
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}

