
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

public class Quiz03 {
	public static void main(String[] args) {
		
		System.out.println("숫자 2개와 사칙연산자를 순서대로 입력해주세요.");
		
		// 입력 받기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		char op = sc.next().charAt(0);
		
		// 연산자에 따른 출력
		if(op == '+') System.out.println(a + " + " + b + " = " + (a + b));
		else if(op == '-') System.out.println(a + " - " + b + " = " + (a - b));
		else if(op == '*') System.out.println(a + " * " + b + " = " + (a * b));
		else if(op == '/') System.out.println(a + " / " + b + " = " + (float)(a / b));
		else System.out.println("숫자 2개와 사칙연산자를 순서대로 입력해주세요.");	// 예외 처리
		
	}

}


/*
// 연산자에 따른 출력
		int opr = (int)op;
		
		if(op == 43) System.out.println(a + " + " + b + " = " + (a + b));
		else if(op == 45) System.out.println(a + " - " + b + " = " + (a - b));
		else if(op == 42) System.out.println(a + " * " + b + " = " + (a * b));
		else if(op == 47) System.out.println(a + " / " + b + " = " + (float)(a / b));
		else System.out.println("숫자 2개와 사칙연산자를 순서대로 입력해주세요.");	// 예외 처리
//*/