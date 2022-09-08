package ex01.scanner;

public class InputTest {
	public static void main(String[] args) {
//		System.out.println("string, int = ");
//		
//		if( args.length == 0 ) {
//			System.out.println("데이터를 입력하세요");
//			return;
//		}
//		
		String str = args[0];
		int su = Integer.parseInt(args[1]);
		
//		String strSu = args[1];
//		int num = Integer.parseInt(strSu);
		
		System.out.println(str);
		System.out.println(su + 33);
	}
}
