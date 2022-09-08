package ex04.operator;

//최단산쉬관논삼대콤
public class OperatorTest {
	public static void main(String[] args) {
		// 삼항연산자
		
		int x = 10, y = 20, z= 30;
		boolean result = true;
		
		result = ( x > y ) && ( y > z );		// && 연산은 앞이 거짓이면 뒤의 연산은 수행하지 않음
		System.out.println("&& : " + result);	// 거짓을 앞으로 당겨서 구현하면 좋다
		
		result = ( x < y ) && ( y < z );		// && 연산은 앞 뒤 모두 true여야 true를 리턴
		System.out.println("&& : " + result);
		
		result = ( x < y ) || ( y > z );		// || 연산은 앞이 참이면 뒤의 연산은 수행하지 않음
		System.out.println("|| : " + result);	// 참을 앞으로 당겨서 구현하면 좋다
		System.out.println("! : " + !result);	
	}
}



/*
package ex04.operator;



//최단산쉬관논삼대콤
public class OperatorTest {
	public static void main(String[] args) {
		// 논리연산자 : &&, ||, ! - 10진 논리 ==> 결과 : 참, 거짓
		
		int x = 10, y = 20, z= 30;
		boolean result = true;
		
		result = ( x > y ) && ( y > z );		// && 연산은 앞이 거짓이면 뒤의 연산은 수행하지 않음
		System.out.println("&& : " + result);	// 거짓을 앞으로 당겨서 구현하면 좋다
		
		result = ( x < y ) && ( y < z );		// && 연산은 앞 뒤 모두 true여야 true를 리턴
		System.out.println("&& : " + result);
		
		result = ( x < y ) || ( y > z );		// || 연산은 앞이 참이면 뒤의 연산은 수행하지 않음
		System.out.println("|| : " + result);	// 참을 앞으로 당겨서 구현하면 좋다
		System.out.println("! : " + !result);	
	}
}
//*/

/*
package ex04.operator;



//최단산쉬관논삼대콤
public class OperatorTest {
	public static void main(String[] args) {
		// 논리연산자 : &, |, ^ - 2진 논리 ==> 결과 : 값
		int a = 4, b = 7;
		System.out.println( a & b );
		System.out.println( a | b );
		System.out.println( a ^ b );
	}
}
//*/


/*

package ex04.operator;



//최단산쉬관논삼대콤
public class OperatorTest {
	public static void main(String[] args) {
		// 관계 연산자 : >, <, >=, <=, ==, !=
		int x = 5, y = 3;
		boolean flag = true;
		System.out.println(!flag);
		
		if( x != y ) {
			System.out.println("max x : " + x);
			System.out.println("same");
		} else {
			System.out.println("max y : " + y);
			System.out.println("not same");
		}
		
	}
}
//*/
