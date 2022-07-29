package ex03.operator;

public class MainEntry {
	public static void main(String[] args) {
		int x = 10, y = 10;
		int gob = x * y;
		
		System.out.println(" x * y = " + gob);
		System.out.println(x + " * " + y + " = " + gob);
		
		System.out.println(" x * y = " + (y * x));
		System.out.println("\n\n 3 + 4 * 5 = " + (3 + 4 * 5));
		System.out.println("(3 + 4) * 5 = " + ((3 + 4) * 5));
		
		// integer (+, -, *, /, %, ...)	: operate integers might be return with integer.
		System.out.println();
		System.out.println("\n7 / 3 = " + (7 / 3));	// 2, result
		System.out.println("7 % 3 = " + (7 % 3));		// 1, remain
		
		// float						: operate float might be return with float
		System.out.println("\n7 / 3.0 = " + (7. / 3));	// 2, result
		System.out.println("7 % 3.0 = " + (7. % 3));		// 1, remain
	}
}

/*
public class MainEntry {
public static void main(String[] args) {
	// 단항연산자 : 증감 ++, --, ~, ...
	int x = 10, y;
//	y = x++;			// 후위 연산 : 대입 먼저, 연산 나중
//	y = ++x;			// 전위 연산 : 연산 먼저, 대입 나중
	
	y = 10;
	y += 1;
	
	
	System.out.println("x = " + x + "\ty = " + y);
	
}
}
//*/

/*
int x = 128, y;
y = ~x;			// 비트 부정	 '-(원래값 + 1)'이 되는 연산

System.out.println("x = " + x + "\ty = " + y);
// */


