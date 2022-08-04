package ex01.method;

public class MethodTest {
	
	public static int iShow() {
		int su = 200;
//		return 100;
//		return su;
		return su + 99;
	}
	
	public static void main(String[] args) {
		System.out.println(iShow());
		
		// expression
		System.out.println(Show());
		String b = Show();
		System.out.println(b);
		
		// expression		
		System.out.println(plus(5, 6));
		int c = plus(5,6);
		System.out.println(c);
		
		System.out.println(add(3, 7));
	}
	
	// @ parameter x & return type o
	public static String Show() {
		String a = "박서희";
		return a;
	}
	
	// @ parameter o & return type o
	public static int plus(int x,int y) {
		return x + y;
		// int hap = x + y; return hap; 도 가능
	}
	
	// @ return type != parameter type
	public static double add(int x,int y) {	// 리턴되는 타입으로 형변환된다.
		return x + y;
	}
}
