package quiz;

import java.util.Scanner;

//문제4] add(x,y), sub(-), mul(*), div(/)
//sub(-) mul(*) 리턴타입
///는 0으로 나누지 않게 예외처리


public class QuizEx04 {
	private static Scanner sc;
	
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(add(a, b));
		System.out.println(sub(a, b));
		System.out.println(mul(a, b));
		div(a, b);
	}
	
	public static int add(int x, int y) {
		int z = x + y;
		return z;
	}
	public static int sub(int x, int y) {
		int z = x - y;
		return z;
	}
	public static int mul(int x, int y) {
		int z = x * y;
		return z;
	}
//	public static String div(int x, double y) {
//		if(y != 0) {
//			double z = x / y;
//			return Double.toString(z);
//		} else return "0이 아닌 수를 입력하세요";
//	}
	
	public static void div(int x, double y) {
		try {
			double z = x / y;
			System.out.println(z);
		} catch(Exception e) {System.out.println("0이 아닌 수를 입력하세요");}
	}
}
