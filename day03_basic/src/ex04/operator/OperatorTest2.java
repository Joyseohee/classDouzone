//*/
package ex04.operator;

//최단산쉬관논삼대콤
public class OperatorTest2 {
	public static void main(String[] args) {
		// 대입(배정)연산자 : =, +=, -=, >>=, <<=, /=, *=, %=, ...
		int x = 3, y = 5, result;
		result = x + y ;
		System.out.println(result);
		
//		x = x + y;
//		System.out.println(x);
//		x += y;
//		System.out.println(x);
		
		x *= y;
		System.out.println(x);
	}
}
//*/

/*
package ex04.operator;

//최단산쉬관논삼대콤
public class OperatorTest2 {
	public static void main(String[] args) {
		// 삼항(조건) 연산자 : (조건) ? (참) : (거짓)
		int x = 20, y = 10;
		String msg = null;	// 초기화 : msg = "";
		
		msg = ( x != y ) ? "not same" : "same";
		System.out.println(msg);
		
		int a = 10, b = 20, c = 30, result;
		result = ( a > b ) ? a : 
								( b > c ) ? b : c;		// 연산 보기 편하게 내려서 표기하기도
		System.out.println(result);
	}
}
//*/