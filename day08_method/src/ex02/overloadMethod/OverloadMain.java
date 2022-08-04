package ex02.overloadMethod;

public class OverloadMain {
	public static void main(String[] args) {
		line();
		line("*");
		line("%", 30);
		line("%", 10, 20);
		
	}
	
	public static void line() {
		System.out.println("-------------------------");
		
	}
	
	public static void line(String str) {
		for (int i = 0; i < 20; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	public static void line(String str, int x) {
		for (int i = 0; i < x; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	public static void line(String str, int x, int y) {
		for (int i = x; i < y; i++) {
			System.out.print(str);
		}
		System.out.println();
	}

}
